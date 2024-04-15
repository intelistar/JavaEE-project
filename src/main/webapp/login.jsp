<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Submit Form</title>
</head>
<body>
<h2>Login Form</h2>
<%-- Проверяем, есть ли сообщение об ошибке, и отображаем его, если есть --%>
<c:if test="${not empty errorMessage}">
    <p style="color: red;">${errorMessage}</p>
</c:if>

<form action="loginServlet" method="post">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Log in">
</form>
</body>
</html>
