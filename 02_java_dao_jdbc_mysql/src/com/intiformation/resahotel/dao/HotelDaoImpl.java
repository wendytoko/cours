package com.intiformation.resahotel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.intiformation.resahotel.model.Hotel;

/**
 * couche dao pour l'hôtel <br/>
 * classe concrète de la couche dao qui implémente l'interface de la dao
 * IReservable <br/>
 * 
 * @author INTIFORMATION
 *
 */
public class HotelDaoImpl implements IReservableDao<Hotel> {

	/**
	 * recup de la liste des hotels dans la bdd <br/>
	 */
	@Override
	public List<Hotel> getAll() {
		
		ResultSet rs = null;
		Hotel hotel = null;
		List<Hotel> listeHotels = new ArrayList<>();

		try {

			rs = this.connection.prepareStatement("SELECT * FROM hotels").executeQuery();
			
			while (rs.next()) {

				hotel = new Hotel(rs.getInt(1), rs.getString(2), rs.getString(3));
				
				listeHotels.add(hotel);

			} // end while

			return listeHotels;

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
		
	}//end getAll() 

	/**
	 * recup d'un hotel via son id dans la bdd <br/>
	 */
	@Override
	public Hotel getById(int pIdHotel) {
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		Hotel hotel = null;

		try {

			ps = this.connection.prepareStatement("SELECT * FROM hotels WHERE id_hotel=?");
			
			ps.setInt(1, pIdHotel);

			rs = ps.executeQuery();
			
			rs.next();

			hotel = new Hotel(rs.getInt(1), rs.getString(2), rs.getString(3));

			return hotel;

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

	/**
	 * ajout d'un hotel
	 */
	@Override
	public boolean add(Hotel pHotel) {
		
		PreparedStatement ps = null;

		try {

			String addReq = "INSERT INTO hotels (id_hotel,libelle,etoile) VALUES (?,?,?)";
			
			ps = this.connection.prepareStatement(addReq);

			ps.setInt(1, pHotel.getIdHotel());
			ps.setString(2, pHotel.getLibelle());
			ps.setString(3, pHotel.getEtoile());

			int verifAdd = ps.executeUpdate();

			// opérateur ternaire : si verifAdd == 0 retourne false sinon retourne true
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
	}//end add 

	/**
	 * modif d'un hotel
	 */
	@Override
	public boolean update(Hotel pHotel) {
		
		PreparedStatement ps = null;

		try {

			String majReq = "UPDATE hotels SET libelle=? ,etoile=? WHERE id_hotel=?";
			
			ps = this.connection.prepareStatement(majReq);

			ps.setInt(3, pHotel.getIdHotel());
			ps.setString(1, pHotel.getLibelle());
			ps.setString(2, pHotel.getEtoile());

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

	/**
	 * suppression d'un hotel via son id <br/>
	 */
	@Override
	public boolean delete(int pIdHotel) {
		
		PreparedStatement ps = null;

		try {

			String suppReq = "DELETE FROM hotels WHERE id_hotel=?";
			
			ps = this.connection.prepareStatement(suppReq);
			ps.setInt(1, pIdHotel);

			int verifSupp = ps.executeUpdate();

			return verifSupp == 0 ? false : true;

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

}// end class
