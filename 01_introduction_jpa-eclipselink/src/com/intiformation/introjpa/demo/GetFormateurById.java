package com.intiformation.introjpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.intiformation.introjpa.entity.Formateur;

public class GetFormateurById {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("01_introduction_jpa-eclipselink");

		EntityManager em = emf.createEntityManager();

		// recup du formateur à l'id=1 via l'EM

		Formateur formateur = em.find(Formateur.class, 1);

		// affichage

		System.out.println(formateur);

		// fermture des ressources

		em.close();
		emf.close();

	}// fin main

}// fin classe
