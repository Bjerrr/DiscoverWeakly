// $(document).ready(function () {
//     alert("Hello, jQuery!");
//   });

//   $.ajax(
//     {
//       method: "POST",
//       url: "https://accounts.spotify.com/api/token",
//       data: {
//         "grant_type":    "authorization_code",
//         "code":          code,
//         "redirect_uri":  myurl,
//         "client_secret": "055357cd09d949afa6a749137aa8c1db",
//         "client_id":     "166d1fa034fd47aabea44fd824a9987c",
//       },
//       success: function(result) {
//         var accessToken = result;
//       },
//     }
//   );

// var accessToken = "XXXXX";
// $.ajax({
//     url: 'https://api.spotify.com/v1/browse/new-releases',
//     type: 'GET',
//     headers: {
//         'Authorization' : 'Bearer ' + accessToken
//     },
//     success: function(data) {
//         console.log(data);
//     }
// });