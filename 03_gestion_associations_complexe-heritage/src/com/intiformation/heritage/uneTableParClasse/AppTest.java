package com.intiformation.heritage.uneTableParClasse;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AppTest {
	/**
	 * Strat�gie : une table par classe
	 * 
	 * 	> chaque entit� est mapp�e dans sa propre table
	 * 	> les attributs de l'entit� m�re sont aussi mapp�s dans 
	 * 	les entit�s filles
	 * 
	 * Inconv�nients :
	 * 
	 * 	> la duplication est source de pb � terme
	 * 	> tout changement dans la super classe devrait �tre
	 * r�pliqu� dans les sous classes. Sch�ma douteux et peu controlable.
	 * 
	 * Avantages :
	 * 	
	 * 	> Faible en termes de performances (JPA utilise une op�ration de type Union)
	 * Moins performant qu'une seule table
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Stagiaire etu1 = new Stagiaire("Eliyah", "Ing�nierie", 18.50f);
		Intervenant form1 = new Intervenant("Richard", "Physique", "Professeur principal");
		
		EntityManager em = Persistence.createEntityManagerFactory("03_gestion_associations_complexe-heritage").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(form1);
		tx.commit();
	}// fin main

	}


