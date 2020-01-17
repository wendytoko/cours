package com.intiformation.jpql.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author IN-MP-040
 *
 */

public class MiseAJourDonneesJPQL {
	public static void main(String[] args) {

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();
		
		// recup d'une tx + ouverture
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		//3. def du contenu de la requete de modif d'un étudiant
		String modifEtudiantReq = "UPDATE student stud SET stud.nom = :pNom, stud.mail = :pMail, stud.mdp = :pMdp WHERE stud.idEtudiant = :pID";
		
		//4. cration de la requete
		Query updateREQ = em.createQuery(modifEtudiantReq);
		
		//4.1. passage de param
		updateREQ.setParameter("pNom", "Opaline Garrot");
		updateREQ.setParameter("pMail", "ogarrot@etu.univ-paris-diderot");
		updateREQ.setParameter("pMdp", "jmlesoleil");
		updateREQ.setParameter("pID", 3);
		
		//5. exec + recup du resultat
		int verifUpdate = updateREQ.executeUpdate();
		
		//6. validation de la transaction
		transaction.commit();
		
		System.out.println("Modif de l'étudiant à l'id = 1 : ");
		if(verifUpdate==1) {
			System.out.println("\t INFO : MAJ avec succès ");
			
		}else {
			System.out.println("\t GRAVE : échec de la MAJ");
		}

	}// fin main

}// fin classe
