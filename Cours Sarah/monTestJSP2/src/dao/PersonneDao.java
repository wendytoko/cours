package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.MyConnection;
import Modele.Personne;

public class PersonneDao implements IPersonneDao {

	@Override
	public void ajouterPersonne(Personne p) {
	
		MyConnection mc = new MyConnection();
		try {
			
			PreparedStatement statement =mc.getConnection().prepareStatement( "INSERT INTO personne VALUES (?, ?)");
			
			statement.setString(1, p.getNom());
			statement.setString(2, p.getPrenom());
			statement.executeUpdate();
			mc.getConnection().setAutoCommit(false);
			mc.getConnection().commit();

	}
	 catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		
	}

	@Override
	public Personne afficherPersonne(Personne p) {
		
		Personne pers=new Personne(null, null);
		String nom=p.getNom();
		String prenom=p.getPrenom();
		String nomPersonne=null;
		String prenomPersonne=null;
		MyConnection mc = new MyConnection();

		try {
			
			PreparedStatement statement =mc.getConnection().prepareStatement( "select * from personne where nom='"+nom+"' and prenom='"+prenom+"' ");
			ResultSet resultat=statement.executeQuery();
			
			
			while(resultat.next()) {
				nomPersonne=((String)resultat.getString(1));
				prenomPersonne=((String)resultat.getString(2));
				
				pers.setNom(nomPersonne);
				pers.setPrenom(prenomPersonne);
			
			}
		}
		catch (SQLException e) {

		e.printStackTrace();
		}
		return pers;
	}

}
