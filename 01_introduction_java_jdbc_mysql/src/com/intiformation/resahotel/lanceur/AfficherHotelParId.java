package com.intiformation.resahotel.lanceur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.intiformation.resahotel.modele.Hotel;

/**
 * afficher un hotel par son id
 * 
 * @author IN-MP-040
 *
 */

public class AfficherHotelParId {
	// infos bdd + driver jdbc

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/db_gestion_hotel";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "wendy";

	public static void main(String[] args) {
		
		Connection connection = null;// on doit sortir l'obet connection du try
		ResultSet results = null;
		Statement requeteJDBC = null;

		try {
			// 1. chargement du pilote jdbc de mysql

			Class.forName(JDBC_DRIVER);

			// 2.r�cup�ration d'une connexion du DriverManager
			
		 connection = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD );
			
			//3. definition de la requete sql + jdbc
			
			String requeteSQL = "SELECT * FROM hotels WHERE id_hotel = 2";
			
			 requeteJDBC = connection.createStatement();
			
			//4. execution de la requete + recup du r�sultat de la requete
			
			 results = requeteJDBC.executeQuery(requeteSQL);
			
			/*5. extraction des donn�es du ResultSet*/
			//5.1 initialisation de la t�te de lecture
			
			results.next();
			
			//5.2 recup des donn�es du ResultSet
			
			int idHotel = results.getInt("id_hotel");	
			String libelle = results.getString("libelle");
			String etoile = results.getString("etoile");
			
			Hotel hotel = new Hotel(idHotel, libelle, etoile);
			
			
			//6. affichage des donn�es
			
			System.out.println("D�tails de l'hotel : ");
			System.out.println("\t> " + hotel);
			
			// 7. Lib�ration des ressources
			
			results.close();
			requeteJDBC.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			/* bloc finally pour lib�rer les ressources */
			
			if (results != null)
				try {
					results.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//destruction de l'objet resultSet
			if (requeteJDBC!= null)
				try {
					requeteJDBC.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//destruction de l'objet requete JDBC
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//destruction de l'objet 
			
		}

	}// fin main

}// fin classe
