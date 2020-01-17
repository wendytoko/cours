package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connexion.Connexion;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		// PrintWriter out = resp.getWriter();
		// out.println("<html><body>");
		// out.println("<h1>"+ nom + "</h1>");
		// out.println("<h1>" + prenom + "</h1>");
		// out.println("</html></body>");

		this.getServletContext().getRequestDispatcher("Utilisateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		Object message = req.getAttribute("Bienvenue");

		Connection connexion = Connexion.getConnection();

		PreparedStatement ps = null;

		try {
			String addReq = "INSERT INTO personne (nom,prenom) VALUES (?,?)";

			ps = connexion.prepareStatement(addReq);
			ps.setString(1, req.getParameter("nom"));
			ps.setString(2, req.getParameter("prenom"));

			ps.executeUpdate();

		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		req.getRequestDispatcher("Recup.jsp").forward(req, resp);

	}
	/*protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		Object message = req.getAttribute("Bienvenue");

		Connection connexion = Connexion.getConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String selectReq = "SELECT * from personne";

			ps = connexion.prepareStatement(selectReq);
		

			rs = ps.executeUpdate();
			rs.next();
			
			
			

		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		req.getRequestDispatcher("Recup.jsp").forward(req, resp);

	}*/
	
	

}
