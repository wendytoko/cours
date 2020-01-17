package com.intiformation.criteria.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.intiformation.criteria.entity.Etudiant;

public class GetAllNomsEtudiants {
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
		 * > pour séléectionner seulement les noms on utilise la méthode get() de l'interface Root
		 * 
		 * > la méthode get() prend en argument le nom de la pté que l'on souhaite recup
		 */

		CriteriaQuery<Etudiant> selectAlias = criteriaQuery.select(fromAlias.get("nom"));
		
		/**
		 * si l'on veut recup par les noms et les mails on fait
		 * fromAlias.get("nom").get("mail)
		 */

		// 3.4. transmission de la requete à l'em

				TypedQuery selectQuery = em.createQuery(selectAlias);
		
				// 5. execution + recup du resultat de la req

				List<String> listeNomsEtudiants = selectQuery.getResultList();

				// 6. affichage du resultat

				System.out.println("Liste des noms étudiants dans la BDD :");
				for (String name : listeNomsEtudiants) {
					System.out.println("\t " + name);
				}
		
	}// fin main
}// fin classe
