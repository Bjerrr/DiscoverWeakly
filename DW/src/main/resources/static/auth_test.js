$(document).ready(function() {
    console.log("CUSTOM CODE LETS GO");

    // CHECK IF WE HAVE A CODE!
    let searchParams = new URLSearchParams(window.location.search);
    if (searchParams.has("code")) {
        var code = searchParams.get("code");
        var postUrl = "http://localhost:8080/authorize";
        postUrl += "?code=" + code;

        $.ajax({
              method: "POST",
              url: postUrl,

              success: function(result){
                console.log(result)
                window.alert("success! - here we should update html stuff, hide the login button..");
              },
              error: function(error){
                console.error(error);
              }
        });
    }
});