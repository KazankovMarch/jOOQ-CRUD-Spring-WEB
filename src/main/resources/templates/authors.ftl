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
                <td><a href="/author/${author.id}" >Edit</a></td>
                <td><form action="/author/delete/${author.id}" method="post"><button type="submit">Delete</button></form></td>
            </tr>
        </#list>
    </table>
</div>
<#--<script type="application/javascript" src="functions.js">-->
<#--</script>-->
</body>
</html>