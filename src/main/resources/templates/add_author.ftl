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
        <br><br>
        <input type="reset" value="reset">
        <input type="submit" value="save">
    </form>
</div>
</body>
</html>