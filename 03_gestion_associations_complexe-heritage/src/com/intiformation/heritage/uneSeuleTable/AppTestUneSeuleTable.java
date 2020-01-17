package com.intiformation.heritage.uneSeuleTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestUneSeuleTable {
	
	public static void main(String[] args) {
		
		/**
		 * On va voir la statégie du groupement dans une seule table
		 * > Elle consiste à grouper tous les attributs des instances dans une seule table
		 * > C'est la mécanisme par défaut
		 */
		
		
		/**
		 * Avantes et inconvénients de ce mécanisme :
		 * 	> meilleures performances. pas de jointures à effectuer
		 * 	> par contre table dont la structure est peu compréhensible avec des null
		 */
		Etudiant etu1 = new Etudiant("Eliyah", "Ingénierie", 18.50f);
		Formateur form1 = new Formateur("Richard", "Physique", "Professeur principal");
		
		EntityManager em = Persistence.createEntityManagerFactory("03_gestion_associations_complexe-heritage").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(form1);
		tx.commit();
		
		
	}// fin main

}// fin classe
