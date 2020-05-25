<html>
<head>
    <title>Author List</title>
    <link rel="stylesheet" type="text/css" href="/static/css/films.css">
    <link rel="stylesheet" type="text/css" href="/static/css/btn.css">
</head>
<body>
<h3>Author</h3>
<a href="/author/all">All Authors</a>
<br><br>
<div>
    <form method="post" name="author" action="/author">
        <label for="name">name:</label><input type="text" id="name" name="name" placeholder="name" required="required"
            <#if author?exists>
                value="${author.name}"
            </#if>
        >
        <br><br>
        <#if author?exists>
            <input type="hidden" name="id" value="${author.id}">
        </#if>
        <input type="reset" value="reset">
        <input type="submit" value="save">
    </form>
    <#if author?exists>
        <form action="/author/delete/${author.id}" method="post"><button type="submit">Delete</button></form>
    </#if>
</div>
</body>
</html>