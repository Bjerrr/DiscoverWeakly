function getSuggestions(event) {

  var query = $(event.target).val();

  query = query[0].toUpperCase() + query.slice(1).toLowerCase();

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



function getPlaylist() {
  var origin = $('#originCity').val();
  var destination = $('#destinationCity').val();

  $.ajax({
    url: "http://localhost:8080/playlist?origin=" + origin + "&destination=" + destination,
    contentType: "application/json",
    dataType: 'json',
    success: function(result){

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
}