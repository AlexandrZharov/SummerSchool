<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chairs</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div>
    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Name</th>
            <th>Description </th>
            <th>Chief</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.desc}</td>
                <td>${item.chief}</td>
                <td><a href="http://localhost:8081/web/chair/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a>
                </td>
                <td>Update</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>