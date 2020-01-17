package com.intiformation.springioc.autoscan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.intiformation.springioc.autoscan.bean.Employe;
import com.intiformation.springioc.autoscan.dao.EmployeDAO;

/**
 * @Component
 * 		est équivaut en xml à : 
 * <bean id="employeServiceBean" 
	      class="com.intiformation.springioc.autoscan.service.EmployeService">
 * @author INTIFORMATION
 *
 */
@Component("employeServiceAnnotBean") // déclare la classe comme bean dans le conteneur spring 
public class EmployeService {

	/* ______________ props ______________________ */

	// déclaration de la dao
	@Autowired
	@Qualifier("employeDaoAnnotBean")
	private EmployeDAO employeDAO;

	/* ______________ méthodes ______________________ */

	/**
	 * ajout d'un employé
	 * 
	 * @param pEmploye
	 */
	public void addEmploye(Employe pEmploye) {
		employeDAO.ajouterEmploye(pEmploye);
	}

	/**
	 * liste des employes
	 * 
	 * @return
	 */
	public List<Employe> findAllEmployes() {
		return employeDAO.getAllEmployes();
	}

	/* ______________ getters/setters ______________________ */

	public EmployeDAO getEmployeDAO() {
		return employeDAO;
	}

	public void setEmployeDAO(EmployeDAO employeDAO) {
		this.employeDAO = employeDAO;
	}

}
