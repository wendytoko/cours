package com.intiformation.resahotel.lanceur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.intiformation.resahotel.modele.Hotel;

public class AjouterUnHotel {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/db_gestion_hotel";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "wendy";

	private static final int ID_HOTEL = 5;
	private static final String LIBELLE_HOTEL = "Trafalgar";
	private static final String ETOILE_HOTEL = "*****";
	
public static void main(String[] args) {
		
		Connection connection = null;// on doit sortir l'obet connection du try
		ResultSet results = null;
		PreparedStatement requetePrepareeJDBC = null;
		
		// 1. chargement du pilote jdbc de mysql
try {
	Class.forName(JDBC_DRIVER);
	
	// 2.r�cup�ration d'une connexion du DriverManager
	
			 connection = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD );
			

				//3. definition de la requete sql + jdbc
				
				/*String requeteSQL = "INSERT INTO hotels (id_hotel, libelle, etoile) VALUES ("+ID_HOTEL+", "+LIBELLE_HOTEL+", "+ETOILE_HOTEL+")";
				
				 requeteJDBC = connection.createStatement();*/
			 
			 //3.1 requete SQL
			 
			 String requeteSQL = "INSERT INTO hotels (id_hotel, libelle, etoile) VALUES (?, ?, ?)";
			 
			 //3.2 requete JDBC avec param
			 
			  requetePrepareeJDBC = connection.prepareStatement(requeteSQL);
			 
			 //3.3 passage de params 
			 /**
			  * setInt () : 1er param = rang du param dans la requete SQL
			  * 2eme param = valeur � transf�rer dans le param
			  * 
			  * 
			  * NB : il faut respecter l'ordre de passage par rapport � la requete SQL
			  */
			 
			 requetePrepareeJDBC.setInt(1, ID_HOTEL); // 1 = rang du param dans la requete SQL
			 requetePrepareeJDBC.setString(2, LIBELLE_HOTEL);
			 requetePrepareeJDBC.setString(3, ETOILE_HOTEL);
			 
			 //4. execution de la requete + recup du resultat
			 
			 /**
			  * executeUpdate () = cas Modif de la bdd => INSERT, UPDATE, DELETE
			  * verif = nombre d'enregistrements affect�s par la modif
			  */
			 
			int verif = requetePrepareeJDBC.executeUpdate();
			
			//5. Affichage d'un message du r�sultat de l'insertion
			if (verif == 1) {
				System.out.println("\t> INFO : L'hotel a �t� ajout� avec succ�s " );
			}else {
				System.out.println("\t> INFO : L'hotel n'a pas �t� ajout�");
			}
			 
				 
				 /**
				  * 
				  * NB : inconv�nients de l'objet Statement avec concat�nation dans la requ�te SQL
				  * 	> la concat�nation des String consomme de la ressource
				  * 	> la serveur de bdd doit analyser � chaque fois une nouvelle requ�te
				  * 	(cas plusieurs requetes)
				  * 	> synthaxe complexe
				  * 
				  * La solution => utilisation de l'objet PrepareStatement au lieu de Statement
				  * 	> avantage = on peut cr�er des requ�tes avec param�tres
				  * 	> les param sont remplac�s par un ?
				  * 
				  */
			 
				 // donn�es � ins�rer dans la BDD

	

	}//fin try
catch(ClassNotFoundException e)
	{
		
		e.printStackTrace();
	}catch(SQLException e)
	{

		e.printStackTrace();

	}// fin catch
finally {
	/* bloc finally pour lib�rer les ressources */
	
	
	if (requetePrepareeJDBC != null)
		try {
			requetePrepareeJDBC.close();
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
}

}// fin main
// fin classe
