package com.intiformation.resahotel.presentation;

import java.util.List;

import com.intiformation.resahotel.model.Hotel;
import com.intiformation.resahotel.service.HotelServiceImpl;

/**
 * couche présentation
 * 
 * @author INTIFORMATION
 *
 */
public class AppTestHotels {

	public static void main(String[] args) {

		/*----------------------------------------------------------*/
		/*---- Récup de la liste des hôtels dans la bdd ------------*/
		/*----------------------------------------------------------*/

		/**
		 * recup de la liste des hôtels via la couche service
		 */

		// 1. création d'un objet de la couche service
		HotelServiceImpl hotelManager = new HotelServiceImpl();

		// 2. invocation de la couche service pour la récup des hotels
		List<Hotel> listeHotelsBDD = hotelManager.findAll();

		// 3. affichage
		System.out.println("Liste des hôtels dans la BDD : ");
		for (Hotel h : listeHotelsBDD) {
			System.out.println("\t -> " + h);
		} // end foreach

		/*----------------------------------------------------------*/
		/*---- Récup d'un hôtel via son id dans la bdd -------------*/
		/*----------------------------------------------------------*/
		Hotel hotel = hotelManager.findById(1);
		System.out.println("\nDétails de l'hôtel à l'id 1 : ");
		System.out.println("\t -> " + hotel);

		/*----------------------------------------------------------*/
		/*---- Ajout d'un hôtel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		// hotel a ajouter
		Hotel hotelAdd = new Hotel(5, "Trafalgar Hotel", "*****");

		// ajout de l'hotel via la couche service
		System.out.println("\nAjout d'un hôtel : ");

		if (hotelManager.ajouter(hotelAdd)) {
			// true => ajout ok
			System.out.println("\t INFO : l'hôtel à été ajouté avec succès");
		} else {
			// false => ajout not ok
			System.out.println("\t INFO : l'ajout de l'hôtel à échoué");
		}

		/*----------------------------------------------------------*/
		/*---- Modif d'un hôtel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nModification de l'hôtel id=5 dans la bdd : ");

		// recup de l'hôtel à modifier dans la bdd via le service
		Hotel hotelModif = hotelManager.findById(5);

		// modif de l'hôtel
		hotelModif.setLibelle("Trafalgar Palace");
		hotelModif.setEtoile("*******");

		// modif dans la bdd via le service
		if (hotelManager.modifier(hotelModif)) {
			// true => modif ok
			System.out.println("\t INFO : l'hôtel à été modifié avec succès");
		} else {
			// false => modif not ok
			System.out.println("\t FATAL : la modif de l'hôtel à échouée");
		}
		
		/*----------------------------------------------------------*/
		/*---- suppression d'un hôtel dans la bdd ------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nSuppression de l'hôtel id=5 dans la bdd : ");
		
		// suppression via le service 
		if (hotelManager.supprimer(5)) {
			// true => supp ok
			System.out.println("\t INFO : l'hôtel à été supprimé avec succès");
		} else {
			// false => supp not ok
			System.out.println("\t FATAL : la suppression de l'hôtel à échouée");
		}

	}// end main

}// end class

















