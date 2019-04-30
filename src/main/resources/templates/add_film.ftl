<html>
<head>
    <title>Author List</title>
    <style>
        input {
            background-color:#dddcdc;
            border-width: medium;
            border-color:  #b3603d;
        }
        a:hover {
            background: #b3603d ;
            color: #114068;
        }
        a{
            color: #114068;
        }
        select {
            background-color: #5f7f9e;
        }
        button {
            background-color: #5f7f9e;
            height: 40;
        }
        body{
            background-color:#8c6a5c;
        }
    </style>
</head>
<body>
<h3>Film</h3>
<a href="/film/all">All Films</a>
<br><br>
<div>
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