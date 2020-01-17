package com.intiformation.heritage.tableDeJointure;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTest {
	/**
	 * Stratégie : Table de jointure
	 * 
	 * 	> chaque entité concernée par l'héritage est mappée dans sa propre table
	 * 	> chaque classe est représentée par une table avec ses propres attributs
	 * 	> la classe entité mère utilise une PK et des FK pour faire le lien avec les entités filles
	 * 
	 * Avantages :
	 * 
	 * 	> plus proche du mécanisme objet (UML)
	 *  > pas de redondance, plus facile d'ajouter des sous classes
	 *  
	 *  Inconvénient princpal :
	 *  
	 *  	> nécessité d'effectuer autant de jointues qu'il existe de niveaux
	 *  	dans la hierarchie d'héritage pour reconstituer l'objet
	 *  
	 *  	> plus lent en termes de performances par rapport à celui par groupement dans une seule table
	 *  	à cause des jointures
	 * @param args
	 */
	
	public static void main(String[] args) {
		Apprenant etu1 = new Apprenant("Eliyah", "Ingénierie", 18.50f);
		Enseignant form1 = new Enseignant("Richard", "Physique", "Professeur principal");
		
		EntityManager em = Persistence.createEntityManagerFactory("03_gestion_associations_complexe-heritage").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(form1);
		tx.commit();
	}// fin main

}// fin classe
