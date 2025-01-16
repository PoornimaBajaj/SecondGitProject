<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
    <body class="bg-dark">
        <h1 style="blue;text-align:center">Vertafore</h1>
        <h2 style="crimson;text-align:center">Add Product</h2>
        <div>
        <form method="post" action="add">
            Product Id: <input type="text" name="pid" value="${product.pid}"/><br/>
            Product Name: <input type="text" name="pname" value="${product.pname}"/><br/>
            Product Cost: <input type="text" name="pcost" value="${product.pcost}"/><br/>
            <input type="submit" value="Submit" class="btn btn-primary"/>

        </form>
        </div>
    </body>
</html>