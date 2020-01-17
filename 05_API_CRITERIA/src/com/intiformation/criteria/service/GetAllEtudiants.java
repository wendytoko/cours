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
	 * > l'API est souvent utilis�e pour r�aliser des requetes g�n�riques
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/**
		 * L'�quivalent en criteria de la requete en JPQL 'SELECT stud FROM student
		 * stud'
		 */

		// 1. recup de l'EM

		EntityManager em = Persistence.createEntityManagerFactory("05_API_CRITERIA").createEntityManager();

		// 2. recup de l'interface principale de l'API criteria � partir de l'EM

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		/**
		 * CriteriaBuilder permet la cr�ation de la requete de type Criteria
		 * 'CriteriaQuery' 'CriteriaQuery' est l'enveloppe dans laquelle on va
		 * construire la requete
		 */

		// 3. construction de la requete JPA de type Criteria
		// 3.1 recup de l'enveloppe

		CriteriaQuery<Etudiant> criteriaQuery = criteriaBuilder.createQuery(Etudiant.class);

		/**
		 * CriteriaQuery d�finit les requetes de s�lection de base de donn�es et
		 * mod�lise toutes les clauses de la requete select du JPQL
		 *
		 */

		/* Reproduction du select JPQL : 'SELECT stud FROM student stud' */

		// 3.2 definition de la source de donn�es �quivalent du FROM de la requete JPQL

		/**
		 * l'objet Root fait office d'alias et de path pour les conditionnelles de la
		 * req
		 */

		Root<Etudiant> fromAlias = criteriaQuery.from(Etudiant.class);

		// 3.3. definition de la m�thode de s�lection de la req JPQL

		CriteriaQuery<Etudiant> selectAlias = criteriaQuery.select(fromAlias);

		// 3.4. transmission de la requete � l'em

		TypedQuery<Etudiant> selectQuery = em.createQuery(selectAlias);

		// 5. execution + recup du resultat de la req

		List<Etudiant> listeEtudiants = selectQuery.getResultList();

		// 6. affichage du resultat

		System.out.println("Liste des �tudiants dans la BDD :");
		for (Etudiant et : listeEtudiants) {
			System.out.println("\t " + et.getIdEtudiant() + " : " + et.getNom());
		}

	}// fi main

}// fin classe
