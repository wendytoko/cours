package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
	
	private String url = "jdbc:mysql://localhost:3306/compte";
	private String login = "root";
	private String pwd = "";
	private static Connection connection;

	public MyConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, pwd);
		} catch (SQLException ex) {
			Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public static Connection getConnection() {
		return connection;
	}
	

}
