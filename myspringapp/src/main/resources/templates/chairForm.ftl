<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add chair</legend>
        <form name="chair" action="" method="POST">
            Name:<@spring.formInput "chairForm.name" "" "text"/><br>
            Chief:<@spring.formInput "chairForm.chief", "", "text"/><br>
            Description:<@spring.formInput "chairForm.description", "", "text"/><br>
            <input type="submit" value="Submit"/>
        </form>
    </fieldset>
</div>

</body>
</html>