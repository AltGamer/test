$(document).ready(function(){

searchCategories();

$('#create-article-btn').click(function () {
    let selectedCategory = {
        id: $('#categoriesSelect').find(":selected").val(),
        name: $('#categoriesSelect').find(":selected").text()
    }
    let article = {
        title: $('#title').val(),
        content: $('#content').val(),
        category: selectedCategory
    }

    $.ajax({
        url: './create',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(article),
        success: function () {
            window.location = '/articles';
        }
    });
});

});

function searchCategories() {
    $.ajax({
        url: '/categories/list',
        type: 'GET',
        success: function (data, status, xhr) {
            fillCategories(data);
        }
    });
}

function fillCategories(categories) {
    let array = categories;

    const fill = function (i) {
        const $category = $('<option></option>');

        $category.val(array[i].id);
        $category.text(array[i].name);

        $('#categoriesSelect').append($category);
    };

    for (let i = 0; i < array.length; i++) {
        fill(i);
    }
}