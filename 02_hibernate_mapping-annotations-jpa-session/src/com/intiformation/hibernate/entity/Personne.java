package com.intiformation.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="personne")
@Table(name="personnes")
public class Personne {
	
	// ______________ Propriétés ____________________//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_personne")
	private int idPersonne;
	@Column(name="nom")
	private String nom;
	
	
	// ______________ Constructeurs ____________________//
	
	public Personne() {
		super();
	}


	public Personne(int idPersonne, String nom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
	}
	public Personne(String nom) {
		
		this.nom = nom;
	}

	// ______________ Getters/Setters ____________________//
	
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


	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + "]";
	}
	
	

}
