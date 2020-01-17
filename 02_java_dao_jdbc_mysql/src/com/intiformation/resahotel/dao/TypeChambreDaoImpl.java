package com.intiformation.resahotel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.intiformation.resahotel.model.Hotel;
import com.intiformation.resahotel.model.TypeChambre;

/**
 * 
 * @author INTIFORMATION
 *
 */
public class TypeChambreDaoImpl implements IReservableDao<TypeChambre>{

	@Override
	public List<TypeChambre> getAll() {

		ResultSet rs = null;
		TypeChambre typeChambre = null;
		List<TypeChambre> listeTypesChambres = new ArrayList<>();

		try {

			rs = this.connection.prepareStatement("SELECT * FROM types_chambres").executeQuery();
			
			while (rs.next()) {

				typeChambre = new TypeChambre(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				
				listeTypesChambres.add(typeChambre);

			} // end while

			return listeTypesChambres;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				// if (connexion != null)connexion.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public TypeChambre getById(int id) {
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		TypeChambre typeChambre = null;

		try {

			ps = this.connection.prepareStatement("SELECT * FROM types_chambres WHERE id_type_chambre=?");
			
			ps.setInt(1, id);

			rs = ps.executeQuery();
			
			rs.next();

			typeChambre = new TypeChambre(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

			return typeChambre;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
		
	}//end getById

	@Override
	public boolean add(TypeChambre pTypeChambre) {
		PreparedStatement ps = null;

		try {

			String addReq = "INSERT INTO types_chambres (nombre_lit,type_lit,description) VALUES (?,?,?)";
			
			ps = this.connection.prepareStatement(addReq);

			ps.setString(1, pTypeChambre.getNombreLit());
			ps.setString(2, pTypeChambre.getTypeLit());
			ps.setString(3, pTypeChambre.getDescription());

			int verifAdd = ps.executeUpdate();

			// opérateur ternaire : si verifAdd == 0 retourne false sinon retourne true
			return verifAdd == 1 ? true : false;

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
	}//end add 

	@Override
	public boolean update(TypeChambre pTypeChambre) {

		PreparedStatement ps = null;

		try {

			String majReq = "UPDATE types_chambres SET nombre_lit=? ,type_lit=?,description=? WHERE id_type_chambre=?";
			
			ps = this.connection.prepareStatement(majReq);

			ps.setString(1, pTypeChambre.getNombreLit());
			ps.setString(2, pTypeChambre.getTypeLit());
			ps.setString(3, pTypeChambre.getDescription());
			ps.setInt(4, pTypeChambre.getIdTypeChambre());

			int verifMaj = ps.executeUpdate();

			return verifMaj == 0 ? false : true;

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

	@Override
	public boolean delete(int pIdTypeChambre) {
		PreparedStatement ps = null;

		try {

			String suppReq = "DELETE FROM types_chambres WHERE id_type_chambre=?";
			
			ps = this.connection.prepareStatement(suppReq);
			ps.setInt(1, pIdTypeChambre);

			int verifSupp = ps.executeUpdate();

			return verifSupp == 1 ? true : false;

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
		
	}//end delete 

}
