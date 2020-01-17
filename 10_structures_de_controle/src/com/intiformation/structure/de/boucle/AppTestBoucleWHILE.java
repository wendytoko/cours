package com.intiformation.structure.de.boucle;

public class AppTestBoucleWHILE {
	
	public static void main(String[] args) {
		
		/**
		 * La boucle while :
		 * >> execution d'un bloc de fa�on r�p�titive
		 * tant que la condition est � true
		 */
		//affichage des nbres de 1 � 10
		int count = 1;
		
		while (count < 11) {
			
			System.out.println("count is : " + count);
			// condition de sortie
			count++;
			
		}// fin while
		
		//boucle do while
		/**
		 * fonctionnement identique que le while
		 * sauf que la condition est examin�e apr�s l'execution du bloc
		 */
		
		int compteur = 10;
		
		do {
			
			System.out.println("(do while) compteur : " + compteur);
			
			compteur--; // pour faire evoluer la condition
			
		} while (compteur > 0);
		
	}// fin main


}// fin classe
