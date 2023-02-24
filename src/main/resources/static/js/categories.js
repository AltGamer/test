$(document).ready(function(){

    searchCategories();

});

function searchCategories() {
    $.ajax({
        url: '/categories/list',
        type: 'GET',
        success: function (data, status, xhr) {
            fillTable(data);
        }
    });
}

function fillTable(categories) {
    let array = categories;

    const fill = function (i) {
        const $newTr = $('<tr></tr>');

        const $category = $('<td></td>');
        const $articles = $('<td></td>');
        const $placeholder = $('<td></td>');
        const $placehold = $('<td></td>');

        $category.text(array[i].name);
        $articles.text('999');
        $placeholder.text('holderplace');
        $placehold.text('holderplace');

        $newTr.append($category);
        $newTr.append($articles);
        $newTr.append($placeholder);
        $newTr.append($placehold);
        $('#datatablesSimple').append($newTr);
    };

    for (let i = 0; i < array.length; i++) {
        fill(i);
    }
    new simpleDatatables.DataTable(document.getElementById('datatablesSimple'));
}