package com.intiformation.springioc.portee.bean;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	// un panier est un ensemble (une liste) de produits 
	//-> liste produits = panier 
	private List<Produit> produits = new ArrayList<>();
	
	/**
	 * ajout d'un produit dans le panier <br/>
	 * @param aProduit
	 */
	public void ajouterProduitDansPanier(Produit aProduit) {
		produits.add(aProduit);
	}
	
	/**
	 * recup de la liste des produits dans le panier <br/>
	 * @return
	 */
	public List<Produit> getAllProduitsDuPanier(){
		return produits;
	}
	
}//end class 
