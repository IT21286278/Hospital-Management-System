package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id = request.getParameter("uid");
			String name = request.getParameter("uname");
			String email = request.getParameter("uemail");
			String phone = request.getParameter("uphone");
			String username = request.getParameter("uuname");
			String password = request.getParameter("upass");
			
			
			boolean istrue;
			
			istrue = CustomerDBUtill.updateAccount(id, name, email, phone, username, password);
			
			
			if(istrue == true) {
				
				List<Customer> cusDetails = CustomerDBUtill.getPatientDetails(id);
				request.setAttribute("cusDetails", cusDetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
				dis.forward(request, response);
			}
			else {
				RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
				dis.forward(request, response);
				
			}
			
	
	}

}
