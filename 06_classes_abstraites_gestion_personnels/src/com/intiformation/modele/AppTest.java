package com.intiformation.modele;

public class AppTest {
	
public static void main(String[] args) {
	/**
	 * NB : impossible de cr�er un objet (instancier) d'une classe abstraite
	 * Personnel personne = new Personnel(); // -> erreur
	 */
	//1. cr�ation d'un objet de type Employ� 
	
	Personnel employe1 = new Employe("Gabriel Grang�");
	System.out.println(employe1.getNom() + " est " + employe1.decrirePersonnel());
	
	//2. cr�ation (instanciation) d'un objet de type CadreRH
	
	Cadre cadreRh = new CadreRH("Wendy Toko");
	System.out.println(cadreRh.getNom() + " est " + cadreRh.decrirePersonnel());
	System.out.println("> Mois travaill�s = " + cadreRh.calculerMoisTravailles());
	System.out.println("> Salaire Brut = " + cadreRh.calculerSalaireBrut() + " euros");
	System.out.println("> Indemnit�s cong�s = " + cadreRh.calculerIndemnitesConges() + " euros");
	System.out.println("> Prime Fin d'Ann�e = " + cadreRh.calculerPrimeFinAnnee() + " euros");
	 
	
}// fin main
}// fin classe
