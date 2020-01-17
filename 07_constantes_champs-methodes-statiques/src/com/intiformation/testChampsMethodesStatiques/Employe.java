package com.intiformation.testChampsMethodesStatiques;

public class Employe {
	
// declaration de variable = variable d'instance (une variable d'objet) ou un champ d'instance
	// accès via l'objet
	
	protected int idEmploye;
	
	// déclaration d'une variable (ou champ) de classe
	// variable de classe = accès via classe
	protected static int nextIdEmploye;
	
	public Employe(int idEmploye) {
		//  initialisaton de la variable d'instance idEmploye
		this.idEmploye = idEmploye;
		
		// utilisation du champ de classe nextIdEmploye comme compteur
		// compter nle nombre d'obet (ou d'instances) crée

		nextIdEmploye ++;
		
		
	}// fin ctor
		
	/** methodes statiques
	 * 
	 *   > elles n'opèrent pas sur les objets
	 *   
	 *   > accès via la classe = <nom classe>.<nom_methode_statique>
	 *   
	 *   > pas d'accès aux champs d'instances à partir de méthodes statiques
	 *   
	 *   > accès aux champs statiques dans la classe
	 */
	/** methode statique qui permet de renvoyer le nombre d'objets crée */
	
	public static int recupererNombreObjets () {
		
	return nextIdEmploye;
	
		
		
	}// fin methode statique
	
	
	
	
	
	
	
}// fin classe
