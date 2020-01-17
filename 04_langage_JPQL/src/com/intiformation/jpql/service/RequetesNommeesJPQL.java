package com.intiformation.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.intiformation.jpql.entity.Etudiant;

public class RequetesNommeesJPQL {

	public static void main(String[] args) {

		/**
		 * Les requetes nommées JPQL :
		 * 
		 * > Les requetes qu'on a utilisé jusque là sont des requetes dynamiques qui
		 * sont : > simples à mettre en oeuvres > mais long temps d'éxecution
		 * (Transformation du JPQL en SQL au moment de l'execution)
		 * 
		 * >>> mais cette baisse de performance peut être améliorée par 'les requetes
		 * nommées'
		 * 
		 * > requêtes nommées : > le temps d'execution est amélioré car la
		 * transformation JPQL en SQL est réalisée au démarrage de l'appli et plus à son
		 * execution
		 * 
		 * Mise en oeuvre des requêtes :
		 * 
		 * > la definition des requêtes se fait au niveau des classes entités avec
		 * l'annotation @NamedQuery ou @NamedQueries
		 * 
		 * La requete doit être unique
		 */

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();

		// 2. execution de la requete nommée 'Etudiant.findAll'

		// 2.1 def de la requete nommée via l'EM
		Query findAllREQ = em.createNamedQuery("Etudiant.findAll");

		// 2.2 exec + recup du resultat
		List<Etudiant> listeEtudiants = findAllREQ.getResultList();

		System.out.println("Liste des étudiants dans la BDD : ");
		for (Etudiant et : listeEtudiants) {
			System.out.println("\t  " + et.getIdEtudiant() + " : " + et.getNom());

		}

		Query findREQ = em.createNamedQuery("Etudiant.findByMailMdp");

		findREQ.setParameter(1, "ogarrot@etu.univ-paris-diderot");
		findREQ.setParameter(2, "kamate");

		Long verif = (Long) findREQ.getSingleResult();

		if (verif.equals(1)) {
			System.out.println("L'étudiant existe bien");
		} else {
			System.out.println("L'étudiant n'existe pas");
		}

	}// fin main

}// fin classe
