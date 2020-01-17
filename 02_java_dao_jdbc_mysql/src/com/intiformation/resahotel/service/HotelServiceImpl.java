package com.intiformation.resahotel.service;

import java.util.List;

import com.intiformation.resahotel.dao.HotelDaoImpl;
import com.intiformation.resahotel.model.Hotel;

/**
 * impl�mentation concr�te de la couche service pour l'h�tel <br/>
 * 
 * la couche service permet d'exposer les fonctionnalit�s du projet <br/>
 * elle permet aussi de traiter les donn�es de la DAO avant pr�sentation <br/>
 * 
 * @author INTIFORMATION
 *
 */
public class HotelServiceImpl implements IReservableService<Hotel>{
	
	// d�claration de la dao 
	private HotelDaoImpl hotelDao;
	
	/**
	 * ctor vide pour initialiser la dao 
	 */
	public HotelServiceImpl() {
		hotelDao = new HotelDaoImpl();
	}

	/**
	 * recup de liste des hotels dans la bdd 
	 */
	@Override
	public List<Hotel> findAll() {
		return hotelDao.getAll();
	}

	/**
	 * recup d'un h�tel via son id 
	 */
	@Override
	public Hotel findById(int idHotel) {
		return hotelDao.getById(idHotel);
	}

	/**
	 * ajout d'un h�tel 
	 */
	@Override
	public boolean ajouter(Hotel hotel) {
		return hotelDao.add(hotel);
	}

	/**
	 * modif d'un h�tel dans la bdd 
	 */
	@Override
	public boolean modifier(Hotel hotel) {
		return hotelDao.update(hotel);
	}

	/**
	 * supprime un hotel via son id dans la bdd 
	 */
	@Override
	public boolean supprimer(int idHotel) {
		return hotelDao.delete(idHotel);
	}

}//end class 
