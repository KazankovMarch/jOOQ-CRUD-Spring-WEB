<html>
<head>
    <link rel="stylesheet" type="text/css" href="/static/css/films.css">
    <title>Author List</title>
</head>
<body>
<h3>Author List</h3>
<a href="/author">Add Author</a>
<a href="/film/all">Films</a>
<br><br>
<div>
    <table class="container">
        <tr>
            <th>Author Name</th>
        </tr>
        <#list authors as author>
            <tr id="${author.id}">
                <td>${author.name}</td>
                <td onclick="window.location='/author/${author.id}'">Edit</td>
                <td><form action="/author/delete/${author.id}" method="post"><button type="submit">Delete</button></form></td>
            </tr>
        </#list>
    </table>pos
</div>
<script type="application/javascript">
    function deleteAuthor(a) {
        const address = location.host + '/author/delete/' + a;
        console.log(address)
        const request = new XMLHttpRequest();
        request.open('POST', address, true);
        request.send()
    }
</script>
</body>
</html>