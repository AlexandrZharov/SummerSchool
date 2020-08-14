<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chairs</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<script>
    var request;
    async function sendInfo(id) {
        var url = "http://localhost:8081/web/chair/info/" + id;
        const response = await fetch(url);
        const jsonBody = await response.json();
        document.getElementById("name").innerHTML = jsonBody.name;
        document.getElementById("description").innerHTML = jsonBody.description;
        document.getElementById("chief").innerHTML = jsonBody.chief;
        document.getElementById("created_at").innerHTML = jsonBody.createdAt;
        document.getElementById("updated_at").innerHTML = jsonBody.updatedAt;
    }
</script>
<body>
<div>
    <div>
        <a href="http://localhost:8081/web/chair/refresh">Refresh to basic DB</a>
        <a href="http://localhost:8081/web/chair/create">Create new chair</a>
    </div>
    <table border="3" bgcolor="#f0f8ff">
        <tr>
            <th>Name</th>
            <th>Description </th>
            <th>Chief</th>
            <th>Delete</th>
            <th>Update</th>
            <th>Info</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.description}</td>
                <td>${item.chief}</td>
                <td><a href="http://localhost:8081/web/chair/delete/${item.id}">
                        delete
                    </a>
                </td>
                <td><a href="http://localhost:8081/web/chair/update/${item.id}">
                        update
                    </a>
                </td>
                <td><input type="button" value="info" class="btn-info" onclick="sendInfo('${item.id}')" />
                </td>

            </tr>
        </#list>
    </table>

    <div>
        <h2>Object info</h2>
        <table class="table">
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Chief</th>
                <th>Created At</th>
                <th>Updated At</th>
            </tr>
            <tr>
                <td id="name"></td>
                <td id="description"></td>
                <td id="chief"></td>
                <td id="created_at"></td>
                <td id="updated_at"></td>
            </tr>
        </table>

    </div>
</div>
</body>
</html>