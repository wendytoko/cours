package com.intiformation.springioc.autoscan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.intiformation.springioc.autoscan.bean.Employe;

/**
 * @Component 
 *    est équivaut en xml à : 
 * <bean id="employeDaoBean" 
 *       class="com.intiformation.springioc.autoscan.dao.EmployeDAO">
 * 
 * @author INTIFORMATION
 *
 */
@Component("employeDaoAnnotBean") // déclaration de la classe comme bean dans le conteneur spring
public class EmployeDAO {

	/* _____________ props ________________ */

	// simulation d'une bdd avec une liste
	private List<Employe> employesDB = new ArrayList<>();

	/* _____________ méthodes ________________ */

	/**
	 * ajout d'un employé dans la bdd (liste)
	 * 
	 * @param pEmploye
	 */
	public void ajouterEmploye(Employe pEmploye) {
		employesDB.add(pEmploye);
	}

	/**
	 * recup de la liste des employes dans la bdd <br/>
	 * 
	 * @return
	 */
	public List<Employe> getAllEmployes() {
		return employesDB;
	}

	/* _____________ getters/setters ________________ */

	public List<Employe> getEmployesDB() {
		return employesDB;
	}

	public void setEmployesDB(List<Employe> employesDB) {
		this.employesDB = employesDB;
	}

}
