package com.intiformation.service;

import java.util.List;

import com.intiformation.client.dao.ClientDaoImpl;
import com.intiformation.modele.Client;


public class ClientServiceImpl implements IClientService<Client> {
	
	
	
	private ClientDaoImpl clientDao;
	
	public ClientServiceImpl() {
		clientDao = new ClientDaoImpl();
	}// fin ctor
	
	

	@Override
	public boolean add(Client client) {
		// TODO Auto-generated method stub
		return clientDao.add(client);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return clientDao.delete(id);
	}

	@Override
	public boolean update(Client client) {
		// TODO Auto-generated method stubC
		return clientDao.update(client);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clientDao.getAll();
	}

	@Override
	public Client getById(int id) {
		// TODO Auto-generated method stub
		return clientDao.getById(id);
	}
		

}// fin classe
	
	