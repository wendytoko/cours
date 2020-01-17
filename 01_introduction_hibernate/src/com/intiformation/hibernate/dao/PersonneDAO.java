package com.intiformation.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.intiformation.hibernate.entity.Personne;
import com.intiformation.hibernate.tool.HibernateUtil;

/**
 * Couche DAO de la personne
 * 
 * @author IN-MP-040
 *
 */

public class PersonneDAO {

	// recup de la session factory à partir du tool HibernateUtil
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Integer ajouterPersonne(Personne aPersonne) {

		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();

		// 2. recup d'une transaction
		Transaction transaction = session.beginTransaction();

		// 3. ajout dans la bdd via la session
		/**
		 * save() : ajout dans la bdd et retourne la FK
		 */
		Integer personneID = (Integer) session.save(aPersonne);

		// 4. validation de la transaction
		transaction.commit();

		// 5. renvoi de la PK de la personne ajoutée

		return personneID;

	}// fin ajouterPersonne

	public Personne getPersonneById(Integer pIdPersonne) {
		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();

		// 2. recup de la personne via son id avec la méthode get()

		Personne personne = session.get(Personne.class, pIdPersonne);

		return personne;

	}// fin getPersonneById

	/**
	 * modif d'une personne dans la BDD
	 * 
	 * @param pIdPersonne
	 * @param pNom
	 */

	public void modifierPersonne(Integer pIdPersonne, String pNom) {
		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();

		// 2. recup d'une transaction

		Transaction transaction = session.beginTransaction();

		// 3. chargement de la perosnne à modifier

		Personne personneModif = getPersonneById(pIdPersonne);

		// 4. modif de la personne
		personneModif.setNom(pNom);

		// 5. modif de la personne dans la bdd via la méthode update de session
		session.update(personneModif);

		/**
		 * NB : à la place de la méthode update(), on peut uiliser la méthode
		 * saveOrUpdate()
		 * 
		 * > Elle laisse hibernate choisir entre save et update. Elle va le faire en
		 * fonction de la PK
		 */
		transaction.commit();

	}

	public void supprimerPersonne(Integer pIdPersonne) {

		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();
		// 2. recup d'une transaction
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();

			// 3. chargement de la perosnne à supprimer

			Personne personneSupp = getPersonneById(pIdPersonne);

			// 5. suppression de la personne dans la bdd via la méthode delete de session
			session.delete(personneSupp);

			transaction.commit();

		} catch (HibernateException e) {
			if (transaction != null) {

				// 7. annulation de la transaction
				transaction.rollback();
				e.printStackTrace();
			}

		} // fin catch

	}// fin supprimerPersonne

	// -- ========================================== --//
	// -- == HQL : Hibernate Query Language ======== --//
	// -- ========================================== --//

	/**
	 * recup de la liste des personnes dans la BDD Implémentation de la méthode avec
	 * le HQL
	 */

	public List<Personne> getAllPersonne() {
		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();

		// 2. defintion du contenu de la requete HQL
		String selectReq = "FROM Personne p";

		// 3. creation de la requete
		Query getAllQuery = session.createQuery(selectReq);

		/**
		 * Pagination :
		 * 
		 * > commence l'extraction de 0 (première ligne) getAllQuery.setFirstResult(0);
		 * 
		 * > recupere 2 entités de ce résultat getAllQuery.setMaxResults(2);
		 */
		// 4. exec + recup du resultat
		List<Personne> listePersonne = getAllQuery.list();

		return listePersonne;

	}// fin getAllPersonne

	/**
	 * 
	 * Recup des noms des personnes
	 * 
	 * @return
	 */
	public List<String> getAllNomsPersonnes() {

		// 1. recup de la session Hibernate

		Session session = sessionFactory.openSession();

		// 2. defintion du contenu de la requete HQL
		String selectNomsReq = "SELECT p.nom FROM Personne p";
		// 3. creation de la requete
		Query getAllNomsQuery = session.createQuery(selectNomsReq);

		// 4. exec + recup du resultat
		List<String> listeNoms = getAllNomsQuery.list();

		return listeNoms;

	}// fin getAllNomsPersonnes

	/**
	 * recup de la personne via son id implémentation de la méthode avec le HQL et
	 * les requetes paramètrées
	 * 
	 * @return
	 */

	public Personne findPersonneById(Integer pIdPersonne) {

		Session session = sessionFactory.openSession();
		// notation par nom de paramètre
		String getByIdReq = "SELECT p FROM Personne p WHERE p.idPersonne = :personneID";

		Query<Personne> findByIdQuery = session.createQuery(getByIdReq);

		// notation par position de parametres
		/**
		 * String getByIdReq = "SELECT p FROM Personne p WHERE p.idPersonne = :?1";
		 * findByIdQuery.setParameter(1, pIdPersonne);
		 * 
		 */

		// passage de param
		findByIdQuery.setParameter("personneID", pIdPersonne);

		// exec + recup du resultat
		Personne personne = findByIdQuery.uniqueResult();

		return personne;

	}// fin fiindPersonneById

	/**
	 * recup d'un nbre de personnes dans la bdd HQL et la méthode COUNT
	 * 
	 * @return
	 */
	public Long getNombresPersonnes() {
		Session session = sessionFactory.openSession();

		String countReq = "SELECT COUNT(p.idPersonne) FROM Personne p";

		Query<Long> countQuery = session.createQuery(countReq);

		Long nombrePersonnes = countQuery.uniqueResult();
		return nombrePersonnes;

	}// fin getNombresPersonnes

	public boolean updatePersonneWithHQL(Personne aPersonne) {
		Session session = sessionFactory.openSession();

		String updateReq = "UPDATE Personne p SET p.nom = :pNom WHERE p.idPersonne = :pID";

		Transaction tx = session.beginTransaction();

		Query updateQuery = session.createQuery(updateReq);

		// passage de param
		updateQuery.setParameter("pNom", aPersonne.getNom());
		updateQuery.setParameter("pID", aPersonne.getIdPersonne());

		// exec avec la méthode executeUpdate + recup de resultat
		int verif = updateQuery.executeUpdate();

		tx.commit();

		if (verif == 1) {
			return true;
		} else {
			return false;
		}

	}// fin updatePersonneWithHQL
	
	public boolean deletePersonneWithHQL(Integer aIdPersonne) {
		Session session = sessionFactory.openSession();

		String deleteReq = "DELETE Personne p WHERE p.idPersonne = :pID";

		Transaction tx = session.beginTransaction();

		Query deleteQuery = session.createQuery(deleteReq);

		// passage de param
		deleteQuery.setParameter("pID", aIdPersonne);

		// exec avec la méthode executeUpdate + recup de resultat
		int verif = deleteQuery.executeUpdate();

		tx.commit();

		if (verif == 1) {
			return true;
		} else {
			return false;
		}
	}// fin deletePersonneWithHQL
	
	/**
	 * En HQL, on a la cause INSERT INTO :
	 * >Quand l'insertion se fait d'un objet à un autre (on ne l'utilise oas dans un DAO)
	 */

}// fin classe
