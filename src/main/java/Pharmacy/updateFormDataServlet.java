package Pharmacy;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateFormDataServlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 10,  // 10 KB
        maxFileSize = 1024 * 1500,       // 1500 KB
        maxRequestSize = 1024 * 1024    // 1 MB 
)
public class updateFormDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("OID"));
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mobileNo = request.getParameter("mobile");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
		
		boolean isTrue = PharmacyDButil.updateFormData(id, title, name, nic, address, age, gender, mobileNo, email, comment);
		
		if(isTrue == true) {
			
			int lastid = PharmacyDButil.getlastInsertedId();
			
			List<PharmacyCustomer> formData = PharmacyDButil.getFormDetails(lastid);
			request.setAttribute("cusDetails", formData);
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("confirmation.jsp");
			dispatcher1.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsuccessWindow.jsp");
			dispatcher2.forward(request, response); 
		}
	}
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int lastid = PharmacyDButil.getlastInsertedId();
	
	List<PharmacyCustomer> formData = PharmacyDButil.getFormDetails(lastid);
	request.setAttribute("cusDetails", formData);
	
	RequestDispatcher dispatcher1 = request.getRequestDispatcher("confirmation.jsp");
	dispatcher1.forward(request, response);
		
	}

}
