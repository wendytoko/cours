package com.intiformation.jpql.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.intiformation.jpql.entity.Etudiant;

public class RequetesNativesSQL {

	/**
	 * Requetes natives SQL :
	 * 
	 * > à utiliser pour des besoins spécifiques > elles reçoivent en param du SQL
	 * 
	 * > solution pas portables
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();

		// 2. requete native

		Query selectQuery = em.createNativeQuery("SELECT * FROM students", Etudiant.class);

		// 3. exec et recup

		List<Etudiant> liste = selectQuery.getResultList();

		// 4. affichage

		System.out.println("Liste des étudiants dans la BDD :");
		for (Etudiant et : liste) {
			System.out.println("\t " + et.getIdEtudiant() + " : " + et.getNom());
		}

	}// fin main

}// fin classe
