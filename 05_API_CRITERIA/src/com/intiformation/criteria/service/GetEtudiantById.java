package com.intiformation.criteria.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.intiformation.criteria.entity.Etudiant;

public class GetEtudiantById {
	public static void main(String[] args) {

		// 1. recup de l'EM

		EntityManager em = Persistence.createEntityManagerFactory("05_API_CRITERIA").createEntityManager();

		// 2. recup de l'interface principale de l'API criteria à partir de l'EM

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

		// 3. construction de la requete JPA de type Criteria
		// 3.1 recup de l'enveloppe
		CriteriaQuery<Etudiant> criteriaQuery = criteriaBuilder.createQuery(Etudiant.class);

		// 3.2 definition de la source de données équivalent du FROM de la requete JPQL

		/**
		 * l'objet Root fait office d'alias et de path pour les conditionnelles de la
		 * req
		 */

		Root<Etudiant> fromAlias = criteriaQuery.from(Etudiant.class);

		// 3.3. definition de la méthode de sélection de la req JPQL

		/**
		 * > pour séléectionner seulement les noms on utilise la méthode get() de
		 * l'interface Root
		 * 
		 * > la méthode get() prend en argument le nom de la pté que l'on souhaite recup
		 */

		CriteriaQuery<Etudiant> selectAlias = criteriaQuery.select(fromAlias);

		// 3.4. definition de la méthode du filtrage de la req sur la clause WHERE de la
		// req JPQL

		/**
		 * > le WHERE se fait avec la méthode where() de CriteriaQuery
		 * 
		 * > la méthode where() prend en argument les conditions (prédicaats) qui
		 * filtrent ce qui va être retourné
		 * 
		 * > les conditions sont obtenues en utilisant une opération de comparaison ou
		 * une opération logique sur l'interface CriteriaBuilder
		 * 
		 * > l'opération de comparaison = méthode equal() > equal() prend en argument la
		 * valeur de la pté idEtudiant récuperé du get() de Root
		 * 
		 * 
		 */

		// 3.4.1. definition des conditions du where (JPQL : WHERE stud.idEtudiant=1)
		Predicate conditionWhere = criteriaBuilder.equal(fromAlias.get("idEtudiant"), 1);

		// 3.4.2 defintion du where avec les conditions
		CriteriaQuery<Etudiant> whereAlias = criteriaQuery.where(conditionWhere);
		// 4. transmission de la requete à l'em

		TypedQuery selectQuery = em.createQuery(selectAlias);

		// 5. exec + recup du resultat

		Etudiant etudiant1 = (Etudiant) selectQuery.getSingleResult();

		// 6. affichage du resultat
		System.out.println("Etudiant à l'ID=1 via API Criteria : " + etudiant1);

	}// fin main

}
