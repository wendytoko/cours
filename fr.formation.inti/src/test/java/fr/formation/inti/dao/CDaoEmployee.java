package fr.formation.inti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.formation.inti.entity.Employee;

public class CDaoEmployee implements IDao<Employee>{

	public Integer create(Employee e) {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		em.close();
		return e.getIdEmployee();
	}

	public void update(Employee e) {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.merge(e);
		tx.commit();
		em.close();
		
	}

	public void delete(Employee e) {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.remove(e);
		tx.commit();
		em.close();
		
	}

	public Employee getById(Employee e) {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();
		Query consulterQuery = em.createNativeQuery("SELECT * FROM employee WHERE EMP_ID=?", Employee.class);
		Integer idEmployee = 2;
		consulterQuery.setParameter(1,idEmployee);
		e = (Employee) consulterQuery.getSingleResult();

		em.close();
		return e;
	}

	public List<Employee> getAll() {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();

		Query consulterQuery = em.createNativeQuery("SELECT * FROM employee");

		List<Employee> employeeList = (List<Employee>) consulterQuery.getResultList();

		em.close();

		return employeeList;
	}

}
