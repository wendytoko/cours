package com.intiformation.hibernate.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.intiformation.hibernate.entity.Personne;
import com.intiformation.hibernate.tool.HibernateUtil;

public class AppTest {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Personne personne1 = new Personne("Victor Hugo");
		Personne personne2 = new Personne("Charles Monet");
		Personne personne3 = new Personne("Denis Diderot");
		
		Transaction tx = session.beginTransaction();
		
		session.save(personne1);
		session.save(personne2);
		session.save(personne3);
		
		tx.commit();
		
		System.out.println("Liste des personnes dans la BDD : ");
		
		List<Personne> liste = session.createQuery("FROM personne p").list();
		
		for(Personne pers : liste) {
			System.out.println("\t > " + pers.getIdPersonne() + " : "+ pers.getNom());
		}
		
		
	}// fin main

}// fin classe

