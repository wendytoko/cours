package com.intiformation.heritage.tableDeJointure;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="PERSONNEL_ID",
referencedColumnName="idPersonne")
@DiscriminatorValue("ENS")
public class Enseignant extends Personnel {
	private String domaine;
	private String role;
	
	public Enseignant() {
		super();
	}
	
	public Enseignant(String nom, String domaine, String role) {
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
		return "Formateur [domaine=" + domaine + ", role=" + role + "]";
	};

}
