<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>
</head>
<body>

<%! int total; %>

<% total=  (int) session.getAttribute("cartPrice");  %>

<h2>Your total cart price is <%= total %></h2>

<% session.setAttribute("cartPrice",0); %>

<form action="shopping.jsp" method="post">

Enter Card Details please!
<p>
<input type="text" value="Card number" placeholder="Card Number">
<input type="text" value="Expiry date" placeholder="Expiry Date">
<input type="text" value="CVV" placeholder="CVV">
</p>
<p>
Enter payment mode<br>

Cash On delivery<input type="radio" value="Cash on delivery" name="payment mode">
Pay Now<input type="radio" value="Pre Payment" name="payment mode">
</p>
<input type="submit" value="Proceed">
</form>

</body>
</html>