package com.intiformation.association.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestManyToOne {
public static void main(String[] args) {
	/**
	 * ManyToOne :
	 * 
	 * Promotion 1-------d<donné---------- *Cours
	 * 1 promo recoit plusieurs cours
	 */
	
	Promotion promotion = new Promotion(1, "Classe B");
	
	Cours cours = new Cours(1,"Maths");
	
	cours.setPromotion(promotion);
	
	EntityManager em = Persistence.createEntityManagerFactory("02_gestion_associations_jpa").createEntityManager();
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	
	em.persist(cours);
	em.persist(promotion);
	
	tx.commit();
	
	
	
	
}// fin main
}// fin classe
