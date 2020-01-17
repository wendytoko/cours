package com.intiformation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.service.EmployeServiceImpl;
import com.intiformation.springioc.orm.bean.Employe;

public class AppTest {
	public static void main(String[] args) {
		
		
		ApplicationContext conteneurIoCSpring =
				new ClassPathXmlApplicationContext("applicationContext-all.xml");
		
	
		EmployeServiceImpl employeManager=
				(EmployeServiceImpl) conteneurIoCSpring.getBean("employeServiceBean");
		
		Employe employe1 = new Employe(1, "Julie Lescaut", 600000);
		Employe employe2 = new Employe(2, "Armand Thierry", 800000);
		Employe employe3 = new Employe(3, "Laure Manaudou", 10000);
		Employe employe4 = new Employe(4, "Naomie Campbell", 900000);
		
		employeManager.addEmploye(employe1);
		employeManager.addEmploye(employe2);
		employeManager.addEmploye(employe3);
		employeManager.addEmploye(employe4);
		
		System.out.println("Liste des employés dans la BDD ");
		for(Employe e : employeManager.getAll()) {
			System.out.println("\t> " + e.getIdEmploye() + " - " + e.getNom() + " - " + e.getSalaire());
		}
		
		
		
		
		
	}// fin main

}// fin classe
