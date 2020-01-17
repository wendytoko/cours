package com.intiformation.jpql.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestEtudiant {

	public static void main(String[] args) {
	
		Etudiant etu1 = new Etudiant(2515, "Lenoir Bastien", "lbastien@etu.univ-paris-diderot", "kamate");
		Etudiant etu2 = new Etudiant(2516, "Diakité Ibrahim", "dibrahim@etu.univ-paris-diderot", "kamate");
		Etudiant etu3 = new Etudiant(2517, "Gosselin Diane", "gdiane@etu.univ-paris-diderot", "kamate");
		Etudiant etu4 = new Etudiant(2518, "Opel Lina", "olina@etu.univ-paris-diderot", "kamate");
		Etudiant etu5 = new Etudiant(2519, "Ricaud Bastien", "rbastien@etu.univ-paris-diderot", "kamate");
		
		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(etu1);
		em.persist(etu2);
		em.persist(etu3);
		em.persist(etu4);
		em.persist(etu5);
		
		
		
		tx.commit();
		

	}

}
