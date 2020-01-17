package com.intiformation.client.dao;

import java.sql.Connection;
import java.util.List;

import com.intiformation.utilitaire.Connexion;



public interface ICompteDao<T> {
	/* Recup�ration de la connection � la BDD */

	public Connection connection = Connexion.getConnexion();

	/*-----------------------------------------------*/
	/*------D�claration des m�thodes CRUD------------*/
	/*-----------------------------------------------*/

	public boolean add(T t);

	public boolean delete(int idCompteBancaire);

	public boolean update(T t);

	public List<T> getAll();

	public T findCounter(int id_client);

	/*-----------------------------------------------*/
	/*------D�claration de m�thodes sp�cifiques------*/
	/*-----------------------------------------------*/


	public boolean attributeCounter(int idclient);

	public boolean withdrawal(double montant);

	public boolean deposit(double montant);

	public boolean transfert(double montant);

}
