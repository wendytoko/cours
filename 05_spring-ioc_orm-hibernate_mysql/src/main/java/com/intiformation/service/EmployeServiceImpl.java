package com.intiformation.service;

import java.util.List;

import com.intiformation.dao.EmployeDaoImpl;
import com.intiformation.springioc.orm.bean.Employe;

public class EmployeServiceImpl implements IEmployeService{

	private EmployeDaoImpl employeDao ;
	/*
	 * La DAO sera injectée par le conteneur donc pas d'instanciation
	 */
	public void setEmployeDao(EmployeDaoImpl employeDao) {
		this.employeDao = employeDao;
	}// setter de la dao pour permettre au conteneur spring d'injecter le bean dao

	@Override
	public void addEmploye(Employe pEmploye) {
		
		employeDao.addEmploye(pEmploye);
	}


	@Override
	public void updateEmploye(Employe pEmploye) {
		employeDao.updateEmploye(pEmploye);
		
	}

	@Override
	public void deleteEmploye(Integer pIdEmploye) {
		employeDao.deleteEmploye(pIdEmploye);
		
	}

	@Override
	public Employe getEmploye(Integer pIdEmploye) {
	
		return employeDao.getEmploye(pIdEmploye);
	}

	@Override
	public List<Employe> getAll() {
		
		return employeDao.getAll();
	}

}
