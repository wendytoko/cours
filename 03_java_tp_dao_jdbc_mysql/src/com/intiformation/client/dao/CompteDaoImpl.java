package com.intiformation.client.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.intiformation.modele.Client;
import com.intiformation.modele.CompteBancaire;
import com.intiformation.modele.CompteCourant;
import com.intiformation.modele.CompteEpargne;

public class CompteDaoImpl implements ICompteDao<CompteBancaire> {

	public CompteDaoImpl() {

	}

	@Override
	public boolean add(CompteBancaire pCompteBancaire) {

		try {
			String addReq = "INSERT INTO comptebancaire (idCompteBancaire,solde) VALUES (?,?)";

			PreparedStatement ps;

			ps = this.connection.prepareStatement(addReq);

			ps.setInt(1, pCompteBancaire.getIdCompteBancaire());
			ps.setDouble(2, pCompteBancaire.getSolde());

			int verifAdd = ps.executeUpdate();

			return verifAdd == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int idcomptebancaire) {

		try {
			String deleteReq = "DELETE FROM comptebancaire WHERE idcomptebancaire=?";

			PreparedStatement ps = null;
			ps = this.connection.prepareStatement(deleteReq);

			ps.setInt(1, idcomptebancaire);

			int verifDelete = ps.executeUpdate();

			return verifDelete == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(CompteBancaire pCompteBancaire) {

		try {
			String updateReq = "UPDATE comptebancaire SET solde=? WHERE idcomptebancaire=?";

			PreparedStatement ps = null;
			ps = this.connection.prepareStatement(updateReq);

			ps.setInt(1, pCompteBancaire.getIdCompteBancaire());
			ps.setDouble(2, pCompteBancaire.getSolde());

			int verifUpdate = ps.executeUpdate();

			return verifUpdate == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<CompteBancaire> getAll() {

		List<CompteBancaire> liste = new ArrayList<>();

		CompteBancaire cb = null;
		ResultSet rs = null;
		Statement requeteAll = null;

		try {

			requeteAll = this.connection.createStatement();
			rs = requeteAll.executeQuery("SELECT * FROM comptebancaire");

			while (rs.next()) {
				cb = new CompteBancaire(rs.getInt(1), rs.getDouble(2));
				liste.add(cb);
			}

			return liste;

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

	@Override
	public CompteBancaire findCounter(int idCompteBancaire) {

	
		PreparedStatement ps = null;
		ResultSet rs;
		CompteBancaire compte = null;

		try {
			String trouverCompte = "SELECT * FROM comptebancaire WHERE idcomptebancaire=?";

			ps = this.connection.prepareStatement(trouverCompte);
			ps.setInt(1, idCompteBancaire);
			rs = ps.executeQuery();

			rs.next();

			compte = new CompteBancaire(rs.getInt(1), rs.getDouble(2));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return compte;
	}

	@Override
	public boolean attributeCounter(int idclient) {

		try {

			ResultSet rs = null;

			PreparedStatement ps = null;
			Client client = null;

			String attributeCounter = "UPDATE `dbb_tp`.`client` SET `idCompteCourant`='?' WHERE `id_client`='?'";

			ps = this.connection.prepareStatement(attributeCounter);
			ps.setInt(8, client.getIdclient());
			ps.setInt(1, idclient);

			rs = ps.executeQuery();
			while (rs.next()) {

				client = new Client(client.getIdclient(), client.getNom(), client.getPrenom(), client.getAdresse(),
						client.getCodepostal(), client.getVille(), client.getTelephone());
			}

			int verifAttribute = ps.executeUpdate();

			return verifAttribute == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean withdrawal(double montant) {

		String retraitReq = "UPDATE comptecourant SET solde=? WHERE numero=?";
		CompteCourant compte = null;
		PreparedStatement ps = null;
		Double solde;

		if (montant < compte.getSolde()) {
			solde = compte.getSolde() - montant;
		}

		try {
			ps = this.connection.prepareStatement(retraitReq);
			ps.setInt(1, compte.getIdCompteBancaire());
			ps.setDouble(2, compte.getSolde());

			int verifRetrait = ps.executeUpdate();

			return verifRetrait == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deposit(double montant) {

		String depotReq = "UPDATE compteepargne SET solde=? WHERE numero=?";
		CompteBancaire compte = null;

		PreparedStatement ps = null;
		ResultSet rs = null;

		if (montant < compte.getSolde()) {
			Double solde = compte.getSolde() + montant;
		}

		try {

			ps = this.connection.prepareStatement(depotReq);
			ps.setInt(1, compte.getIdCompteBancaire());
			ps.setDouble(2, compte.getSolde());

			int verifDepot = ps.executeUpdate();

			return verifDepot == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean transfert(double montant) {

		String transReq = " UPDATE compteepargne SET solde=? WHERE numero=?";

		PreparedStatement ps = null;

		CompteEpargne compteE = null;

		CompteCourant compteC = null;

		Double soldeE = compteE.getSolde();
		Double soldeC = compteC.getSolde();

		if (montant < compteE.getSolde()) {
			soldeE = soldeE - montant;
			soldeC = soldeC + montant;
		}

		try {

			ps = this.connection.prepareStatement(transReq);
			ps.setInt(1, compteE.getIdCompteBancaire());
			ps.setDouble(2, compteE.getSolde());

			int verifTransf = ps.executeUpdate();

			return verifTransf == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}