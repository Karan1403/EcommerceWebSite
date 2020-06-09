package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
//		pw.print("Welcome to Servlet API!! There is an update");
//		pw.close();
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Customer customer=new Customer();
		customer.checkoutCart();
		
		
		
	
		
		if(customer.validate(username, password)){  
			pw.write("Welcome back "+username);
			HttpSession session=request.getSession(true);
			session.setAttribute("cartPrice", 0);
			session.setAttribute("Name", username);
			response.sendRedirect("ViewProductServlet");
			
				
	        
	    }  
	    else{  
	        pw.print("Username or password incorrect! Please try again!");  
	               
	        //customer.insert(username, password,email);
	        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	        rd.include(request,response);
	    }  
	          
	    pw.close();  
	}

}
