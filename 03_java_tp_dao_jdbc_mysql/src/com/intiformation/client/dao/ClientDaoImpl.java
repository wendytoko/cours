package com.intiformation.client.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.intiformation.modele.Client;

public class ClientDaoImpl implements IClientDao<Client> {

	// ________________________liste de tous les clients______________________//

	@Override
	public List<Client> getAll() {
		PreparedStatement ps = null;
		Client client = null;
		ResultSet rs = null;
		List<Client> listeclients = new ArrayList<>();

		try {
			rs = this.connection.prepareStatement("SELECT * FROM client").executeQuery();

			while (rs.next()) {

				client = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getInt(7));
				listeclients.add(client);

			}

			return listeclients;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}// fin getAll()

	// ________________________récup d'un client via son id______________________//

	Client client = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	@Override
	public Client getById(int pIdClient) {

		try {
			ps = this.connection.prepareStatement("SELECT * FROM client where id_client=?");

			ps.setInt(1, pIdClient);

			rs = ps.executeQuery();

			rs.next();

			client = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
					rs.getString(6), rs.getInt(7));
			// System.out.println(client);

			return client;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return null;
	}

	// ________________________ajout d'un client______________________//

	@Override
	public boolean add(Client pClient) {
		PreparedStatement ps = null;

		try {
			String addReq = "INSERT into client (id_client,nom,prenom,adresse,code_postal,ville,telephone) VALUES (?,?,?,?,?,?,?)";

			ps = this.connection.prepareStatement(addReq);

			ps.setInt(1, pClient.getIdclient());
			ps.setString(2, pClient.getNom());
			ps.setString(3, pClient.getPrenom());
			ps.setString(4, pClient.getAdresse());
			ps.setInt(5, pClient.getCodepostal());
			ps.setString(6, pClient.getVille());
			ps.setInt(7, pClient.getTelephone());

			int verifAdd = ps.executeUpdate();

			return verifAdd == 0 ? false : true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;

	}
	// ________________________modif d'un client via son id______________________//

	@Override
	public boolean update(Client client) {
		PreparedStatement ps = null;
		try {
			
			
			String modifReq = "UPDATE `dbb_tp`.`client` SET `nom`='?', `prenom`='?' WHERE `id_client`='?'";
			ps = this.connection.prepareStatement(modifReq);
			
			ps.setInt(1, client.getIdclient());
			ps.setString(2, client.getNom());
			ps.setString(3, client.getPrenom());
			

			int verifModif = ps.executeUpdate();
			return verifModif == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return false;
	}

	// _____________suppression d'un client via son id___________//

	@Override
	public boolean delete(int pIdClient) {

		try {
			String suppReq = "DELETE FROM client WHERE id_client =?";
			ps = this.connection.prepareStatement(suppReq);

			ps.setInt(1, pIdClient);
			int verifSupp = ps.executeUpdate();
			return verifSupp == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return false;
	}

}// fin classe
