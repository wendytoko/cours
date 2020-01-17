package com.intiformation.test;

import com.intiformation.domaine.Employe;
import com.intiformation.domaine.directeuragain;

public class AppTest {
	
	public static void main(String[] arg) {
		
		/* Création d'objet à partir de la classe Employé*/
		// étape 1 : déclaration de variables
		
		Employe employé1;
		// etape 2 : création d'objets (instanciation)
		
		employé1 = new Employe();
		
		// étape 2.2 : affectation des valeurs pour les propriétés de l'objet
		
		employé1.nom = " Beyoncé Coulibaly ";
		employé1.age = 27;
		employé1.salaire = 70000.00;
		
		
		// étape 3 : utilisation des objets
		// invocation des méthodes
		employé1.demanderUneFormation("Java");
	
		
		/* directeur*/
		
	
		Directeur directeur;
		
		directeur = new Directeur ();
		/* avant encapsulation */
		directeur.nom = "Alain Dupont";
		directeur.age = 55;
		directeur.salaire = 80000.00;
		
		/* apres encapsultation*/
		directeur.setNom("Alain Dupont");
		directeur.setAge (55);
		directeur.setSalaire (80000.00);
		
		/* recup nom directeur*/
		String nomDirecteur = directeur.getNom();
		System.out.println("Nom : " + nomDirecteur);
		 
		/* recup age et salaire */
		
		int ageDirecteur = directeur.getAge();
		System.out.println(ageDirecteur);
		
		double salaireDirecteur = directeur.getSalaire();
		System.out.println(salaireDirecteur);
		 
directeur.validerLaFormation("Management");
directeur.demanderUneFormation("Management");	

	}//fin main

}//fin AppTest
