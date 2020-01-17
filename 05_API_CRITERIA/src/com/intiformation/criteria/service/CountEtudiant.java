package com.intiformation.criteria.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.intiformation.criteria.entity.Etudiant;

public class CountEtudiant {

	public static void main(String[] args) {
		/// 1. recup de l'EM

		EntityManager em = Persistence.createEntityManagerFactory("05_API_CRITERIA").createEntityManager();

		// 2. recup de l'interface principale de l'API criteria à partir de l'EM

		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		
		cq.select(cb.count(cq.from(Etudiant.class)));
		
		Query query = em.createQuery(cq);
		
		Long result = (Long) query.getSingleResult();
		
		System.out.println("Nombre d'étudiants dans la BDD  : "+result);
	}

}
