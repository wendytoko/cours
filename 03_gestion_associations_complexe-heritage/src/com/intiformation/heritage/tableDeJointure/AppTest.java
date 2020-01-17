package com.intiformation.heritage.tableDeJointure;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTest {
	/**
	 * Strat�gie : Table de jointure
	 * 
	 * 	> chaque entit� concern�e par l'h�ritage est mapp�e dans sa propre table
	 * 	> chaque classe est repr�sent�e par une table avec ses propres attributs
	 * 	> la classe entit� m�re utilise une PK et des FK pour faire le lien avec les entit�s filles
	 * 
	 * Avantages :
	 * 
	 * 	> plus proche du m�canisme objet (UML)
	 *  > pas de redondance, plus facile d'ajouter des sous classes
	 *  
	 *  Inconv�nient princpal :
	 *  
	 *  	> n�cessit� d'effectuer autant de jointues qu'il existe de niveaux
	 *  	dans la hierarchie d'h�ritage pour reconstituer l'objet
	 *  
	 *  	> plus lent en termes de performances par rapport � celui par groupement dans une seule table
	 *  	� cause des jointures
	 * @param args
	 */
	
	public static void main(String[] args) {
		Apprenant etu1 = new Apprenant("Eliyah", "Ing�nierie", 18.50f);
		Enseignant form1 = new Enseignant("Richard", "Physique", "Professeur principal");
		
		EntityManager em = Persistence.createEntityManagerFactory("03_gestion_associations_complexe-heritage").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(form1);
		tx.commit();
	}// fin main

}// fin classe
