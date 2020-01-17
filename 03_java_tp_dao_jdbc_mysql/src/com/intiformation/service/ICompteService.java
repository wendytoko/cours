package com.intiformation.service;

import java.util.List;

public interface ICompteService <T> {
	
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
