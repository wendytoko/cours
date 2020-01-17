package com.intiformation.dao;

import java.util.List;

import com.intiformation.springioc.orm.bean.Employe;

public interface IEmployeDao {

	public void addEmploye(Employe pEmploye);

	public void updateEmploye(Employe pEmploye);
	
	public void deleteEmploye(Integer pIdEmploye);
	
	public Employe getEmploye(Integer pIdEmploye);
	
	public List<Employe> getAll();
	
}
