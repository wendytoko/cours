package com.intiformation.heritage.uneTableParClasse;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AppTest {
	/**
	 * Stratégie : une table par classe
	 * 
	 * 	> chaque entité est mappée dans sa propre table
	 * 	> les attributs de l'entité mère sont aussi mappés dans 
	 * 	les entités filles
	 * 
	 * Inconvénients :
	 * 
	 * 	> la duplication est source de pb à terme
	 * 	> tout changement dans la super classe devrait être
	 * répliqué dans les sous classes. Schéma douteux et peu controlable.
	 * 
	 * Avantages :
	 * 	
	 * 	> Faible en termes de performances (JPA utilise une opération de type Union)
	 * Moins performant qu'une seule table
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Stagiaire etu1 = new Stagiaire("Eliyah", "Ingénierie", 18.50f);
		Intervenant form1 = new Intervenant("Richard", "Physique", "Professeur principal");
		
		EntityManager em = Persistence.createEntityManagerFactory("03_gestion_associations_complexe-heritage").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(form1);
		tx.commit();
	}// fin main

	}


