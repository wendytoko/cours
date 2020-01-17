package com.intiformation.testChampsMethodesStatiques;

public class Employe {
	
// declaration de variable = variable d'instance (une variable d'objet) ou un champ d'instance
	// acc�s via l'objet
	
	protected int idEmploye;
	
	// d�claration d'une variable (ou champ) de classe
	// variable de classe = acc�s via classe
	protected static int nextIdEmploye;
	
	public Employe(int idEmploye) {
		//  initialisaton de la variable d'instance idEmploye
		this.idEmploye = idEmploye;
		
		// utilisation du champ de classe nextIdEmploye comme compteur
		// compter nle nombre d'obet (ou d'instances) cr�e

		nextIdEmploye ++;
		
		
	}// fin ctor
		
	/** methodes statiques
	 * 
	 *   > elles n'op�rent pas sur les objets
	 *   
	 *   > acc�s via la classe = <nom classe>.<nom_methode_statique>
	 *   
	 *   > pas d'acc�s aux champs d'instances � partir de m�thodes statiques
	 *   
	 *   > acc�s aux champs statiques dans la classe
	 */
	/** methode statique qui permet de renvoyer le nombre d'objets cr�e */
	
	public static int recupererNombreObjets () {
		
	return nextIdEmploye;
	
		
		
	}// fin methode statique
	
	
	
	
	
	
	
}// fin classe
