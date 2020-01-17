package com.intiformation.springioc.demoConteneurIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.springioc.bean.Adresse;

public class AppTestConteneurIoCSpring {

	public static void main(String[] args) {

		/* ========================================================= */
		/* ======== Instanciation du conteneur IoC de Spring======== */
		/* ========================================================= */
		// On appelle également le conteneur le contexte d'application ou context

		ApplicationContext conteneurIoCSpring = new ClassPathXmlApplicationContext("spring-injection-beans.xml");

		/* ========================================================= */
		/* ======== Récupération des beans de Spring déclarées ===== */
		/* =============== dans le conteneur ======================= */
		/* ========================================================= */

		Adresse adresse1 = (Adresse) conteneurIoCSpring.getBean("adresseBean");
		
		/* =============================================================== */
		/* ======== Utilisation des objets récupérés du conteneur ======== */
		/* =============================================================== */
		System.out.println(adresse1);

	}// fin main

}// fin classe
