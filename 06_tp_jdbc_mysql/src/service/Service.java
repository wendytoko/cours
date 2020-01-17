package service;

import java.util.List;

import dao.ClientDaoImpl;
import modele.Client;

public class Service implements IService<Client> {
	ClientDaoImpl clientDao = new ClientDaoImpl();

	public Service() {
		
		
	}
	
	

	@Override
	public boolean ajouter(Client client) {
		// TODO Auto-generated method stub
		return clientDao.add(client);
	}

	@Override
	public boolean supprimer(int id) {
		// TODO Auto-generated method stub
		return clientDao.delete(id);
	}

	@Override
	public boolean modifier(Client client) {
		// TODO Auto-generated method stub
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

}
