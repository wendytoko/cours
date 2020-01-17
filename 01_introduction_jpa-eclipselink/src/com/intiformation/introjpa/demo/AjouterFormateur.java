package com.intiformation.introjpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.intiformation.introjpa.entity.Formateur;

public class AjouterFormateur {

	/**
	 * 
	 * main
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// -----------------------------------------------------------//
		// --------Ajout d'un formateur dans la bdd------------------//
		// ---------------------------------------------------------//

		// 1. création de l'objet formateur a ajouter

		Formateur formateur1 = new Formateur();
		formateur1.setIdFormateur(1);
		formateur1.setIdentifiant("axelAire");
		formateur1.setMotDePasse("axel93");

		// 2. récup de la fabrique d'entité manager via l'objet Persistence

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("01_introduction_jpa-eclipselink");

		// 3. recup de l'EntityManager de JPA via la Factory

		EntityManager entityManager = emf.createEntityManager();

		// 4. Définir une transaction

		EntityTransaction transaction = entityManager.getTransaction();

		// 4.1 Ouverture de la transaction

		transaction.begin();
		
		// 5. ajout de l'objet formateur dans la bdd via l'EntityManager et sa méthode persist()
		
		entityManager.persist(formateur1);
		
		// 6. Validation de la transaction
		
		transaction.commit();
		
		// 7. Fermeture de l'emf et de l'EM
		
		entityManager.close();
		emf.close();

	}// fin main

}// fin classe
