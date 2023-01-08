function getSuggestions(event) {

  var query = $(event.target).val();

  $.ajax({
    url: "http://localhost:8080/suggestion?query=" + query,
    contentType: "application/json",
    dataType: 'json',
    success: function(result){

      $(event.target).next().empty();

      result.forEach(function(item) {
        var suggestion = $('<p>').text(item).addClass('suggestion');
        $(event.target).next().append(suggestion);
      });
      $('.suggestion').on('click', function() {
        var suggestion = $(this).text();
        $(event.target).val(suggestion);
        $(event.target).next().empty();
      });
    },
    error: function(error){
      console.error(error);
    }
  });
}

$(document).ready(function() {
    $('#loginBtn').click(function() {
      window.location = 'http://localhost:8080/authorize_redirect';
    });

    $('#searchBox').on('submit', function(event) {
      event.preventDefault();
      getPlaylist();
    });
    
    $('#originCity').on('keyup', getSuggestions);
    $('#destinationCity').on('keyup', getSuggestions);


    function checkInputFields() {
      const originInput = $('#originCity');
      const destinationInput = $('#destinationCity');

      if (originInput.val() === '' || destinationInput.val() === '') {
        if ($('#searchBox p').length === 0) {
          const message = $('<p>Båda fälten måste fyllas i!</p>');
          $('#searchBox').prepend(message);
        }
        return false;
      } else {
        return true;
      }
    }

    $('#searchBox').submit(function(event) {
      event.preventDefault();

      $('#searchBox p').remove();

      if (!checkInputFields()) {
        return false;
      }
    });
});

function toMilliseconds(timeString) {
  var parts = timeString.split(':');
  var hours = parseInt(parts[0]);
  var minutes = parseInt(parts[1]);
  var seconds = parseInt(parts[2]);
  return (hours * 3600 + minutes * 60 + seconds) * 1000;
}

function getPlaylist() {
  var origin = $('#originCity').val();
  var destination = $('#destinationCity').val();

  $.ajax({
    url: "http://localhost:8080/prettyTrip?origin=" + origin + "&destination=" + destination,
    contentType: "application/json",
    dataType: 'json',
    success: function(data){
        console.log(data)
        $('.tripInfo').empty();
        $('.stops').empty();
        var head = $('<h2>').text('Din Resa');
        $('.tripInfo').append(head);
        var trip = $('<p>').text('Från ' + data.origin + ' till ' + data.destination);
        $('.tripInfo').append(trip);
        var head2 = $('<p>').text('Byten:');
        $('.tripInfo').append(head2);
        var journey = data.journey
        journey.forEach(function(item) {
            var item = $('<p>').text('- ' + item.destination);
            $('.tripInfo').append(item);
        });
        var tripTime = $('<p>').text('Total restid: ' + data.travelTime);
        $('.tripInfo').append(tripTime);

        var duration = data.travelTime
        var duration_ms = toMilliseconds(duration);

          $.ajax({
              url: "http://localhost:8080/playlist?duration_ms=" + duration_ms,
              contentType: "application/json",
              dataType: 'json',
              success: function(result){
                  console.log(result)
                $('.results').empty();
                  var header = $('<h2>').text('Din spellista');
                  $('.results').append(header);
                  result.forEach(function(item) {
                    var item = $('<a>').attr('href', item.url).attr('target', '_blank').text(item.name).addClass('result-item');
                    $('.results').append(item);
                  });
              },
              error: function(error){
                console.error(error);
              }
            });
    },
    error: function(error){
      console.error(error);
    }
  });
}