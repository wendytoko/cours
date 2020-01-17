package com.intiformation.association.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppTestOneToMany {
	public static void main(String[] args) {
		
		/**
		 * OneToMany :
		 * 1 session suit 0 à plusieurs modules de formation
		 * 
		 * >> en JPA la multiplicité * est réalisée par une collection[Collection, Map, List, Set]
		 * 
		 * >> comportement par defaut de l'asso oneToMany avec JPA :
		 * 	> ajout d'une table de jointure
		 * 	> cette table utilise 2 FKs
		 *  > le nom de la table table1_table2
		 *  
		 *  	> NB : En termes de conception UML, ce n'est pas préconisé cad que 2 classes = 2 tables avec
		 *             * coté porteur de la FK
		 *             
		 *             Cette approche ne respecte pas la modélisation UML qui préconise que dans une relation 1--*
		 *             le côté * sera le porteur de la FK
		 * 
		 */
		
		SessionFormation session1 = new SessionFormation(1, "dingo");
		
		
		ModuleFormation module1 = new ModuleFormation(1, "JavaSE");
		module1.setSessionFormation(session1);
		ModuleFormation module2 = new ModuleFormation(2, "JavaEE");
		module1.setSessionFormation(session1);
	
		
		
		List<ModuleFormation> listeModules = new ArrayList<>();
		listeModules.add(module1);
		listeModules.add(module2);
		
		
		//session1.setListeModules(listeModules);
		
		EntityManager em = Persistence.createEntityManagerFactory("02_gestion_associations_jpa").createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(session1);
		
		
		tx.commit();
		
		
	}// fin main

}// fin classe
