package com.intiformation.resahotel.service;

import java.util.List;

import com.intiformation.resahotel.dao.HotelDaoImpl;
import com.intiformation.resahotel.model.Hotel;

/**
 * implémentation concrète de la couche service pour l'hôtel <br/>
 * 
 * la couche service permet d'exposer les fonctionnalités du projet <br/>
 * elle permet aussi de traiter les données de la DAO avant présentation <br/>
 * 
 * @author INTIFORMATION
 *
 */
public class HotelServiceImpl implements IReservableService<Hotel>{
	
	// déclaration de la dao 
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
	 * recup d'un hôtel via son id 
	 */
	@Override
	public Hotel findById(int idHotel) {
		return hotelDao.getById(idHotel);
	}

	/**
	 * ajout d'un hôtel 
	 */
	@Override
	public boolean ajouter(Hotel hotel) {
		return hotelDao.add(hotel);
	}

	/**
	 * modif d'un hôtel dans la bdd 
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
