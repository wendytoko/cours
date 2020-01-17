package dao;

import java.sql.Connection;
import java.util.List;

import utilitaire.ConnexionMySQL;

public interface ICompteDao<T> {
	/* Recup�ration de la connection � la BDD */

	public Connection connexion = ConnexionMySQL.getConnection();

	/*-----------------------------------------------*/
	/*------D�claration des m�thodes CRUD------------*/
	/*-----------------------------------------------*/

	public boolean add(T t);

	public boolean delete(int numero);

	public boolean update(T t);

	List<T> getAll();

	T getById(int numero);

	/*-----------------------------------------------*/
	/*------D�claration de m�thodes sp�cifiques------*/
	/*-----------------------------------------------*/

	public CompteBancaire findCounter(int id_client);

	public boolean attributeCounter(int numero);

	public boolean withdrawal(double montant);

	public boolean deposit(double montant);

	public boolean transfert(double montant);

}
