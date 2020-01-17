package com.intiformation.test.tableaux;

import java.util.Arrays;

public class AppTestTableaux {
	/*
	 * Les tableaux en java :
	 * 
	 * > structure de donn�es qui stocke des valeurs du m�me type
	 * > acc�s � chaque valeur via un indice
	 * > tableaux � 1 ou plusieurs dimensions
	 */
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
 		// 1. declaration de la variable du tableau d'entiers 'tabEntiers'
		
		int[] tabEntiers;
		
		// 2.cr�ation du tableau 'tabEntiers' avec 5 cases
		//2.1. avec l'op�rateur new
		
		tabEntiers = new int[5];
		
		// 2.2 {}
		
		int[] tableauEntiers = {23,56,58,69,452}; // cr�ation d'un tableau de 5 cases 
		
		// 2.3 new + {}
		
		String[] tabStrings = new String[] {"janvier","mars"};
		
		// 3. ajout dans le tableau 'tabEntiers' via les indices
		
		tabEntiers[0] = 777; //ajout de 777 dans la case d'indice 0 (la 1ere case)
		tabEntiers[1] = 36;
		tabEntiers[2] = 333;
		tabEntiers[3] = 654;
		tabEntiers[4] = 230;
		
		/**
		 * cas d'erreur apr�s dans l'execution car l'indice 10 n'existe pas
		 *
		tabEntiers[10] = 52;
		*/
		
		//4. recup d'un �l�ment du tableau via l'indice
		
		System.out.println("1er �l�ment : " + tabEntiers[0]);
		System.out.println("2eme �l�ment : " + tabEntiers[1]);
		System.out.println("3eme �l�ment : " + tabEntiers[2]);
		System.out.println("4eme �l�ment : " + tabEntiers[3]);
		System.out.println("5eme �l�ment : " + tabEntiers[4]);
		
		//5. taille du tableau = nombre de cases (nb d'�lements)
		
		int tailleTableau = tabEntiers.length;
		System.out.println("le tableau 'tabEntiers' a " + tailleTableau + " �lement(s)");
		
		//6. parcours du tableau avec la boucle FOR : 
		
		/**
		 * 6.1 boucle FOR classique
		 boucle FOR classique :
		 
		 for(initialisation indice; condiction; incr�mentation ou d�cr�mentation){
		 // traitement
		 }
		 
		 */
		
		
		
		System.out.println("liste des �l�ments du tableau");
		
		for(int i = 0; i < tabEntiers.length; i++) {
		
			System.out.println("\t indice " + i + " = " + tabEntiers[i]);
			
		}// fin boucle for
		
		/** 6.2 boucle FOR am�lior�e : FOR EACH
		 * 
		 */
		
		System.out.println("liste des �l�ments du tableau (for each)");
		
		for(int element :tabEntiers) {
			System.out.println("\t > " + element);
			
		}// fin for each
		
		//7. affichage du tableau soous forme de String
		// avec la classe 'Arrays'
		
		System.out.println("liste des �l�ments du tableau (Arrays");
		String contenuTab = Arrays.toString(tableauEntiers);
		System.out.println("\t > " + contenuTab);
		
		// tri du tableau en ascendant
		
		Arrays.sort(tabEntiers);
		System.out.println("liste des �l�ments du tableau tri�(Arrays)");
		
		for(int element :tabEntiers) {
			System.out.println("\t > " + element);
		}
		
		
	}// fin main

}// fin classe
