$(document).ready(function(){

$('#create-category-btn').click(function () {
    let category = {
        name: $('#category-name').val()
    }

    $.ajax({
        url: './create',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(category),
        success: function () {
            window.location = '/categories';
        },
        error: function (xhr) {
            window.location = '/home';
        }
    });
});

});