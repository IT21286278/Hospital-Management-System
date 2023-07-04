package com.customer;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		try {
			
			boolean istrue;
			
			
			istrue = CustomerDBUtill.registerUser(name,email,phone,userName, password);
			
			if(istrue == true) {
				RequestDispatcher dis =request.getRequestDispatcher("login.jsp");
				 dis.forward(request, response);
			}
			else {
				
				RequestDispatcher dis =request.getRequestDispatcher("Register.jsp");
				 dis.forward(request, response);
				
			}
			
			
			
			
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		
	}

}
