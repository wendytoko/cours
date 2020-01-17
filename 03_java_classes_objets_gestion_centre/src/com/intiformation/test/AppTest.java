package com.intiformation.test;

import com.intiformation.domaine.Employe;
import com.intiformation.domaine.directeuragain;

public class AppTest {
	
	public static void main(String[] arg) {
		
		/* Cr�ation d'objet � partir de la classe Employ�*/
		// �tape 1 : d�claration de variables
		
		Employe employ�1;
		// etape 2 : cr�ation d'objets (instanciation)
		
		employ�1 = new Employe();
		
		// �tape 2.2 : affectation des valeurs pour les propri�t�s de l'objet
		
		employ�1.nom = " Beyonc� Coulibaly ";
		employ�1.age = 27;
		employ�1.salaire = 70000.00;
		
		
		// �tape 3 : utilisation des objets
		// invocation des m�thodes
		employ�1.demanderUneFormation("Java");
	
		
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
