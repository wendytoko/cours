package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modele.Client;

public class ClientDaoImpl implements IClientDao<Client> {

	public ClientDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Client pClient) {

		String addReq = "INSERT INTO client (id_client,nom,prenom,adresse,code_postal,ville,telephone) VALUES (?,?,?,?,?,?,?)";
		
		PreparedStatement ps;
		
		try {
			ps = this.connexion.prepareStatement(addReq);
			
			ps.setInt(1, pClient.getId_client());
			ps.setString(2, pClient.getNom());
			ps.setString(3, pClient.getPrenom());
			ps.setString(4, pClient.getAdresse());
			ps.setInt(5, pClient.getCode_postal());
			ps.setString(6, pClient.getVille());
			ps.setInt(7, pClient.getTelephone());
			
			int verifAdd = ps.executeUpdate();
			
			return verifAdd ==0 ? false : true;
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		
		String deleteReq = "DELETE FROM client WHERE `idclient`='?'";
		
		PreparedStatement ps = null;
		
		try {
			ps = this.connexion.prepareStatement(deleteReq);
			
			ps.setInt(1, id);
			
			int verifDelete = ps.executeUpdate();
			
			return verifDelete == 0 ? false : true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	@Override
	public boolean update(Client client) {
		
		String updateReq = "UPDATE `bdd_tp_2`.`client` SET `nom`='?' WHERE `idclient`='?'";
		
		PreparedStatement ps = null;
		
		try {
			ps= this.connexion.prepareStatement(updateReq);
			
			ps.setString(2, client.getNom());
			ps.setInt(1, client.getId_client());
			
			int verifUpdate = ps.executeUpdate();
			
			return verifUpdate== 0 ? false : true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	@Override
	public List<Client> getAll() {
		
		List<Client> liste = new ArrayList<Client>();
		Client client;
		
	PreparedStatement ps = null;
	String recupReq = "SELECT * from client";
	ResultSet rs = null;
	
	try {
		ps = this.connexion.prepareStatement(recupReq);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			client = new Client (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7));
			liste.add(client);
			
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		
		return null;
	}

	@Override
	public Client getById(int id) {
		
		String recupId = "SELECT * from client WHERE id_client=?";
		PreparedStatement ps = null;
		Client client;
		ResultSet rs;
		
		try {
			ps = this.connexion.prepareStatement(recupId);
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				client = new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7));
				
				return client;
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
