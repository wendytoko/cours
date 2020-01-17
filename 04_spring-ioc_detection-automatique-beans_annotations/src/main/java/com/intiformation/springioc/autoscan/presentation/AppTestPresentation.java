package com.intiformation.springioc.autoscan.presentation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.springioc.autoscan.bean.Employe;
import com.intiformation.springioc.autoscan.service.EmployeService;

public class AppTestPresentation {

	public static void main(String[] args) {
		
		/*////////////////////////////////////////////////*/
		/*///// CONFIG XML ///////////////////////////////*/
		/*////////////////////////////////////////////////*/
		
		/*=================================================*/
		/*=== AJOUT D'UN EMPLOYE DANS LA BDD ==============*/
		/*=================================================*/
		
		// 1. recup du conteneur IoC de spring 
		ApplicationContext conteneurSpring = 
				new ClassPathXmlApplicationContext("applicationContext-autoscan.xml");
		
		// 2. récup du bean de la couche service à partir du conteneur 
		//    pour pouvoir intéragir avec la bbd 
		EmployeService employeManager = (EmployeService) conteneurSpring.getBean("employeServiceBean");
		
		// 3. déf d'un employé à ajouter dans la bdd 
		Employe employe3 = new Employe();
		employe3.setIdEmploye(3);
		employe3.setNom("Pierpont Barrette");
		employe3.setSalaire(50000.00);
		
		// 4. ajout de l'employé dans la bdd via le service 
		employeManager.addEmploye(employe3);
		
		/*=================================================*/
		/*=== LISTE DES EMPLOYES DANS LA BDD ==============*/
		/*=================================================*/
		// 1. récup de la liste des employes via le service 
		List<Employe> listeEmployesBDD = employeManager.findAllEmployes();
		
		//2. affichage 
		System.out.println("Liste des employés dans la bdd (config xml) ============================================");
		for (Employe emp : listeEmployesBDD) {
			System.out.println("\t > " + emp.getIdEmploye() + " - " + emp.getNom() + " - " + emp.getSalaire() +" €");
		}
		System.out.println("=========================================================================================");
		
		
		/*////////////////////////////////////////////////*/
		/*///// CONFIG ANNOTATIONS ///////////////////////*/
		/*////////////////////////////////////////////////*/
		
		// 1. récup du bean de la couche service à partir du conteneur 
		//    pour pouvoir intéragir avec la bbd 
		EmployeService employeAnnotManager = 
				(EmployeService) conteneurSpring.getBean("employeServiceAnnotBean");
		
		// 2. déf d'un employé à ajouter dans la bdd 
		Employe employe4 = new Employe();
		employe4.setIdEmploye(4);
		employe4.setNom("Rémy Hervé");
		employe4.setSalaire(45000.00);
		
		// 3. ajout de l'employé dans la bdd via le service 
		employeAnnotManager.addEmploye(employe4);
		
		// 4. récup de la liste des employes via le service 
		System.out.println("\n\nListe des employés dans la bdd (config annotations) ====================================");
		for (Employe emp : employeAnnotManager.findAllEmployes()) {
			System.out.println("\t > " + emp.getIdEmploye() + " - " + emp.getNom() + " - " + emp.getSalaire() +" €");
		}
		System.out.println("=========================================================================================");
		
		
		
	}//end main
}//end class 














