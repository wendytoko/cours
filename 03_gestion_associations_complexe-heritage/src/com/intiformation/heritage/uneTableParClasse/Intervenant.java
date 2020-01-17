package com.intiformation.heritage.uneTableParClasse;

import javax.persistence.Entity;

@Entity
public class Intervenant extends Employe{
	private String domaine;
	private String role;
	
	public Intervenant() {
		super();
	}
	
	public Intervenant(String nom, String domaine, String role) {
		super(nom);
		this.domaine = domaine;
		this.role = role;
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
		return "Intervenant [domaine=" + domaine + ", role=" + role + "]";
	};

}
