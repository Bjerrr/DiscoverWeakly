function getSuggestions(event) {
    // Get the value of the input field
    var query = $(event.target).val();

    // Convert the query to have the first letter in uppercase and the rest in lowercase
    query = query[0].toUpperCase() + query.slice(1).toLowerCase();

    // Make an HTTP GET request to the /suggestion endpoint, passing the query as a parameter
    $.ajax({
      url: "http://localhost:8080/suggestion?query=" + query,
      contentType: "application/json",
      dataType: 'json',
      success: function(result){
        // Clear the content of the suggestions element
        $(event.target).next().empty();
        // Iterate over the result array
        result.forEach(function(item) {
          // Create a new div element for each item in the result array
          var suggestion = $('<p>').text(item).addClass('suggestion');
          // Append the new div element to the suggestions element
          $(event.target).next().append(suggestion);
        });
        // When the user clicks on a suggestion
        $('.suggestion').on('click', function() {
          // Get the value of the clicked suggestion
          var suggestion = $(this).text();
          // Set the value of the input field to the suggestion
          $(event.target).val(suggestion);
          // Clear the content of the suggestions element
          $(event.target).next().empty();
        });
      },
      error: function(error){
        console.error(error);
      }
    });
  }


  $(document).ready(function() {
      // When the form is submitted
      $('#searchBox').on('submit', function(event) {
        // Prevent the form from submitting (default action)
        event.preventDefault();
        // Call the getPlaylist function
        getPlaylist();
      });
      $('#originCity').on('keyup', getSuggestions);
      $('#destinationCity').on('keyup', getSuggestions);


      function checkInputFields() {
        const originInput = $('#originCity');
        const destinationInput = $('#destinationCity');

        if (originInput.val() === '' || destinationInput.val() === '') {
          // one of the input fields is empty
          if ($('#searchBox p').length === 0) {
            // message has not yet been inserted
            const message = $('<p>Båda fälten måste fyllas i!</p>');
            $('#searchBox').prepend(message); // insert the message as the first child of the form element
          }
          return false;
        } else {
          // both input fields are filled, return true to allow the form to be submitted
          return true;
        }
      }

      $('#searchBox').submit(function(event) {
        event.preventDefault(); // prevent the form from being submitted by default

        $('#searchBox p').remove(); // remove the message element

        if (!checkInputFields()) {
          // both input fields are not filled, prevent the form from being submitted
          return false;
        }
      });
  });

  function getPlaylist() {
    // Get the values of the origin and destination input fields
    var origin = $('#originCity').val();
    var destination = $('#destinationCity').val();
    console.log(origin)
    console.log(destination)
    // Make an HTTP GET request to the /playlist endpoint, passing the origin and destination as query parameters
    $.ajax({
      url: "http://localhost:8080/playlist?origin=" + origin + "&destination=" + destination,
      contentType: "application/json",
      dataType: 'json',
      success: function(result){
        // Clear the content of the "playlist" element
        $('#playlist').empty();
        // Iterate over the result array
        result.forEach(function(item) {
          // Create a new list item for each item in the result array
          var listItem = $('<p>').text(item);
          // Append the new list item to the list
          $('#playlist').append(listItem);
        });
      },
      error: function(error){
        console.error(error);
      }
    });
  }