package com.intiformation.resahotel.presentation;

import java.util.List;

import com.intiformation.resahotel.model.Hotel;
import com.intiformation.resahotel.service.HotelServiceImpl;

/**
 * couche pr�sentation
 * 
 * @author INTIFORMATION
 *
 */
public class AppTestHotels {

	public static void main(String[] args) {

		/*----------------------------------------------------------*/
		/*---- R�cup de la liste des h�tels dans la bdd ------------*/
		/*----------------------------------------------------------*/

		/**
		 * recup de la liste des h�tels via la couche service
		 */

		// 1. cr�ation d'un objet de la couche service
		HotelServiceImpl hotelManager = new HotelServiceImpl();

		// 2. invocation de la couche service pour la r�cup des hotels
		List<Hotel> listeHotelsBDD = hotelManager.findAll();

		// 3. affichage
		System.out.println("Liste des h�tels dans la BDD : ");
		for (Hotel h : listeHotelsBDD) {
			System.out.println("\t -> " + h);
		} // end foreach

		/*----------------------------------------------------------*/
		/*---- R�cup d'un h�tel via son id dans la bdd -------------*/
		/*----------------------------------------------------------*/
		Hotel hotel = hotelManager.findById(1);
		System.out.println("\nD�tails de l'h�tel � l'id 1 : ");
		System.out.println("\t -> " + hotel);

		/*----------------------------------------------------------*/
		/*---- Ajout d'un h�tel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		// hotel a ajouter
		Hotel hotelAdd = new Hotel(5, "Trafalgar Hotel", "*****");

		// ajout de l'hotel via la couche service
		System.out.println("\nAjout d'un h�tel : ");

		if (hotelManager.ajouter(hotelAdd)) {
			// true => ajout ok
			System.out.println("\t INFO : l'h�tel � �t� ajout� avec succ�s");
		} else {
			// false => ajout not ok
			System.out.println("\t INFO : l'ajout de l'h�tel � �chou�");
		}

		/*----------------------------------------------------------*/
		/*---- Modif d'un h�tel dans la bdd ------------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nModification de l'h�tel id=5 dans la bdd : ");

		// recup de l'h�tel � modifier dans la bdd via le service
		Hotel hotelModif = hotelManager.findById(5);

		// modif de l'h�tel
		hotelModif.setLibelle("Trafalgar Palace");
		hotelModif.setEtoile("*******");

		// modif dans la bdd via le service
		if (hotelManager.modifier(hotelModif)) {
			// true => modif ok
			System.out.println("\t INFO : l'h�tel � �t� modifi� avec succ�s");
		} else {
			// false => modif not ok
			System.out.println("\t FATAL : la modif de l'h�tel � �chou�e");
		}
		
		/*----------------------------------------------------------*/
		/*---- suppression d'un h�tel dans la bdd ------------------*/
		/*----------------------------------------------------------*/
		System.out.println("\nSuppression de l'h�tel id=5 dans la bdd : ");
		
		// suppression via le service 
		if (hotelManager.supprimer(5)) {
			// true => supp ok
			System.out.println("\t INFO : l'h�tel � �t� supprim� avec succ�s");
		} else {
			// false => supp not ok
			System.out.println("\t FATAL : la suppression de l'h�tel � �chou�e");
		}

	}// end main

}// end class

















