package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection2 {



	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/user";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "wendy";
	
	private static Connection connection;
	
	public MyConnection2() {
		// TODO Auto-generated constructor stub
	}
	
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
	}
	



	

}
