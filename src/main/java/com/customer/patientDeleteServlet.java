package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class patientDeleteServlet
 */
@WebServlet("/patientDeleteServlet")
public class patientDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("uid");//catch user id
		
		boolean isTrue = CustomerDBUtill.deleteAccount(id);
		
		 if(isTrue == true)
		 {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");//redirect to register.jsp
			 dispatcher.forward(request, response);
		 }
		 else {
			 List<Customer> cusDetails = CustomerDBUtill.getPatientDetails(id);
			 request.setAttribute("cusDetails", cusDetails);
			 RequestDispatcher dispatcher  = request.getRequestDispatcher("useraccount.jsp");//redirect to register.jsp
			 dispatcher.forward(request, response);
			 
			 
			 
		 }
		
		
	
	}

}
