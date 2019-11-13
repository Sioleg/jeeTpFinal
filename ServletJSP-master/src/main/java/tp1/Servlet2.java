package tp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse resp) throws IOException {
		String nom = request.getParameter("nom");
		try {
			request.setAttribute("name", nom);
			getServletContext().getRequestDispatcher("/result.jsp").forward(request, resp);
			
		}
		catch (ServletException e) {
		}
	}
	
}
