package com.intiformation.resahotel.presentation;

import java.util.List;

import com.intiformation.resahotel.model.TypeChambre;
import com.intiformation.resahotel.service.TypeChambreServiceImpl;;

public class AppTestTypeChambre {

	public static void main(String[] args) {
		

		/*------------------------------------------------------------------*/
		/*---- R�cup de la liste des types chambres dans la bdd ------------*/
		/*------------------------------------------------------------------*/

		/**
		 * recup de la liste des h�tels via la couche service
		 */

		// 1. cr�ation d'un objet de la couche service
		TypeChambreServiceImpl TypeChambreService = new TypeChambreServiceImpl();

		// 2. invocation de la couche service pour la r�cup des hotels
		List<TypeChambre> listeTypesChambresBDD = TypeChambreService.findAll();

		// 3. affichage
		System.out.println("Liste des types chambres dans la BDD : ");
		for (TypeChambre typeChambre : listeTypesChambresBDD) {
			System.out.println("\t -> " + typeChambre);
		} // end foreach

		/*----------------------------------------------------------*/
		/*---- R�cup d'un h�tel via son id dans la bdd -------------*/
		/*----------------------------------------------------------*/
		TypeChambre typeChambre = TypeChambreService.findById(1);
		System.out.println("\nD�tails de type chambre � l'id 1 : ");
		System.out.println("\t -> " + typeChambre);

		/*----------------------------------------------------------*/
		/*---- Ajout d'un h�tel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		// hotel a ajouter
		TypeChambre typeChambreAdd = new TypeChambre("1", "lit King size", "1 lit king size avec jaccuzi");

		// ajout de l'hotel via la couche service
		System.out.println("\nAjout d'un type de chambre : ");

		if (TypeChambreService.ajouter(typeChambreAdd)) {
			// true => ajout ok
			System.out.println("\t INFO : le type de chambre � �t� ajout� avec succ�s");
		} else {
			// false => ajout not ok
			System.out.println("\t INFO : l'ajout du type de chambre � �chou�");
		}

		/*----------------------------------------------------------*/
		/*---- Modif d'un h�tel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nModification de type de chambre id=8 dans la bdd : ");

		// recup du type dechambre � modifier dans la bdd via le service
		TypeChambre typeChambreModif = TypeChambreService.findById(8);

		// modif de l'h�tel
		typeChambreModif.setNombreLit("2");
		typeChambreModif.setTypeLit("lits jumeaux");
		typeChambreModif.setDescription("la chambre est �quip�e de salle de bain priv�e avec baignoire, s�che-cheveux et de sanitaires privatifs.");

		// modif dans la bdd via le service
		if (TypeChambreService.modifier(typeChambreModif)) {
			// true => modif ok
			System.out.println("\t INFO : le type de chambre � �t� modifi� avec succ�s");
		} else {
			// false => modif not ok
			System.out.println("\t FATAL : la modif du type de chambre � �chou�e");
		}
		
		/*----------------------------------------------------------*/
		/*---- suppression d'un h�tel dans la bdd ------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nSuppression de du type de chambre id=8 dans la bdd : ");
		
		// suppression via le service 
		if (TypeChambreService.supprimer(8)) {
			// true => supp ok
			System.out.println("\t INFO : le type de chambre � �t� supprim� avec succ�s");
		} else {
			// false => supp not ok
			System.out.println("\t FATAL : la suppression du type de chambre � �chou�e");
		}

	}// end main

}// end class