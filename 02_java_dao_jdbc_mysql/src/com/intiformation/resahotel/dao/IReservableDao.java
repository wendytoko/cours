package com.intiformation.resahotel.dao;

import java.sql.Connection;
import java.util.List;

import com.intiformation.resahotel.utilitaire.ConnexionMySQL;

/**
 * interface de la couche DAO <br/>
 * expose les méthodes de la couche DAO <br/>
 * 
 * @author INTIFORMATION
 *
 */
public interface IReservableDao<T> {

	// recup de la connexion a la bdd
	public Connection connection = ConnexionMySQL.getConnection();

	// définition des méthodes à expposer dans la dao

	public List<T> getAll();

	public T getById(int id);

	public boolean add(T t);

	public boolean update(T t);

	public boolean delete(int id);

}// end interface
