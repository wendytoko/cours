package com.intiformation.introjpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.intiformation.introjpa.entity.Formateur;

public class ModifierFormateur {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("01_introduction_jpa-eclipselink");

		EntityManager em = emf.createEntityManager();

		/**
		 * Modifier la bdd donc il nous faut une transaction
		 */

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		// modif dans la bdd
		// 4.1. chargement de l'entité à modifier

		Formateur formateurUpdate = em.find(Formateur.class, 1);
		// 4.2 modif du formateur
		if (formateurUpdate != null) {

			formateurUpdate.setIdentifiant("booba");

			em.merge(formateurUpdate); //si on vt supprimer ici on écrit em.remove()

			// 5. validation de la tx

			tx.commit();

		} // fin if

	}// fin main

}// fin classe
