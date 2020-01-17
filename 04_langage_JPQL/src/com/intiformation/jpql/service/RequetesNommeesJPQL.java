package com.intiformation.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.intiformation.jpql.entity.Etudiant;

public class RequetesNommeesJPQL {

	public static void main(String[] args) {

		/**
		 * Les requetes nomm�es JPQL :
		 * 
		 * > Les requetes qu'on a utilis� jusque l� sont des requetes dynamiques qui
		 * sont : > simples � mettre en oeuvres > mais long temps d'�xecution
		 * (Transformation du JPQL en SQL au moment de l'execution)
		 * 
		 * >>> mais cette baisse de performance peut �tre am�lior�e par 'les requetes
		 * nomm�es'
		 * 
		 * > requ�tes nomm�es : > le temps d'execution est am�lior� car la
		 * transformation JPQL en SQL est r�alis�e au d�marrage de l'appli et plus � son
		 * execution
		 * 
		 * Mise en oeuvre des requ�tes :
		 * 
		 * > la definition des requ�tes se fait au niveau des classes entit�s avec
		 * l'annotation @NamedQuery ou @NamedQueries
		 * 
		 * La requete doit �tre unique
		 */

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();

		// 2. execution de la requete nomm�e 'Etudiant.findAll'

		// 2.1 def de la requete nomm�e via l'EM
		Query findAllREQ = em.createNamedQuery("Etudiant.findAll");

		// 2.2 exec + recup du resultat
		List<Etudiant> listeEtudiants = findAllREQ.getResultList();

		System.out.println("Liste des �tudiants dans la BDD : ");
		for (Etudiant et : listeEtudiants) {
			System.out.println("\t  " + et.getIdEtudiant() + " : " + et.getNom());

		}

		Query findREQ = em.createNamedQuery("Etudiant.findByMailMdp");

		findREQ.setParameter(1, "ogarrot@etu.univ-paris-diderot");
		findREQ.setParameter(2, "kamate");

		Long verif = (Long) findREQ.getSingleResult();

		if (verif.equals(1)) {
			System.out.println("L'�tudiant existe bien");
		} else {
			System.out.println("L'�tudiant n'existe pas");
		}

	}// fin main

}// fin classe
