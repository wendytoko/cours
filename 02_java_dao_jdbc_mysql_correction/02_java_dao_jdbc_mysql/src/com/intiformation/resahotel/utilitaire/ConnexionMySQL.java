package com.intiformation.resahotel.utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * utilitaire qui permet de récupérer une connexion vers la bdd <br/>
 * 
 * @author INTIFORMATION
 *
 */
public class ConnexionMySQL {

	// infos bdd + driver jdbc
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/db_gestion_hotel";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	// objet Connection 
	private static Connection connection;
	
	/**
	 * ctor en private : empeche l'instanciation des objets de la classe <br/>
	 */
	private ConnexionMySQL() {
	}

	/**
	 * permet de récupérer une connexion jdbc vers la bdd <br/>
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		try {
			
			/* 1. Chargement du pilote jdbc de mysql */
			Class.forName(JDBC_DRIVER);
			
			/* 2. récup d'une connexion du DriverManager */
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			/* renvoi de la connexion */
			return connection;
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch 
		
		return null;

	}// end getConnection

}// end class
