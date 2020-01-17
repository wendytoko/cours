package com.intiformation.structure.de.boucle;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AppTestCONTINUE {

	public static void main(String[] args) {
		
		// compter le nb de 's' dans une chaine de caractères
		
		String chaine = "les chaussettes de la duchesse sont-elles sèches ou archi sèches";
				
				//1 compter le nb de s
				//1.1 taille de la chaine
				
				int max = chaine.length();
				int counter = 0;
				
				//ou
				
				for(int i = 0; i < max; i++) {
					if (chaine.charAt(i) i = 's') {
							
							// permet d'interrompre l'itération courante d'une boucle
							// et permet à l'itération suivante
						continue;
						
					}//fin if
				}// fin for
		System.out.println("il y a" + i + "dans la phrase");
		
	}// fin main

}// fin classe
