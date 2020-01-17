package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modele.Client;
import modele.CompteCourant;
import modele.CompteEpargne;

public class CompteDaoImpl implements ICompteDao<CompteBancaire> {

	public CompteDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(CompteBancaire pCompteBancaire) {
		String addReq = "INSERT INTO comptebancaire (numero,solde) VALUES (?,?)";

		PreparedStatement ps;

		try {
			ps = this.connexion.prepareStatement(addReq);

			ps.setInt(1, pCompteBancaire.getNumero());
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
	public boolean delete(int numero) {

		String deleteReq = "DELETE FROM comptebancaire WHERE `numero`='?'";

		PreparedStatement ps = null;

		try {
			ps = this.connexion.prepareStatement(deleteReq);

			ps.setInt(1, numero);

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
		String updateReq = "UPDATE comptebancaire` SET `solde`='?' WHERE `numero`='?'";

		PreparedStatement ps = null;

		try {
			ps = this.connexion.prepareStatement(updateReq);

			ps.setInt(1, pCompteBancaire.getNumero());
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
		List<CompteBancaire> liste = new ArrayList<CompteBancaire>();
		CompteBancaire compte;

		PreparedStatement ps = null;
		String recupReq = "SELECT * from comptebancaire";
		ResultSet rs = null;

		try {
			ps = this.connexion.prepareStatement(recupReq);

			rs = ps.executeQuery();

			while (rs.next()) {
				compte = new CompteBancaire(rs.getInt(1), rs.getDouble(2));
				liste.add(compte);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CompteBancaire getById(int numero) {

		String recupId = "SELECT * from comptebancaire WHERE numero=?";
		PreparedStatement ps = null;
		CompteBancaire compte = null;
		ResultSet rs;

		try {
			ps = this.connexion.prepareStatement(recupId);

			ps.setInt(1, compte.getNumero());

			rs = ps.executeQuery();
			while (rs.next()) {
				compte = new CompteBancaire(rs.getInt(1), rs.getDouble(2));

				return compte;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public CompteBancaire findCounter(int id_client) {

		String trouverCompte = "SELECT * FROM comptebancaire WHERE idCompteBancaire_id=?";
		PreparedStatement ps = null;
		ResultSet rs;
		CompteBancaire compte = null;

		try {

			ps = this.connexion.prepareStatement(trouverCompte);
			ps.setInt(1, compte.getNumero());
			rs = ps.executeQuery();

			while (rs.next()) {

				compte = new CompteBancaire(rs.getInt(1), rs.getDouble(2));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return compte;
	}

	@Override
	public boolean attributeCounter(int numero) {

		ResultSet rs = null;

		PreparedStatement ps = null;
		Client client = null;

		String attributeCounter = "UPDATE client WHERE idCompteBancaire_id=?";

		try {

			ps = this.connexion.prepareStatement(attributeCounter);
			ps.setInt(8, numero);

			rs = ps.executeQuery();
			while (rs.next()) {

				client = new Client(client.getId_client(), client.getNom(), client.getPrenom(), client.getAdresse(),
						client.getCode_postal(), client.getVille(), client.getTelephone());
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

		String retraitReq = "UPDATE comptebancaire SET solde=? WHERE numero=?";
		CompteCourant compte = null;
		PreparedStatement ps = null;
		Double solde;
		

		if(montant<compte.getSolde()) {
			solde = compte.getSolde() - montant;
		}

		try {
			ps = this.connexion.prepareStatement(retraitReq);
			ps.setInt(1, compte.getNumero());
			ps.setDouble(2, compte.getSolde());
			
			
			int verifRetrait = ps.executeUpdate();
			
			return verifRetrait==0? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deposit(double montant) {

		String depotReq = "UPDATE comptebancaire SET solde=? WHERE numero=?";
		CompteBancaire compte = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		if(montant<compte.getSolde()) {
			Double solde = compte.getSolde() + montant;
		}

		try {
			
			ps = this.connexion.prepareStatement(depotReq);
			ps.setInt(1, compte.getNumero());
			ps.setDouble(2, compte.getSolde());
			
			int verifDepot = ps.executeUpdate();
			
			return verifDepot==0? false : true;

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
		
		Double 
		
		if(montant<compteE.getSolde()) {
			solde
			
			
			
		}
		
		try {
			ps=this.connexion.prepareStatement(transReq);
			ps.setInt(1, compteE.getNumero());
			ps.setDouble(2, compteE.getSolde());
			
			int verifTransf = ps.executeUpdate();
			
			return verifTransf==0? false : true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		return false;
	}

}