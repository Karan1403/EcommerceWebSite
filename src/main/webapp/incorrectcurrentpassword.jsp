<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>

<h1>GoCart </h1>
<br></br>
<h2>Set up your new password!</h2>
<p>Enter your correct old password</p>

<form action="ChangePassword" method="post">
Name : <input type="text" name="username" required>
Current password: <input type="password" name="currentpassword" required>
New Password: <input type="password" name="newpassword" required>
<input type="submit" value="changepassword"/>

</form>

</body>
</html>