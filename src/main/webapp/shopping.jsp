<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    
    
    <%@page import="com.wiley.EncapsProduct"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GoCart Shopping</title>
</head>
<body>

<%!
String username;

%>


<%
username=(String) session.getAttribute("Name");
%>
<p><strong>Welcome <%= username %>!</strong> </p>



<h1>Shop with GoCart</h1>


<%!

List<EncapsProduct> products;

int a;

%>

<% a= (int) session.getAttribute("cartPrice"); %>

<h2>Cart price is : <%= a %></h2>
<table border="1">
<tr>
	
	<th> Product Title </th>
	<th> Product Price </th>
	<th> Action </th>
</tr>
<%

	products =(List<EncapsProduct>) session.getAttribute("productList");

	for(EncapsProduct p : products)
	{
		
%>
  
		<tr> 
		  <form action="AddToCart" method="POST">
		  <input type="hidden" name="productId" value="<%=p.getProductId()%>"/>
	      
	      <td> <%=p.getProductTitle() %> </td>
	      <td> <%=p.getProductPrice() %> </td>
	      <td> <input type="submit" value="Add to Cart"/></td>
	      </form>
	     </tr> 
	     

<%
}
%>
</table>


<br></br>
<form action="changepassword.jsp" method="post">
<input type="submit" value="Change Password"/>
</form>
<br></br>

<form action="Checkout" method="post">
<input type="submit" value="Checkout"/>
</form>

<br></br>
<form action="Logout" method="post">
<input type="submit" value="Logout"/>
</form>


</body>
</html>