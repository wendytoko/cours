package com.intiformation.client.presentation;

import java.util.List;

import com.intiformation.modele.Client;
import com.intiformation.service.ClientServiceImpl;

public class AppTestClient {

	public static void main(String[] args) {

		/*-----------------------------------------------------------*/
		/*----------Liste de tous les clients------------------------*/
		/*-----------------------------------------------------------*/

		ClientServiceImpl clientManager = new ClientServiceImpl();

		List<Client> listeclients = clientManager.getAll();
		System.out.println("Liste de tous les clients : \n");

		for (Client client : listeclients) {
			System.out.println("\t> - " + client);
		} // fin foreach

		/*-----------------------------------------------------------*/
		/*---------Ajout d'un nouveau client-------------------------*/
		/*-----------------------------------------------------------*/

		Client client = new Client(11, "Poulain", "Sarah", "rue des guitares", 94120, "Cluny", 0626362541);
		System.out.println("Ajout avec succès d'une nouvelle et gentille cliente : ");

		System.out.println(client);

		if (clientManager.add(client)) {

			// true => ajout ok

			System.out.println("\t INFO : la gentille cliente à été ajouté avec succès");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : l'ajout de la gentille cliente a échoué");
		}

		/*-----------------------------------------------------------*/
		/*----------Modification d'un client par son id--------------*/
		/*-----------------------------------------------------------*/

		System.out.println("Modification d'un autre gentil client à l'id=5");

		
		Client clientModif = clientManager.getById(5);

		clientModif.setNom("Olivier");
		clientModif.setPrenom("Ombeline");
		
	
		System.out.println(clientModif);

		if (clientManager.update(clientModif)) {
			System.out.println("\t INFO : le nom du gentil client à été modifié avec succès");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : la modification du gentil client a échoué");
		}

		/*-----------------------------------------------------------*/
		/*----------Suppression d'un client par son id---------------*/
		/*-----------------------------------------------------------*/

		Client clientSupp = clientManager.getById(11);
		System.out.println("Suppression d'un méchant client via son id");

		if (clientManager.delete(11)) {
			System.out.println("\t INFO : la suppression du méchant client a été réalisée avec succès");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : la suppression du méchant client a échoué (peut être qu'il était gentil)");
		}

		/*-----------------------------------------------------------*/
		/*----------Récupération d'un client par son id---------------*/
		/*-----------------------------------------------------------*/
Client clientRecup = new Client();
		 clientRecup = clientManager.getById(1);

		System.out.println("Récupération d'un gentil client via son id");
		System.out.println("\t INFO : " + clientRecup);

	}// fin main
}// fin classe
