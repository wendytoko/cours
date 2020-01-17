package com.intiformation.criteria.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.intiformation.criteria.entity.Etudiant;

public class GetAllEtudiants {
	/**
	 * L'API CRITERIA
	 * 
	 * > JPA propose une autre alternative pour la construction des requetes sans
	 * utiliser le JPQL ou les requetes natives SQL.
	 * 
	 * > l'API est souvent utilisée pour réaliser des requetes génériques
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/**
		 * L'équivalent en criteria de la requete en JPQL 'SELECT stud FROM student
		 * stud'
		 */

		// 1. recup de l'EM

		EntityManager em = Persistence.createEntityManagerFactory("05_API_CRITERIA").createEntityManager();

		// 2. recup de l'interface principale de l'API criteria à partir de l'EM

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		/**
		 * CriteriaBuilder permet la création de la requete de type Criteria
		 * 'CriteriaQuery' 'CriteriaQuery' est l'enveloppe dans laquelle on va
		 * construire la requete
		 */

		// 3. construction de la requete JPA de type Criteria
		// 3.1 recup de l'enveloppe

		CriteriaQuery<Etudiant> criteriaQuery = criteriaBuilder.createQuery(Etudiant.class);

		/**
		 * CriteriaQuery définit les requetes de sélection de base de données et
		 * modélise toutes les clauses de la requete select du JPQL
		 *
		 */

		/* Reproduction du select JPQL : 'SELECT stud FROM student stud' */

		// 3.2 definition de la source de données équivalent du FROM de la requete JPQL

		/**
		 * l'objet Root fait office d'alias et de path pour les conditionnelles de la
		 * req
		 */

		Root<Etudiant> fromAlias = criteriaQuery.from(Etudiant.class);

		// 3.3. definition de la méthode de sélection de la req JPQL

		CriteriaQuery<Etudiant> selectAlias = criteriaQuery.select(fromAlias);

		// 3.4. transmission de la requete à l'em

		TypedQuery<Etudiant> selectQuery = em.createQuery(selectAlias);

		// 5. execution + recup du resultat de la req

		List<Etudiant> listeEtudiants = selectQuery.getResultList();

		// 6. affichage du resultat

		System.out.println("Liste des étudiants dans la BDD :");
		for (Etudiant et : listeEtudiants) {
			System.out.println("\t " + et.getIdEtudiant() + " : " + et.getNom());
		}

	}// fi main

}// fin classe
