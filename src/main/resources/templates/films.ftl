<html>
<head>
    <meta charset="utf-8">
    <title>Film List</title>
    <link rel="stylesheet" type="text/css" href="/static/css/films.css">
</head>
<body>
<h3>Films List</h3>
<a href="/film">Add Film</a>
<a href="/author/all">Authors</a>
<br><br>
<div>
    <table class=container>
        <tr>
            <th>Film Name</th>
            <th>Author Name</th>
            <th>Release Date</th>
        </tr>
        <#list films as film>
            <tr id="${film.id}">
                <td>${film.name}</td>
                <td>${film.author}</td>
                <td>${film.releaseDate}</td>
                <td><a href="/film/${film.id}">Edit</a></td>
                <td>
                    <form action="/film/delete/${film.id}" method="post">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>