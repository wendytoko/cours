package com.intiformation.service;

import java.util.List;

public interface IClientService<C> {
	
	public boolean add(C client);// je vais pouvoir ajouter un client

	public boolean delete(int id);// je vais pouvoir supprimer un client

	public boolean update(C client);// je vais pouvoir modifier
	
	public List<C> getAll();// je vais pouvoir obtenir la liste de tous les clients
	
	public C getById(int id);// je vais pouvoir chercher un client grâce à son id

	
	

}// fin interface
