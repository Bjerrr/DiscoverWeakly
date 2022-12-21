$(function(){
    $('#search').click(function(event){
        event.preventDefault();
        var origin = $('#origin').val();
        var destination = $('#destination').val();
        console.log(origin, destination);
        source : function(request, response) {
            $.ajax({
                url : "http://localhost:8080/prettyTrip",
                dataType : "json",
                data : {
                    q : request.term
                },
                success : function(data) {
                    //alert(data);
                    console.log(data);
                    response(data);
                }
            });
        },
        minLength : 2


    })
});








