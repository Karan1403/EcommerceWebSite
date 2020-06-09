package com.wiley;
import java.sql.*;  
public class Customer {
	
	public boolean validate(String username,String password){  
	boolean status=false;  
	try{  
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	
	
	PreparedStatement ps=con.prepareStatement(  
	"select * from customer where username=? and password=?");  
	ps.setString(1,username);  
	ps.setString(2,password);  
	      
	ResultSet rs=ps.executeQuery();  
	status=rs.next(); 
	         
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}
	
	public void insert(String username,String password,String email) {
		
		try {
		System.out.println("Inserting");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement st=con.createStatement();
        String temp="INSERT into customer values('"+username+"','"+password+"','"+email+"')";
        st.executeUpdate(temp);
	

	         
	}catch(Exception e){System.out.println(e);} 
		
	
	}
	
	

		
public void changePassword(String username, String password) {
	
	try {
		System.out.println("Changing password");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement st=con.createStatement();
        String temp="UPDATE customer set password='"+password+"'WHERE username='"+username+"'";
        st.executeUpdate(temp);
	

	         
	}catch(Exception e){System.out.println(e);}
		
	}


public int addToCart(int pid) {
	int i=0;
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement st=con.createStatement();
        String temp="INSERT into cart values((select price from product where pid="+pid+"))";
        
        
        i=st.executeUpdate(temp);
	

	         
	}catch(Exception e){System.out.println(e);
	return 0;}
	return i;
	
}



public int findCartPrice() {
	int price=0;
try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement st=con.createStatement();
        String temp="select sum(price) from cart";
        
        
        ResultSet rs=st.executeQuery(temp);
        
        if(rs.next()) {
			price = rs.getInt(1);
		}
	

	         
	}catch(Exception e){System.out.println(e);}
	return price;
}



public void checkoutCart() {
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
    Statement st=con.createStatement();
    String temp="truncate cart";
    st.execute(temp);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
		
	
	
	}
	


