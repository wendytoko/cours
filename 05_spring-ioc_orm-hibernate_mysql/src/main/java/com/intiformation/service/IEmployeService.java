package com.intiformation.service;

import java.util.List;

import com.intiformation.springioc.orm.bean.Employe;

public interface IEmployeService {
	
	public void addEmploye(Employe pEmploye);

	public void updateEmploye(Employe pEmploye);
	
	public void deleteEmploye(Integer pIdEmploye);
	
	public Employe getEmploye(Integer pIdEmploye);
	
	public List<Employe> getAll();

}
