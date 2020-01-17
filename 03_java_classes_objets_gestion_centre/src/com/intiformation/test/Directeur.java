package com.intiformation.test;

public class Directeur {
	
	
	public String nom;
	public int age;
	public double salaire;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Directeur() {

	}// fin constructeur

	public void demanderUneFormation(String theme) {
		System.out.println("l'employé" + nom + "demande une formation en " + theme);
	}// fin demander formation

	public void validerLaFormation(String theme) {
		System.out.println("Le directeur" + "valide la formation");


	}// fin valider formation

}// FIN CLASSE
