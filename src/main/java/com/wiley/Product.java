package com.wiley;
import java.sql.*;
import java.util.*;
public class Product {

	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	private List<EncapsProduct> products;
	
	
	public Product() {
		
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				this.con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
				
			}
			catch(Exception e) {
				
				System.out.println(e);
				
			}
	
	}
	
		
	public List<EncapsProduct> getAllProducts(){
		
		this.products = new ArrayList<>();
		  
		  
		try {
			
			this.pst = this.con.prepareStatement("SELECT * from product");
			
			this.rs = this.pst.executeQuery();
			
			
			while(rs.next()) {
				
				products.add(new EncapsProduct(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		return this.products;
		
	}
	
	
}
