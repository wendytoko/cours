package com.intiformation.resahotel.presentation;

import java.util.List;

import com.intiformation.resahotel.model.TypeChambre;
import com.intiformation.resahotel.service.TypeChambreServiceImpl;;

public class AppTestTypeChambre {

	public static void main(String[] args) {
		

		/*------------------------------------------------------------------*/
		/*---- Récup de la liste des types chambres dans la bdd ------------*/
		/*------------------------------------------------------------------*/

		/**
		 * recup de la liste des hôtels via la couche service
		 */

		// 1. création d'un objet de la couche service
		TypeChambreServiceImpl TypeChambreService = new TypeChambreServiceImpl();

		// 2. invocation de la couche service pour la récup des hotels
		List<TypeChambre> listeTypesChambresBDD = TypeChambreService.findAll();

		// 3. affichage
		System.out.println("Liste des types chambres dans la BDD : ");
		for (TypeChambre typeChambre : listeTypesChambresBDD) {
			System.out.println("\t -> " + typeChambre);
		} // end foreach

		/*----------------------------------------------------------*/
		/*---- Récup d'un hôtel via son id dans la bdd -------------*/
		/*----------------------------------------------------------*/
		TypeChambre typeChambre = TypeChambreService.findById(1);
		System.out.println("\nDétails de type chambre à l'id 1 : ");
		System.out.println("\t -> " + typeChambre);

		/*----------------------------------------------------------*/
		/*---- Ajout d'un hôtel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		// hotel a ajouter
		TypeChambre typeChambreAdd = new TypeChambre("1", "lit King size", "1 lit king size avec jaccuzi");

		// ajout de l'hotel via la couche service
		System.out.println("\nAjout d'un type de chambre : ");

		if (TypeChambreService.ajouter(typeChambreAdd)) {
			// true => ajout ok
			System.out.println("\t INFO : le type de chambre à été ajouté avec succès");
		} else {
			// false => ajout not ok
			System.out.println("\t INFO : l'ajout du type de chambre à échoué");
		}

		/*----------------------------------------------------------*/
		/*---- Modif d'un hôtel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nModification de type de chambre id=8 dans la bdd : ");

		// recup du type dechambre à modifier dans la bdd via le service
		TypeChambre typeChambreModif = TypeChambreService.findById(8);

		// modif de l'hôtel
		typeChambreModif.setNombreLit("2");
		typeChambreModif.setTypeLit("lits jumeaux");
		typeChambreModif.setDescription("la chambre est équipée de salle de bain privée avec baignoire, sèche-cheveux et de sanitaires privatifs.");

		// modif dans la bdd via le service
		if (TypeChambreService.modifier(typeChambreModif)) {
			// true => modif ok
			System.out.println("\t INFO : le type de chambre à été modifié avec succès");
		} else {
			// false => modif not ok
			System.out.println("\t FATAL : la modif du type de chambre à échouée");
		}
		
		/*----------------------------------------------------------*/
		/*---- suppression d'un hôtel dans la bdd ------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nSuppression de du type de chambre id=8 dans la bdd : ");
		
		// suppression via le service 
		if (TypeChambreService.supprimer(8)) {
			// true => supp ok
			System.out.println("\t INFO : le type de chambre à été supprimé avec succès");
		} else {
			// false => supp not ok
			System.out.println("\t FATAL : la suppression du type de chambre à échouée");
		}

	}// end main

}// end class