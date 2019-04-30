<html>
<head>
    <title>Author List</title>
    <style>
        /*https://color.romanuke.com/tsvetovaya-palitra-4001/*/
        input {
            background-color:#dddcdc;
            border-width: medium;
            border-color:  black;
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
        <input type="reset" value="reset">
        <input type="submit" value="save">
    </form>
    <#if author?exists>
        <form action="/author/delete/${author.id}" method="post"><button type="submit">Delete</button></form>
    </#if>
</div>
</body>
</html>