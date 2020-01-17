package com.intiformation.jpql.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.intiformation.jpql.entity.Etudiant;

public class SelectionDesDonneesJPQL {
	public static void main(String[] args) {

		/**
		 * Sélection des données en JPQL avec la clause SELECT
		 * 
		 * SELECT ... FROM <nom de l'entité> alias
		 * 
		 * > JPQL désigne les entités dans les requêtes par leurs noms
		 * 
		 * > Le SELECT permet de préciser une classe entité (et non pas une table) par
		 * son nom en lui donnant un alias pour y faire référence par la suite
		 */

		// 1. recup de l'EntityManager

		EntityManager em = Persistence.createEntityManagerFactory("04_langage_JPQL").createEntityManager();

		// ====================================================//
		// ======getAll : Liste des étudiants==================//
		// ====================================================//

		// 2. Definition du contenu de la requete JPQL

		String selectJpqlReq = "SELECT stud FROM student stud ";// alias = stud
		// cette ligne précédente equivaut en SQL = SELECT * FROM etudiant

		// 3. creation de la requete JPQL avec l'EM

		Query selectQuery = em.createQuery(selectJpqlReq);// equivalent à PreparedStatement

		// 4. execution de la requete + recup du résultat

		List<Etudiant> listeEtudiant = selectQuery.getResultList();

		// 5. Affichage du resultat

		System.out.println("Liste des étudiants dans la BDD :");
		for (Etudiant et : listeEtudiant) {
			System.out.println("\t " + et.getIdEtudiant() + " : " + et.getNom());
		}

		// ====================================================//
		// ======getAll : Liste des noms des étudiants=========//
		// ====================================================//
		/**
		 * l'alias dans la requete JPQL permet de naviguer à travers les entitées et
		 * leur rela
		 */

		// 1. def du contenu de la requete JPQL

		String selectNomJpqlReq = "SELECT stud.nom FROM student stud ";// bien mettre la pté nom définie dans Etudiant

		// 2. def de la requete JPQL

		Query selectNameReq = em.createQuery(selectNomJpqlReq);

		// 3. exec + recup de resultat

		List<String> listeNoms = selectNameReq.getResultList();

		// 4. Affichage du resultat

		System.out.println("Liste des noms des étudiants dans la BDD :");
		for (String name : listeNoms) {
			System.out.println("\t " + " : " + name);
		}

		/**
		 * SELECT permet de retourner plusiquers expressions en les spérants d'une
		 * virgule
		 * 
		 * Exemple : recup des mail/mdp des étudiants
		 * 
		 * SELECT stud.mail, stud.mdp FROM student stud
		 */

		// ===============================================//
		// ================ Requêtes paramètrées =========//
		// ===============================================//

		/**
		 * JPQL propose 2 types de syntaxes pour les requêtes paramètrées :
		 * 
		 * 1. notation par nom de paramètre 2. notation par position de param dans la
		 * requete > basé sur le num de la position du param > syntaxe ?
		 */
		// -----------------------------------------------//
		// ------1. Notation par nom de paramètres--------//
		// -----------------------------------------------//

		// 1.1 def du contenu de la requete
		// Ex : getEtudiantById()
		String getByIdJpqlReq = "SELECT stud FROM student stud WHERE stud.idEtudiant = :pStudentID";

		// 1.2 creation de la requete

		Query findById = em.createQuery(getByIdJpqlReq);

		// 1.3 passage de param à la requete

		/**
		 * setParameter("<nom du param>",<valeur du param que l'on choisi>)
		 */

		findById.setParameter("pStudentID", 5);
		// 1.4 affichage du resultat
		Etudiant etu5 = (Etudiant) findById.getSingleResult();
		System.out.println("Information sur l'étudiant à l'id = 5 :");

		System.out.println("\t " + " : " + etu5);

		// -----------------------------------------------//
		// ------2. Notation par position de paramètres---//
		// -----------------------------------------------//

		// Ex : recup d'un etudiant par son mail et mdp

		// 2.1 def du contenu de la requete JPQL

		String getByMailMdpReq = "SELECT stud FROM student stud WHERE stud.mail =?1 AND stud.mdp = ?2";

		// 2.1 def de la requete JPQL

		Query findByMailMdpREQ = em.createQuery(getByMailMdpReq);

		// 2.2 passage de param

		/**
		 * setParameter(<position du param dans la requete>,<valeur du param>
		 */

		findByMailMdpREQ.setParameter(1, "gdiane@etu.univ-paris-diderot");
		findByMailMdpREQ.setParameter(2, "kamate");

		Etudiant etud = (Etudiant) findByMailMdpREQ.getSingleResult();
		System.out.println("recup des infos sur l'étudiant par son mail et son mot de passe:");

		System.out.println("\t " + " : " + etud);

		/**
		 * autres clauses :
		 * 
		 * > les expression LIKE Exemple : recup des noms des etudians commençant par un
		 * m
		 * 
		 * SELECT stud FROM student stud WHERE stud.nom LIKE 'm%'
		 */

		/**
		 * 
		 * Les fonctions : > UPPER/LOWER :maj/min > SQRT() > TRIM(chaine) ... Exemple :
		 * recup le nom des etudiants en majuscule
		 * 
		 * SELECT UPPER(stud.nom) FROM student stud
		 * 
		 * Les fonctions de type agrégat :
		 * 
		 * > AVG() > COUNT() > MAX()/MIN() > SUM()
		 *
		 */

		// -----------------------------------------------//
		// ------------------FONCTIONS : COUNT ()---------//
		// -----------------------------------------------//
		// Exemple : recup du nombre d'étudiants dans la bdd

		/**
		 * le résultat retourné par le COUNT() est de type Long
		 */
		Query countEtudiantReq = em.createQuery("SELECT COUNT(stud.idEtudiant) FROM student stud");

		Long nombreEtudiants = (Long) countEtudiantReq.getSingleResult();

		System.out.println("Nombres d'étudiants dans la BDD :");

		System.out.println("\t " + " > " + nombreEtudiants);

	}// fin main

}// fin classe
