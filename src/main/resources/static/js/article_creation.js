$(document).ready(function(){

$('#create-article-btn').click(function () {


    let article = {
        title: "title",
        content: "content"
    }

    $.ajax({
        url: './',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(article),
        success: function () {
            window.location = '/home';
        },
        error: function (xhr) {
            window.location = '/home';
        },
        complete: function () {
            window.location = '/home';
        }
    });
});

});