package com.intiformation.introjpa.demo;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.intiformation.introjpa.entity.optimisationMapping.Enseignant;

public class AjouterEnseignant {
	
	public static void main(String[] args) {
		
		Enseignant enseignant = new Enseignant();
		enseignant.setIdentifiant("julie75");
		enseignant.setMotDePasse("jmlesoleil");
		
		Calendar cal = Calendar.getInstance();
		cal.set(1975, 8, 23);
		enseignant.setDateDeNaissance(cal.getTime());
		
		EntityManager em =
				Persistence.createEntityManagerFactory("01_introduction_jpa-eclipselink").createEntityManager();
		
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		
		em.persist(enseignant);
		
		tx.commit();
		
		em.close();
		
		
		
	}// fin main

}//fin classe
