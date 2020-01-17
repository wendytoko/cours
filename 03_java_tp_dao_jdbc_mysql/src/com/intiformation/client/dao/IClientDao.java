package com.intiformation.client.dao;

import java.sql.Connection;
import java.util.List;

import com.intiformation.utilitaire.Connexion;

public interface IClientDao<C> {

	Connection connection = Connexion.getConnexion(); // je mets ma connection � la BDD

	public boolean add(C c);// je vais pouvoir ajouter un client

	public boolean delete(int id);// je vais pouvoir supprimer un client

	public boolean update(C c);// je vais pouvoir modifier
	
	public List<C> getAll();// je vais pouvoir obtenir la liste de tous les clients
	
	public C getById(int id);// je vais pouvoir chercher un client gr�ce � son id
	
	

}// fin interface

//je note toutes les m�thodes li�es au client