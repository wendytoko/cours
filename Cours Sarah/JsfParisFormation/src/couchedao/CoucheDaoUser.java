package couchedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modele.User;
import utilitaire.MyConnection2;

public class CoucheDaoUser implements IDaoUser{
	
	

	Connection connection = MyConnection2.getConnection();

	public boolean inscription(User user) {

		PreparedStatement ps = null;

		
		String insc = "INSERT INTO user (login,mdp) VALUES (?,?)";

		try {
			
			ps = this.connection.prepareStatement(insc);

			ps.setString(1, user.getLogin());

			ps.setString(2, user.getMdp());

			int verifAdd = ps.executeUpdate();
			
			return verifAdd ==0? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public User getUserByLogin(String login) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user=null;
		
		String get = "SELECT * from user where login=?";
		
		try {
			ps = this.connection.prepareStatement(get);
			
			ps.setString(1, login);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
			
			
			user = new User(rs.getString(1),rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
		
	}

}// fin classe
