package dao;

import java.sql.Connection;
import java.util.List;

import utilitaire.ConnexionMySQL;

public interface ICompteDao<T> {
	/* Recupération de la connection à la BDD */

	public Connection connexion = ConnexionMySQL.getConnection();

	/*-----------------------------------------------*/
	/*------Déclaration des méthodes CRUD------------*/
	/*-----------------------------------------------*/

	public boolean add(T t);

	public boolean delete(int numero);

	public boolean update(T t);

	List<T> getAll();

	T getById(int numero);

	/*-----------------------------------------------*/
	/*------Déclaration de méthodes spécifiques------*/
	/*-----------------------------------------------*/

	public CompteBancaire findCounter(int id_client);

	public boolean attributeCounter(int numero);

	public boolean withdrawal(double montant);

	public boolean deposit(double montant);

	public boolean transfert(double montant);

}
