$(document).ready(function(){
    searchArticles();
});

function searchArticles() {
    $.ajax({
        url: '/articles/list',
        type: 'GET',
        success: function (data, status, xhr) {
            fillTable(data);
        }
    });
}

function fillTable(articles) {
    let array = articles;

    const fill = function (i) {
        const $newTr = $('<tr></tr>');

        const $title = $('<td></td>');
        const $category = $('<td></td>');
        const $status = $('<td></td>');

        $title.text(array[i].title);
        $category.text(array[i].category.name);
        $status.text(array[i].status);

        $newTr.append($title);
        $newTr.append($category);
        $newTr.append($status);
        $('#datatablesSimple').append($newTr);
    };

    for (let i = 0; i < array.length; i++) {
        fill(i);
    }
    new simpleDatatables.DataTable(document.getElementById('datatablesSimple'));
}