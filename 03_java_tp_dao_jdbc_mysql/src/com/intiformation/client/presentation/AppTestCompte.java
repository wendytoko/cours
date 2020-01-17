package com.intiformation.client.presentation;

import java.util.List;

import com.intiformation.modele.CompteBancaire;
import com.intiformation.service.CompteServiceImpl;

public class AppTestCompte {

	public static void main(String[] args) {
		
		
		/*-----------------------------------------------------------*/
		/*----------Liste de tous les comptes------------------------*/
		/*-----------------------------------------------------------*/

		CompteServiceImpl compteManager = new CompteServiceImpl();

		List<CompteBancaire> liste = compteManager.getAll();

		System.out.println("Liste de tous les comptes : \n");

		for (CompteBancaire compte : liste) {
			System.out.println("\t> - " + compte);
		} // fin for each

		/*-----------------------------------------------------------*/
		/*------------------AJOUT D'UN COMPTE------------------------*/
		/*-----------------------------------------------------------*/

		CompteBancaire cb = new CompteBancaire(30, 0.50);

		compteManager.add(cb);

		System.out.println("Infos sur le compte ajouté : ");
		System.out.println("\t> " + cb);

		/*-----------------------------------------------------------*/
		/*------------------SUPPRESSION D'UN COMPTE------------------*/
		/*-----------------------------------------------------------*/

		if (compteManager.delete(30) == true) {
			System.out.println("INFO : La suppression a eu lieu avec succès");
		} else {
			System.out.println("INFO : Echec de la suppression");
		}

		/*------------------------------------------------------------*/
		/*------------------MODIFICATION D'UN COMPTE------------------*/
		/*------------------------------------------------------------*/

	CompteBancaire cbRecup=	compteManager.findCounter(5);
	
	 compteManager.update(cbRecup);
	 cbRecup.setIdCompteBancaire(21);
	 cbRecup.setSolde(9.50);
		

		if (compteManager.update(cbRecup)) {
			System.out.println("INFO : La modification du compte a eu lieu");
		} else {
			System.out.println("INFO : ECHEC");
		}

	}// fin main

}// fin classe
