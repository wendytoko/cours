package com.intiformation.test;

import com.intiformation.interfaces.IGraphique;
import com.intiformation.modele.Balle;
import com.intiformation.modele.Raquette;

/**
 * 
 * @author IN-MP-040
 *
 */

public class AppTest {
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/** NB : variable de type interface
				> en déclarant une interface, on déclare un type
				
					> on peut déclarer une variable
					> y affecter un objet d'une classe qui implémente l'interface */
		
		//déclaration d'une variable de type IGraphique
		
		IGraphique graphique;
		
		// création de l'objet Balle
		
		Balle balle = new Balle();
		
		// comme Balle implémente IGraphique,on peut affecter l'objet 'balle' à la car 'graphique'
		
		graphique = balle;
		
		// typage haut avec l'interface
		
		IGraphique raquette = new Raquette();
		
		
	}// fin main

}
