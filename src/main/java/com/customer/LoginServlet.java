package com.customer;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uid");//catch values from jsp
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		
		try{
			
			
			List <Customer> cusDetails = CustomerDBUtill.validate(username, password);//call validate function
			request.setAttribute("cusDetails", cusDetails);
			
//			HttpSession session = request.getSession();
//			session.setAttribute("username", username);
			
		} catch (Exception e) {//check for exceptions
				e.printStackTrace();
				
		}
		
		RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
		 dis.forward(request, response);
		 
	}

}
