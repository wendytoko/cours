package com.intiformation.resahotel.service;

import java.util.List;

/**
 * intercafe de la couche service <br/>
 * 
 * @author INTIFORMATION
 *
 */
public interface IReservableService<T> {

	public List<T> findAll();

	public T findById(int id);

	public boolean ajouter(T t);

	public boolean modifier(T t);

	public boolean supprimer(int id);
	
}//end interface 
