package fr.formation.inti.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class CDaoGeneric<T,PK extends Serializable> implements IDaoGeneric<T, Serializable>{
	
	private Class<T> type;
	
	 
	public CDaoGeneric(Class<T> type) {
		 this.type = type;
		 }
	
	
	@Override
	public PK create(T t) {
		EntityManager em = Persistence.createEntityManagerFactory("fr.formation.inti").createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(t);
		
		tx.commit();
		em.close();
		
		
		return null;// redefinir après dans le main
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getById(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}