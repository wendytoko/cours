package com.intiformation.springioc.portee.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intiformation.springioc.portee.bean.Panier;
import com.intiformation.springioc.portee.bean.Produit;

public class AppTestPanier {
	
	/**
	 * > Supposons que 2 clients consultent simultanément notre 
	 *   site web. 
	 *   	>> le 1er client obtient un panier avec la 
	 *         méthode getBean() et ajoute 1 produit
	 *         
	 *      >> le 2eme client obtient un panier avec la 
	 *         méthode getBean() et ajoute 1 produit 
	 */

	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//--- 1. instanciation du conteneur Spring IoC 
		ApplicationContext conteneurLegerSpring = 
				new ClassPathXmlApplicationContext("applicationContext-portees.xml");
		
		//--- 2. récup des beans des produits du conteneur 'produitBean1'/'produitBean2'
		Produit produitIphone = (Produit) conteneurLegerSpring.getBean("produitBean1");
		
		Produit produitGalaxy = (Produit) conteneurLegerSpring.getBean("produitBean2");
		
		//-- 3. 1er client -> recup d'un panier à partir du conteneur -> ajout de produits 
		Panier panierClient1 = (Panier) conteneurLegerSpring.getBean("panierBean");
		panierClient1.ajouterProduitDansPanier(produitIphone);
		
		System.out.println("Panier du client 1 ========================================");
		System.out.println("\t > " + panierClient1.getAllProduitsDuPanier());
		System.out.println("===========================================================");
		
		//-- 4. 2eme client -> recup d'un panier à partir du conteneur -> ajout de produits 
		Panier panierClient2 = (Panier) conteneurLegerSpring.getBean("panierBean");
		panierClient2.ajouterProduitDansPanier(produitGalaxy);
		
		System.out.println("Panier du client 2 ========================================");
		System.out.println("\t > " + panierClient2.getAllProduitsDuPanier());
		System.out.println("===========================================================");
		
	}//end main

}//end class







