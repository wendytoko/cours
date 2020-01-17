package com.intiformation.testConstantes;

public class Constantes {
	/** 
	 * NB : > le mot final designe une constante
	 *      > final = affectation d'une valeur � la variable
	 *                une seule fois pour toutes     
	 *      > convention nommage : MAJUSCULE  
	 *      > initialisation de la valeur = soit � ma d�claration
	 *                                      soit via un ctor       
	 */

	// d�claration de constantes = attributs d'instance (objet)//
	// attributs d'instance = accessible via la cr�ation d'un objet = objet.A / objet.B

	final int A = 10;
	final int B;
	
	// d�claration de constantes avec le mot 'static'= attribut de classe//
	// accessible via la classe donc pas besoin d'objet Constantes.C
	// donc C est une constante de classe
	static final int C = 100;
	
	
	/** ctor pour initalliser B
	 * 
	 * @param B
	 */
	public Constantes(int B) {
		
		this.B = B;
	}// 
	
}// fin classe
