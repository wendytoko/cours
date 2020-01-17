package com.intiformation.modele;

import java.awt.List;
import java.util.ArrayList;

public class AppTestArrayList {
	
	/** ArrayList : collection de type liste
	 * > similaire aux tableaux mais ave un aspect dynamique
	 * > ajuste sa capacité à mesure qu'on ajoute ou supprime
	 * des élements
	 * 
	 * @param args
	 */
public static void main(String[] args) {
	
	//1. creation d'une ligne de type ArrayList
	// stockage des objets personnes
	
	ArrayList<Personnel> listePersonnes = new ArrayList<>();
	
	java.util.List<Personnel> listePersonnel = new ArrayList<>(); //typage haut
	
	
	
	//2. cration des objets personnes à ajouter
	
	Personnel personne1 = new Personnel ("Wendy");
	Personnel personne2 = new Personnel ("Naomie");
	Personnel personne3 = new Personnel ("François");
	Personnel personne4 = new Personnel ("Brahan");
	
	//3.ajout des personnes avec la méthode add() de a classe ArrayList
	
	listePersonnes.add(personne1);
	listePersonnes.add(personne2);
	listePersonnes.add(personne3);
	listePersonnes.add(personne4);
	
	//4. recup du nb d'élements de la liste (taille de la liste)
	int tailleListe = listePersonnes.size();
	System.out.println("il y a " + tailleListe + "personnes (s) dans la liste");
	
	//5.
	System.out.println("Liste des personnes : ");
	
	for(Personnel pax : listePersonnes) {
		
		System.out.println(pax.getNom());
	
	}// end for each
	
	
}// fin main
	
}// end classe
