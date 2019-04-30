<html>
<head>
    <title>Author List</title>
    <style>
        table{
            background-color:#dddcdc;
            border-width: medium;
            border-color:  #b3603d;
        }
        tr{
            color:#114068;
        }
        a:hover {
            background: #b3603d ;
            color: #114068;
        }

        button {
            background-color: #5f7f9e;
            height: 40;
        }

        a{
            color: #114068;
        }

        th{
            color: #b3603d;
        }
        body{
            background-color:#8c6a5c;
        }
        ul{
            background-color:#5f7f9e;
        }
    </style>
</head>
<body>
<h3>Author List</h3>
<a href="/author">Add Author</a>
<a href="/film/all">Films</a>
<br><br>
<div>
    <table>
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