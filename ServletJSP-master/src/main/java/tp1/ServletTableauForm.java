package tp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletTableauForm extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String age = request.getParameter("age");
		Personne perso = new Personne(nom,prenom,age);
		try {
			HttpSession session = request.getSession();
			ArrayList<Personne> lesPersonnes = (ArrayList<Personne>) session.getAttribute("liste");
			lesPersonnes.add(perso);
			session.setAttribute("liste",lesPersonnes);
			System.out.println(lesPersonnes);
			for(int i=0;i<lesPersonnes.size();i++){
				System.out.println(lesPersonnes.get(i).getNom());
			}
		}
		catch(Exception e){
			HttpSession session = request.getSession();
			ArrayList<Personne> lesPersonnes = new ArrayList<Personne>(Arrays.asList(perso));
			session.setAttribute("liste", lesPersonnes);
		}
		
		try {
			HttpSession session = request.getSession();
			int nbRestant = (int) session.getAttribute("nbRestant");

			nbRestant = nbRestant - 1;
			
			session.setAttribute("nbRestant",nbRestant);
			System.out.println(nbRestant);
			if((int)session.getAttribute("nbRestant") < 1){
				request.getRequestDispatcher("/table.jsp").forward(request,response);
			}

		}
		catch(Exception e){
			String nb = request.getParameter("nb");
			int nbInt = Integer.parseInt(nb);
			HttpSession session = request.getSession();
			session.setAttribute("nbRestant", nbInt);
			System.out.println(session.getAttribute("nbRestant"));
		}
		
		request.getRequestDispatcher("/formPerso.jsp").forward(request,response);
			
	}
	
}
