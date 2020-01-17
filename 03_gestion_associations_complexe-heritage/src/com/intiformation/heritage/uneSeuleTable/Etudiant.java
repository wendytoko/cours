package com.intiformation.heritage.uneSeuleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Etudiant extends Personne {
	
	private String formation;
	private float note;
	
	public Etudiant() {
		super();
	}
	public Etudiant(String nom, String formation, float note) {
		super();
		this.formation = formation;
		this.note = note;
	}
	
	public Etudiant(int idPersonne, String nom) {
		super(idPersonne, nom);
		// TODO Auto-generated constructor stub
	}
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Etudiant [formation=" + formation + ", note=" + note + "]";
	}
	

}// fin classe
