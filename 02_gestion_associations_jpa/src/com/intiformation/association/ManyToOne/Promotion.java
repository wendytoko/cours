package com.intiformation.association.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Promotion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPromotion;
	private String libelle;
	
	
	
	
	
	public Promotion() {
		super();
	}
	public Promotion(int idPromotion, String libelle) {
		super();
		this.idPromotion = idPromotion;
		this.libelle = libelle;
	}
	public int getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", libelle=" + libelle + "]";
	}

}
