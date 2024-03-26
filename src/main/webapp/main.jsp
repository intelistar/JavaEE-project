<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result Page</title>
</head>
<body>
<h2>Submitted Data</h2>
<p>Name: <%= request.getAttribute("name") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
</body>
</html>
