package com.intiformation.hibernate.test;

import java.util.List;

import com.intiformation.hibernate.dao.PersonneDAO;
import com.intiformation.hibernate.entity.Personne;

public class AppTest {

	public static void main(String[] args) {
		
		   //-- ========================================== --//
		   //-- == AJOUT D'UNE PERSONNE DANS LA BDD ====== --//
		   //-- ========================================== --//

		
		Personne personne1 = new Personne("Victor Hugo");
		Personne personne2 = new Personne("Charles Monet");
		Personne personne3 = new Personne("Denis Diderot");
		
		
		PersonneDAO personneDao = new PersonneDAO();
		
		int idP1 = personneDao.ajouterPersonne(personne1);
		int idP2 = personneDao.ajouterPersonne(personne2);
		int idP3 = personneDao.ajouterPersonne(personne3);
		
		System.out.println("IDs des personnes ajoutés");
		System.out.println("\t " + " - " + idP1);
		System.out.println("\t " + " - " +idP2);
		System.out.println("\t " + " - " +idP3);
		
		  //-- ========================================== --//
		   //-- == MODIF D'UNE PERSONNE DANS LA BDD ====== --//
		   //-- ========================================== --//
		
	    personneDao.modifierPersonne(2, "Charles Perrault");
	    
	    //-- ========================================== --//
		   //-- == SUPP D'UNE PERSONNE DANS LA BDD ====== --//
		   //-- ========================================== --//
	    
		personneDao.supprimerPersonne(3);
		
		   //-- ========================================== --//
		   //-- == LISTE DE PERSONNES DANS LA BDD ====== --//
		   //-- ========================================== --//
		
	List<Personne> liste=	personneDao.getAllPersonne();
	System.out.println(liste);
		
	}// fin main

}
