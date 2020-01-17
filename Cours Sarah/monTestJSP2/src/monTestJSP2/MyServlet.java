package monTestJSP2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connection.MyConnection;
import Modele.Personne;
import service.PersonneService;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyConnection mc = new MyConnection();
		try {
			
			PreparedStatement statement =mc.getConnection().prepareStatement( "select / from ");
			
			statement.setString(1, req.getParameter("nom"));
			statement.setString(2, req.getParameter("prenom"));
			statement.executeUpdate();
			mc.getConnection().setAutoCommit(false);
			mc.getConnection().commit();

	}
	 catch (SQLException e) {
		
		e.printStackTrace();
	}
		

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PersonneService service=new PersonneService();
		Personne p=new Personne(req.getParameter("nom"), req.getParameter("prenom"));
		service.ajouterPersonne(p);
		req.getRequestDispatcher("bienvenu.jsp").forward(req, resp);
	
  
}

	
	
}
