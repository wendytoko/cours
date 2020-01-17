package com.intiformation.testChampsMethodesStatiques;

public class AppTestChampsStatiques {

	public static void main(String[] args) {
		
		//1. creation d'objets de type Employe
		
		Employe employe1 = new Employe(256);
		Employe employe2 = new Employe(254);
		Employe employe3 = new Employe(257);
		Employe employe4 = new Employe(258);
		Employe employe5 = new Employe(259);
		
		//2. affichage des identifiants
		
		System.out.println(" id employe1 = " + employe1.idEmploye);
		System.out.println(" id employe2 = " + employe2.idEmploye);
		System.out.println(" id employe3 = " + employe3.idEmploye);
		System.out.println(" id employe4 = " + employe4.idEmploye);
		System.out.println(" id employe5 = " + employe5.idEmploye);
				
		System.out.println(" ");
		
		//3. affichage du nombre d'instances (objets) cr�es avec la variable classe nexxtIdEmploye
		// variable de classe = acc�s via la classe
		
		int nombreObjets = Employe.nextIdEmploye;
		
		System.out.println(" Nombre d'instances cr�es = " + nombreObjets);
		
		//4. test methode statique
		
	int nombreInstances = Employe.recupererNombreObjets();
	
	System.out.println(" (m�th static) Nombre d'instances cr�es = " + nombreInstances);
	
	/** 
	 * untilisation des m�thodes statiques :
	 * > cr�ation de biblioth�ques de fonctions
	 * Exemple java : la classe 'Math' avec des m�thodes statiques
	 */
	Math.log(6);
	
	
	}// fin main
	
	
	
	
	
}// fin classe
