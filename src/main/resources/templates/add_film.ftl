<html>
<head>
    <title>Author List</title>
    <link rel="stylesheet" type="text/css" href="/static/css/films.css">
    <link rel="stylesheet" type="text/css" href="/static/css/btn.css">
</head>
<body>
<h3>Film</h3>
<a href="/film/all">All Films</a>
<br><br>
<div class="container">
    <#if film?exists>
    </#if>
    <form method="post" name="film" action="/film">
        <label for="name">name:</label><input type="text" id="name" name="name" placeholder="name" required="required"
            <#if film?exists>
                value="${film.name}"
            </#if>
        >
        <br><br>
        <label for="releaseDate">release date:</label><input type="date" id="releaseDate" name="releaseDate" placeholder="release date" required="required"
            <#if film?exists>
                value="${film.releaseDate}"
            </#if>
        >
        <br><br>
        <label for="author">author:</label><select name="author" required="required"
            <#if film?exists>
                content="${film.author}"
            </#if>
        >
            <br><br>
            <#list authors as author>
                <option>${author}</option>
            </#list>
        </select>
        <br><br>
        <#if film?exists>
            <input type="hidden" name="id" value="${film.id}">
        </#if>
        <input type="reset" value="reset">
        <input type="submit" value="save">
    </form>
    <#if film?exists>
        <form action="/film/delete/${film.id}" method="post"><button type="submit">Delete</button></form>
    </#if>
</div>
</body>
</html>