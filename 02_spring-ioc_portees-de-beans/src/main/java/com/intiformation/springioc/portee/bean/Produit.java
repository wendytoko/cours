package com.intiformation.springioc.portee.bean;

public class Produit {
	
	/*___________________ props __________________*/
	private String nom;
	private double prix;

	/*___________________ ctors __________________*/
	/**
	 * ctor vide
	 */
	public Produit() {
	}

	/*___________________ getters/setters __________________*/
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prix=" + prix + "]";
	}

}
