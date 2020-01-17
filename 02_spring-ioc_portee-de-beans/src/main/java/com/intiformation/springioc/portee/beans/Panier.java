package com.intiformation.springioc.portee.beans;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	private List<Produit> produits = new ArrayList<>();
	
	public Panier() {
		
	}
	
	public void ajouter(Produit produit)
	{
		produits.add(produit);
	}

	public List<Produit> getProduits() {
		return produits;
	}
	
	
}
