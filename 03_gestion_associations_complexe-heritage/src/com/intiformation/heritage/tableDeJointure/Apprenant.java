package com.intiformation.heritage.tableDeJointure;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="PERSONNEL_ID",
referencedColumnName="idPersonne")// amélioration de la FK
@DiscriminatorValue("APP")
public class Apprenant extends Personnel{
	private String formation;
	private float note;
	
	public Apprenant() {
		super();
	}
	public Apprenant(String nom, String formation, float note) {
		super(nom);
		this.formation = formation;
		this.note = note;
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
		return "Apprenant [formation=" + formation + ", note=" + note + "]";
	}

}
