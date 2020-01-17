package com.intiformation.springioc.autowiring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.intiformation.springioc.autowiring.bean.Formateur;

/**
 * @author INTIFORMATION
 */
public class AppTest {

	public static void main(String[] args) {
		
		// récup du conteneur spring Ioc
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext-autowiring.xml");
		
		// récup du bean 'formateurBean'
		Formateur formateur1 = (Formateur) context.getBean("formateurBean");
		
		// affichage 
		System.out.println("Infos Formateur ==========================================");
		System.out.println("\t > Nom : " + formateur1.getNom());
		System.out.println("\t > Domaine : " + formateur1.getDomaine());
		System.out.println("\t > Module : " + formateur1.getModule().getLibelle());
		System.out.println("===========================================================");
		
	}
}
