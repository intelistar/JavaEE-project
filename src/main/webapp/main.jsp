<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result Page</title>
</head>
<body>
<h2>Submitted Data</h2>
<p>Login: <%= request.getAttribute("login") %></p>
<p>Password: <%= request.getAttribute("password") %></p>
</body>
</html>
