package com.intiformation.association.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestManyToMany {

	/**
	 * Many to Many : formation *----* etudiant > Un etudiant appartient à plusieurs
	 * promo > une promo possède au moins un etudiant et peut en avoir plusieurs
	 * 
	 * Cette relation est bidirectionnelle donc il doit y avoir une classe entité
	 * maitresse (propriétaire de la relation) qui va gérer le nom de la table de
	 * jointure et des FK
	 * 
	 * l'autre coté doit posséder le param 'mappedBy' de @ManytoMany
	 * 
	 * Dans notre exemple, le coté proprio va etre PromotionFormation
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		PromotionFormation prom1 = new PromotionFormation(1, "Informatique");
		PromotionFormation prom2 = new PromotionFormation(2, "Chimie");

		Etudiant etu1 = new Etudiant(1, "Grangé", "Gabriel");
		Etudiant etu2 = new Etudiant(2, "Toko", "Wendy");

		List<Etudiant> listeEtu1 = new ArrayList<>();
		listeEtu1.add(etu1);

		List<Etudiant> listeEtu2 = new ArrayList<>();
		listeEtu2.add(etu1);
		listeEtu2.add(etu2);

		prom1.setListeEtudiants(listeEtu1);
		prom2.setListeEtudiants(listeEtu2);

		EntityManager em = Persistence.createEntityManagerFactory("02_gestion_associations_jpa").createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		em.persist(prom1);
		em.persist(prom2);

		tx.commit();

	}// fin main

}// fin classe
