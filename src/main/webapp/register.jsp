<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Sign up</h1>

<form action="Register" method="post">

Name:<input type="text" name="username" required/><br/><br/>  
Password:<input type="password" name="password" required/><br/><br/>  
Email:<input type="email" name="email" required/><br/><br/>  
<input type="submit" value="Register"/>
</form>

<form action="index.jsp">

<p>To go back to Login page</p><input type="submit" value="Login"></form>

</body>
</html>