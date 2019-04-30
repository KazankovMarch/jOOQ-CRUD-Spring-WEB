<html>
<head>
    <title>Film List</title>
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
<h3>Films List</h3>
<a href="/film">Add Film</a>
<a href="/author/all">Authors</a>
<br><br>
<div>
    <table>
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
                <td><a href="/film/${film.id}" >Edit</a></td>
                <td><form action="/film/delete/${film.id}" method="post"><button type="submit">Delete</button></form></td>
            </tr>
        </#list>
    </table>
</div>
<#--<script type="application/javascript">-->
<#--    function deleteFilm(id) {-->
<#--        console.log("/film/"+id);-->
<#--        var xhr = new XMLHttpRequest();-->
<#--        xhr.open("DELETE","/film/"+id);-->
<#--        xhr.onreadystatechange = function (res) {-->
<#--            if (xhr.readyState === 4) {-->
<#--                if (xhr.status === 200) {-->
<#--                }-->
<#--            }-->
<#--        };-->
<#--        xhr.send(null);-->
<#--    }-->
<#--</script>-->
</body>
</html>