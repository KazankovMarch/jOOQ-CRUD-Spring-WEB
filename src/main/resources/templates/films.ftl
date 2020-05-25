<html>
<head>
    <title>Film List</title>
    <link rel="stylesheet" type="text/css" href="/static/css/films.css">
    <link rel="stylesheet" type="text/css" href="/static/css/btn.css">
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
                <td onclick="window.location='/film/${film.id}'">Edit</td>
                <td>
                    <form action="/film/delete/${film.id}" method="post">
                        <button class="blackBtn" type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </#list>
    </table>
</div>

<script type="application/javascript">
    function deleteFilm(a) {
        const address = location.host + '/film/delete/' + a;
        console.log(address)
        const request = new XMLHttpRequest();
        request.open('POST', address, true);
        request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
        request.send()
    }
</script>
</body>
</html>