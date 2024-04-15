<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Submit Form</title>
</head>
<body>
<h2>Registration Form</h2>
<%-- Проверяем, есть ли сообщение об ошибке, и отображаем его, если есть --%>
<c:if test="${not empty errorMessage}">
  <p style="color: red;">${errorMessage}</p>
</c:if>

<form action="registrationServlet" method="post">
  Login: <input type="text" name="login"><br>
  Password: <input type="password" name="password"><br>
  Repeat password: <input type="password" name="passwordCheck">
  <input type="submit" value="Sign up">
</form>

<a href="login.jsp">Already have an account - log in!</a>

</body>
</html>
