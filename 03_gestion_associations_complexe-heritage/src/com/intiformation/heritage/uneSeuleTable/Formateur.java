package com.intiformation.heritage.uneSeuleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Formateur extends Personne {
	
	
	private String domaine;
	private String role;
	public Formateur() {
		super();
	}
	
	public Formateur(String nom, String domaine, String role) {
		super();
		this.domaine = domaine;
		this.role = role;
	}
	
	public Formateur(int idPersonne, String nom) {
		super(idPersonne, nom);
		// TODO Auto-generated constructor stub
	}

	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Formateur [domaine=" + domaine + ", role=" + role + "]";
	};
	
	

}// fin classe
