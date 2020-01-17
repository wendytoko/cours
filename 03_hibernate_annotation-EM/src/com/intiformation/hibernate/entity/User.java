package com.intiformation.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private int idUser;
	@Column(name="nom")
	private String nom;
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + "]";
	}

	public User(int idUser, String nom) {
		super();
		this.idUser = idUser;
		this.nom = nom;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
