package com.intiformation.association.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestOneToOne {
	
	
	
	public static void main(String[] args) {
		
		
		Personne personne = new Personne("Sarrault","Pauline");
		
		Adresse adresse = new Adresse("1 rue des tilleuls", "93500","Pantin");
		//association de l'adrese à la personne
		personne.setAdresse(adresse);
		// association de la personne à l'adresse
		adresse.setPersonne(personne);
		
		EntityManager em = Persistence.createEntityManagerFactory("02_gestion_associations_jpa").createEntityManager();
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// avant l'ajout de la cascade (ajout de param cascade dans @OneToOne)
		em.persist(adresse);
		em.persist(personne);
		
		//apres ajout de la cascade
		em.persist(personne);// quand j'ajoute une personne ajoute moi les adresses associées
		
		tx.commit();
		
		
		/*------------------------------------------------------------------------------------*/
		/*---------------Relation unidirectionnelle en Personne - Adresse---------------------*/
		/*------------------------------------------------------------------------------------*/
		/*---------------------1 personne possède 1 adresse-----------------------------------*/
		
		// recup de l'adresse de la personne à l'id=1
		Adresse adresseP1 = em.find(Personne.class, 1).getAdresse();
		System.out.println(adresseP1);
		
		// recup de la personne qui habite à l'adresse avec l'id=1
		
		/**
		 * on ne pourra passer par l'entité Adresse car pas de getPersonne() dans Adresse
		 * On utilise alors la relation bidirectionnelle entre les 2 entités
		 */
		
		/*-----------------------------------------------------------------------------------*/
		/*---------------Relation bidirectionnelle en Personne - Adresse---------------------*/
		/*----------------On peut naviguer dans les deux sens de l'asso----------------------*/
		/*-----------------------------------------------------------------------------------*/
		
		/**
		 * Mise en place : ajout de @OneToOne dans la classe Adresse
		 */
		
		Personne personneAdd = em.find(Adresse.class, 1).getPersonne();
		System.out.println(personneAdd);
		
		em.close();
		
		
	}// fiin main

}// fin classe
