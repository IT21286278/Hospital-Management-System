package Pharmacy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/updatePrescriptionServlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 10,  // 10 KB
        maxFileSize = 1024 * 1500,       // 1500 KB
        maxRequestSize = 1024 * 1024    // 1 MB 
)

public class updatePrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Part prescriptionImg = request.getPart("prescription");
		int id = PharmacyDButil.getlastInsertedId();
		
		boolean isTrue = PharmacyDButil.uploadPrescription(id, prescriptionImg);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("successWindow.jsp");
			dispatcher1.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsuccessWindow.jsp");
			dispatcher2.forward(request, response); 
		}
	}

}
