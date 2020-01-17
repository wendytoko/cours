package com.intiformation.springioc.orm.bean;

public class Employe {
	
	private Integer idEmploye;// doit être de la classe Objet
	private String nom;
	private double salaire;
	
	public Employe() {
		super();
	}
	public Employe(Integer idEmploye, String nom, double salaire) {
		super();
		this.idEmploye = idEmploye;
		this.nom = nom;
		this.salaire = salaire;
	}
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Integer idEmploye) {
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
