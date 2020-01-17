package dao;

import java.sql.Connection;
import java.util.List;

import utilitaire.ConnexionMySQL;

public interface IClientDao <T>{
	
	/* Recup�ration de la connection � la BDD */
	
	public Connection connexion = ConnexionMySQL.getConnection();
	
	/*-----------------------------------------------*/
	/*------D�claration des m�thodes CRUD------------*/
	/*-----------------------------------------------*/
	
	public boolean add(T t);
	public boolean delete(int id);
	public boolean update(T t);
	List<T> getAll();
	T getById(int id);
	
	

}// fin interface
