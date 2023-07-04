package Pharmacy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteRequestServlet")
public class deleteRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = PharmacyDButil.getlastInsertedId();
		
		boolean isTrue = PharmacyDButil.cancelPharmacyRequest(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("index.html");
			dispatcher1.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsuccessWindow.jsp");
			dispatcher2.forward(request, response); 
		}
	}

}
