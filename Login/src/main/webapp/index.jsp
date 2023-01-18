<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<br>
<form action="controller" method="post">
    <label>Login : </label><input name="login"> </br>
    <label>Password : </label><input type="password" name="password"> </br>
    <input type="submit" />
</form>
</body>
</html>