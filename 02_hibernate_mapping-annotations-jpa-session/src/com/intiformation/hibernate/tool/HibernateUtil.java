package com.intiformation.hibernate.tool;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * permet de r�cuperer une session factory d'hiernate
 * @author IN-MP-040
 *
 */

public class HibernateUtil {
	
	/**
	 * NB : On obtient Configuration via hibernate 4 
	 * et registre de service dans hibernate 5 = interface StandardServiceRegistry
	 */

	// registre
	private static StandardServiceRegistry registry;
	
	//session factory
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory ==null) {
			try {
				// definition d'un builder du registre de service
				StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
				
				//construction du registre
				registry = builder.configure("hibernate.cfg.xml").build();
				
				/**
				 * toute la configuration d�clar�e dans le hibernate.cfg.xml 
				 * peut se faire avec du 100% java � travers l'objet 'registry'
				 */
				
				//d�claration des fichiers de mapping (juste pour voir, pas utile ici car d�j� fait dans le fichier de config)
				// equivaut � <mapping resource="/01_introduction_hibernate/src/com/intiformation/hibernate/entity/Personne.hbm.xml" 
				MetadataSources sources = new MetadataSources(registry);
				
				//sources.addResource("com/intiformation/hibernate/entity/Personne.hbm.xml");
				
				
				// construction de l'objet
				Metadata metadata = sources.getMetadataBuilder().build();
				
				// construction de la sessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
				
				
			}catch(Exception e){
				e.printStackTrace();
				
			}// fin catch
			
			
			
		}// fin if
		return sessionFactory;
		
	}// fin getSessionFacootry
	
	
}// fin classe
