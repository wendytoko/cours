package com.intiformation.association.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersonne;
	private String nom;
	private String prenom;
	
	public Personne(){
		
	}
	
	/*-----------------------------------------------*/
	/*---------------Association---------------------*/
	/*-----------------------------------------------*/
	
	//one Personne to One Adresse
	@OneToOne(cascade=CascadeType.PERSIST)//cascade permet de définir une relation en cascade sur l'ajout le persist entre personne et adresse
	@JoinColumn(name="ADRESSE_ID",
	referencedColumnName="idAdresse")// pour gérer le nom de la clé étrangère
	private Adresse adresse;//mappedBy vise lui
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNom()+ this.getPrenom();
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

	
	

}// fin classe
