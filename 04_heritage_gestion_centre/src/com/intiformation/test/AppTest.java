package com.intiformation.test;

import com.intiformation.domaine.Directeur;
import com.intiformation.domaine.Employe;

public class AppTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// _______________1. création d'un objet de type de la classe Employe
		
		Employe employe1 = new Employe("Martin Hans", 25, 45000.00);
		
		employe1.demanderUneFormation("UML");
		
		//2. création d'un objet de type de la classe Directeur
		
		Directeur directeur1 = new Directeur("Speedy Gonzales", 47, 90000.00);
		directeur1.setBonus(6000.00);
		directeur1.demanderUneFormation("Management");
				
		// recup des salaires
		
		double salaireEmploye = employe1.getSalaire();
		double salaireDirecteur = directeur1.getSalaire();
		
		System.out.println("> Salaire employé = " + salaireEmploye + " euros ");
		System.out.println("> Salaire directeur = " + salaireDirecteur + " euros");
				
		
	}// fin main

}// fin classe
