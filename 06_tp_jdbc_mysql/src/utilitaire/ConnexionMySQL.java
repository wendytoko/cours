package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMySQL {
	
	/*--------------------------------------------------------------------*/
	/*----Informations qui nous permettent de nous connecter � la BDD----*/
	/*------------et d'obtenir le pilote--------------------------------*/
	/*-----------------------------------------------------------------*/

	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL_BDD = "jdbc:mysql://localhost:3306/dbb_tp";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "wendy";
	
	
	/*--------------------------------------------------------------------*/
	/*-----------Constructeur qui va permettre de cr�er une connexion----*/
	/*------------------------------------------------------------------*/
	
	private ConnexionMySQL(){
		
	}
	
	
	/*-----------------------------------------------------------------------*/
	/*--D�claration d'une variable qui va permettre de cr�er une connexion--*/
	/*---------------------------------------------------------------------*/
	
	static Connection connexion;
	
	/*-----------------------------------------------------------------------*/
	/*---D�claration d'une m�thode qui va permettre de cr�er une connexion--*/
	/*---------------------------------------------------------------------*/
	
	
	public static Connection getConnection() {
		
		
		
		try {
			
			/* 1. chargement du pilote */
			Class.forName(JDBC_DRIVER);
			
			/* 2. Etablissement de la connexion */
			
			connexion = DriverManager.getConnection(URL_BDD, USER_NAME, PASSWORD);
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connexion;
		
	
		
	}// fin getConnection
	
	
	
}// fin classe
