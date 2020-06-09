package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePassword
 */
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("username");
		String currentpassword=request.getParameter("currentpassword");
		String newpassword=request.getParameter("newpassword");
		Customer pass=new Customer();
		
		if(pass.validate(username,currentpassword)) {
			pass.changePassword(username,newpassword);
			response.sendRedirect("shopping.jsp");
		}
		else {
			pw.write("Enter your correct current password");
			response.sendRedirect("incorrectcurrentpassword.jsp");
		}
		
		
	}

}
