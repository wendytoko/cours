package com.intiformation.structure.de.boucle;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AppTestCONTINUE {

	public static void main(String[] args) {
		
		// compter le nb de 's' dans une chaine de caract�res
		
		String chaine = "les chaussettes de la duchesse sont-elles s�ches ou archi s�ches";
				
				//1 compter le nb de s
				//1.1 taille de la chaine
				
				int max = chaine.length();
				int counter = 0;
				
				//ou
				
				for(int i = 0; i < max; i++) {
					if (chaine.charAt(i) i = 's') {
							
							// permet d'interrompre l'it�ration courante d'une boucle
							// et permet � l'it�ration suivante
						continue;
						
					}//fin if
				}// fin for
		System.out.println("il y a" + i + "dans la phrase");
		
	}// fin main

}// fin classe
