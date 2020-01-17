package com.intiformation.jpql.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SuppressionDonneesJPQL {
	public static void main(String[] args) {

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();
		
		// recup d'une tx + ouverture
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		//3. def du contenu de la requete de modif d'un étudiant
		String suppEtudiantReq = "DELETE FROM student stud WHERE stud.idEtudiant = ?1";
		
		//4. cration de la requete
		Query deleteREQ = em.createQuery(suppEtudiantReq);
		
		//4.1. passage de param
		deleteREQ.setParameter(1, 4);
	
		
		//5. exec + recup du resultat
		int verifDelete = deleteREQ.executeUpdate();
		
		//6. validation de la transaction
		transaction.commit();
		
		System.out.println("Suppression de l'étudiant à l'id = 4 : ");
		if(verifDelete==1) {
			System.out.println("\t INFO : La suppression a eu lieu avec succès ");
			
		}else {
			System.out.println("\t GRAVE : échec de la suppression");
		}

	}// fin main

}
