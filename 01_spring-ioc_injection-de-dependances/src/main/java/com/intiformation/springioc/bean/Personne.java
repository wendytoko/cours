package com.intiformation.springioc.bean;
/*
 * Classe sous forme de JavaBean (ptés en privé + 1ctor vide + getter/setter)
 * * Elle va être déclarée comme un bean spring (composant) dans
* le conteneur IoC de Spring

 */

public class Personne {
	/*_____________________ PROPRIETES _________________________*/
	
	private String nom;
	private int age;
	private double salaire;
	
	private Adresse adresse;
	
	/*_____________________ CONSTRUCTEUR VIDE _________________________*/
	
	public Personne() {
		
	}
	/*_____________________ G/S _________________________*/

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
	
	

}
