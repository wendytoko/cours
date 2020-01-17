package com.intiformation.modele;

public class AppTest {
	
public static void main(String[] args) {
	/**
	 * NB : impossible de créer un objet (instancier) d'une classe abstraite
	 * Personnel personne = new Personnel(); // -> erreur
	 */
	//1. création d'un objet de type Employé 
	
	Personnel employe1 = new Employe("Gabriel Grangé");
	System.out.println(employe1.getNom() + " est " + employe1.decrirePersonnel());
	
	//2. création (instanciation) d'un objet de type CadreRH
	
	Cadre cadreRh = new CadreRH("Wendy Toko");
	System.out.println(cadreRh.getNom() + " est " + cadreRh.decrirePersonnel());
	System.out.println("> Mois travaillés = " + cadreRh.calculerMoisTravailles());
	System.out.println("> Salaire Brut = " + cadreRh.calculerSalaireBrut() + " euros");
	System.out.println("> Indemnités congés = " + cadreRh.calculerIndemnitesConges() + " euros");
	System.out.println("> Prime Fin d'Année = " + cadreRh.calculerPrimeFinAnnee() + " euros");
	 
	
}// fin main
}// fin classe
