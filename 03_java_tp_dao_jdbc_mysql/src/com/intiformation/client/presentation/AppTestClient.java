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
		System.out.println("Ajout avec succ�s d'une nouvelle et gentille cliente : ");

		System.out.println(client);

		if (clientManager.add(client)) {

			// true => ajout ok

			System.out.println("\t INFO : la gentille cliente � �t� ajout� avec succ�s");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : l'ajout de la gentille cliente a �chou�");
		}

		/*-----------------------------------------------------------*/
		/*----------Modification d'un client par son id--------------*/
		/*-----------------------------------------------------------*/

		System.out.println("Modification d'un autre gentil client � l'id=5");

		
		Client clientModif = clientManager.getById(5);

		clientModif.setNom("Olivier");
		clientModif.setPrenom("Ombeline");
		
	
		System.out.println(clientModif);

		if (clientManager.update(clientModif)) {
			System.out.println("\t INFO : le nom du gentil client � �t� modifi� avec succ�s");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : la modification du gentil client a �chou�");
		}

		/*-----------------------------------------------------------*/
		/*----------Suppression d'un client par son id---------------*/
		/*-----------------------------------------------------------*/

		Client clientSupp = clientManager.getById(11);
		System.out.println("Suppression d'un m�chant client via son id");

		if (clientManager.delete(11)) {
			System.out.println("\t INFO : la suppression du m�chant client a �t� r�alis�e avec succ�s");
		} else {

			// false => ajout not ok
			System.out.println("\t INFO : la suppression du m�chant client a �chou� (peut �tre qu'il �tait gentil)");
		}

		/*-----------------------------------------------------------*/
		/*----------R�cup�ration d'un client par son id---------------*/
		/*-----------------------------------------------------------*/
Client clientRecup = new Client();
		 clientRecup = clientManager.getById(1);

		System.out.println("R�cup�ration d'un gentil client via son id");
		System.out.println("\t INFO : " + clientRecup);

	}// fin main
}// fin classe
