package com.intiformation.springioc.portee.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.springioc.portee.beans.Panier;
import com.intiformation.springioc.portee.beans.Produit;

public class AppTestPortee {

	public static void main(String[] args) {
		ApplicationContext ctr = new ClassPathXmlApplicationContext("applicationContext-portee.xml");
		Produit prod1 = ctr.getBean("produitBean1", Produit.class);
		Produit prod2 = ctr.getBean("produitBean2", Produit.class);

		Panier panier1 = ctr.getBean("panierBean", Panier.class);

		panier1.ajouter(prod1);

		System.out.println(panier1.getProduits());

		Panier panier2 = ctr.getBean("panierBean", Panier.class);

		panier2.ajouter(prod2);

		System.out.println(panier2.getProduits());
		//utilis° même panier (même bean) car portée = singleton par défaut --> chgt attribut scope
	}

}
