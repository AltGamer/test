$(document).ready(function(){

$('#create-category-btn').click(function () {
    let category = {
        name: $('#category-name').val()
    }

    $.ajax({
        url: '',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(category),
        success: function () {
            window.location = '/categories';
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