package fr.formation.inti.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.formation.inti.dao.CDaoEmployee;
import fr.formation.inti.entity.Employee;

public class AppTestEmployee {

	public static void main(String[] args) {

		CDaoEmployee coucheDao = new CDaoEmployee();

		// Employee e = new Employee(19, "Hartmann", "Amélie", "1995-12-13", "Accueil");
		/*
		 * EntityManager em =
		 * Persistence.createEntityManagerFactory("fr.formation.inti").
		 * createEntityManager();
		 * 
		 * EntityTransaction tx = em.getTransaction(); tx.begin(); em.persist(e);
		 * tx.commit(); em.close();
		 */

		/*
		 * EntityManager em =
		 * Persistence.createEntityManagerFactory("fr.formation.inti").
		 * createEntityManager();
		 * 
		 * EntityTransaction tx = em.getTransaction(); tx.begin(); Employee e=null;
		 * e=em.find(Employee.class, 19); em.remove(e); tx.commit(); em.close();
		 */

		/*
		 * EntityManager em =
		 * Persistence.createEntityManagerFactory("fr.formation.inti").
		 * createEntityManager(); EntityTransaction tx = em.getTransaction();
		 * 
		 * tx.begin();
		 * 
		 * Employee e=null;
		 * 
		 * e=em.find(Employee.class, 20);
		 * 
		 * e.setLastName("Dotremont");
		 * 
		 * em.merge(e); tx.commit(); em.close();
		 */

		/*
		 * EntityManager em =
		 * Persistence.createEntityManagerFactory("fr.formation.inti").
		 * createEntityManager(); Query listeQuery =
		 * em.createNativeQuery("SELECT * FROM employee", Employee.class);
		 * 
		 * List<Employee> liste =(List<Employee>) listeQuery.getResultList();
		 * 
		 * System.out.println(liste); em.close();
		 */

		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();
		Query consulterQuery = em.createNativeQuery("SELECT * FROM employee WHERE EMP_ID=?", Employee.class);
		Integer idEmployee = 2;
		consulterQuery.setParameter(1,idEmployee);
		Employee e = (Employee) consulterQuery.getSingleResult();
		System.out.println(e);

	}
}
