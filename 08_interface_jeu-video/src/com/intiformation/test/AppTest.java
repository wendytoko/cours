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
				> en d�clarant une interface, on d�clare un type
				
					> on peut d�clarer une variable
					> y affecter un objet d'une classe qui impl�mente l'interface */
		
		//d�claration d'une variable de type IGraphique
		
		IGraphique graphique;
		
		// cr�ation de l'objet Balle
		
		Balle balle = new Balle();
		
		// comme Balle impl�mente IGraphique,on peut affecter l'objet 'balle' � la car 'graphique'
		
		graphique = balle;
		
		// typage haut avec l'interface
		
		IGraphique raquette = new Raquette();
		
		
	}// fin main

}
