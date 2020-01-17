package com.intiformation.resahotel.lanceur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupprimerHotel {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/db_gestion_hotel";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "wendy";
	
	private static final int ID_HOTEL = 5;
	private static final String LIBELLE_HOTEL = "Trafalgar";
	private static final String ETOILE_HOTEL = "*****";

	public static void main(String[] args) {

		Connection connection = null;// on doit sortir l'obet connection du try

		PreparedStatement requetePrepareeJDBC = null;

		// 1. chargement du pilote jdbc de mysql
		try {
			Class.forName(JDBC_DRIVER);

			// 2.récupération d'une connexion du DriverManager

			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// 3. definition de la requete sql + jdbc

			// 3.1 requete SQL

			String requeteSQL = "DELETE FROM hotels WHERE ID_HOTEL =?";

			// 3.2 requete JDBC avec param

			requetePrepareeJDBC = connection.prepareStatement(requeteSQL);

			// 3.3 passage de params

			requetePrepareeJDBC.setInt(3, 2);

			// 4. execution de la requete + recup du resultat

			int verifUpdateDelete = requetePrepareeJDBC.executeUpdate();

			// 5. Affichage d'un message du résultat de l'insertion
			
			if (verifUpdateDelete == 1) {
				System.out.println("\t> INFO : L'hotel a été supprimé avec succès ");
			} else {
				System.out.println("\t> INFO : La suppression de l'hotel a échouée");
			}

		} // fin try
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();

		} // fin catch
		finally {
			
			/* bloc finally pour libérer les ressources */

			if (requetePrepareeJDBC != null)
				try {
					requetePrepareeJDBC.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // destruction de l'objet requete JDBC
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // destruction de l'objet

		}
	}

}// fin classe
