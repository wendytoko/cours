package com.intiformation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.intiformation.springioc.orm.bean.Employe;

public class EmployeDaoImpl implements IEmployeDao {
	

	public EmployeDaoImpl() {
		super();
	}

	private SessionFactory sessionFactory;
	// Elle sera instanciée par le conteneur spring

	/**
	 * setter de la SF ppour permettre à spring de l'injecter
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEmploye(Employe pEmploye) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		try {

			tx.begin();
			session.save(pEmploye);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			throw e;
		}

	}// end addEmploye()

	@Override
	public void updateEmploye(Employe pEmploye) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		try {

			tx.begin();
			session.update(pEmploye);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			throw e;
		}

	}

	@Override
	public void deleteEmploye(Integer pIdEmploye) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		try {

			tx.begin();
			Employe employeSupp = getEmploye(pIdEmploye);
			session.delete(employeSupp);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			throw e;
		}

	}

	@Override
	public Employe getEmploye(Integer pIdEmploye) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		return session.get(Employe.class, pIdEmploye);

	}

	@Override
	public List<Employe> getAll() {

		Session session = sessionFactory.openSession();

		Query<Employe> query = session.createQuery("FROM Employe e");
		return query.list();
	}

}
