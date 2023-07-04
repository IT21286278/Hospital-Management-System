package Pharmacy;

import java.io.IOException;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PharmacyReqServlet")
public class PharmacyReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("titles");
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mobileNo = request.getParameter("mobile");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
     
        boolean isTrue = PharmacyDButil.submitPrecription(title, name, nic, address, age, gender, mobileNo, email, comment);
		
        
		if(isTrue == true) {
			
			int lastid = PharmacyDButil.getlastInsertedId(); //get last inserted id
			
			List<PharmacyCustomer> formData = PharmacyDButil.getFormDetails(lastid); //get the details of the laslty inserted record
			request.setAttribute("cusDetails", formData);
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("confirmation.jsp");
			dispatcher1.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsuccessWindow.jsp");
			dispatcher2.forward(request, response); 
		}
	}

}
