package com.intiformation.springioc.autoscan.bean;

public class Employe {

	/* _____________ props ________________ */
	private int idEmploye;
	private String nom;
	private double salaire;

	/* _____________ ctors ________________ */
	/**
	 * ctor vide
	 */
	public Employe() {

	}

	/* _____________ getters/setters ________________ */
	
	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nom=" + nom + ", salaire=" + salaire + "]";
	}

}
