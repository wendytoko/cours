package com.intiformation.service;

import java.util.List;

import com.intiformation.client.dao.CompteDaoImpl;
import com.intiformation.modele.CompteBancaire;

public class CompteServiceImpl implements ICompteService<CompteBancaire>{
	CompteDaoImpl compteDao;
	public CompteServiceImpl() {
		compteDao=new CompteDaoImpl();
	}
	
	

	@Override
	public boolean add(CompteBancaire pCompte) {
		// TODO Auto-generated method stub
		return compteDao.add(pCompte);
	}

	@Override
	public boolean delete(int idCompteBancaire) {
		// TODO Auto-generated method stub
		return compteDao.delete(idCompteBancaire);
	}

	@Override
	public boolean update(CompteBancaire pCompte) {
		// TODO Auto-generated method stub
		return compteDao.update(pCompte);
	}

	

	@Override
	public List<CompteBancaire> getAll() {
		// TODO Auto-generated method stub
		return compteDao.getAll();
	}

	@Override
	public CompteBancaire findCounter(int id_client) {
		// TODO Auto-generated method stub
		return compteDao.findCounter(id_client);
	}

	@Override
	public boolean attributeCounter(int id_client) {
		// TODO Auto-generated method stub
		return compteDao.attributeCounter(id_client);
	}

	@Override
	public boolean withdrawal(double montant) {
		// TODO Auto-generated method stub
		return compteDao.withdrawal(montant);
	}

	@Override
	public boolean deposit(double montant) {
		// TODO Auto-generated method stub
		return compteDao.deposit(montant);
	}

	@Override
	public boolean transfert(double montant) {
		// TODO Auto-generated method stub
		return compteDao.transfert(montant);
	}

}
