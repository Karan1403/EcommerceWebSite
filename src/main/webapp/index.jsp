<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

<h1> Welcome to GoCart</h1>


<p> Sign in!</p>
<form action="MyServlet" method="post">  

Name:<input type="text" name="username" required/><br/><br/>  
Password:<input type="password" name="password" required/><br/><br/>  
<input type="submit" value="login"/>  

<p>

New User? Create an account!
</p>
</form>  

<form action="register.jsp" method="post">
<input type="submit" value="Register"/>
</form>

</body>
</html>