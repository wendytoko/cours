package com.intiformation.association.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCours;
	private String libelle;
	
	
	/*---------------------------------------*/
	/*----------Association------------------*/
	/*---------------------------------------*/
	/**
	 * Cours est le coté * de l'asso et porteur de la FK
	 */
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PROMOTION_ID",
	referencedColumnName="idPromotion")
	private Promotion promotion;
	
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public Cours() {
		super();
	}
	public Cours(int idCours, String libelle) {
		super();
		this.idCours = idCours;
		this.libelle = libelle;
	}
	public int getIdCours() {
		return idCours;
	}
	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getLibelle()+ this.getIdCours();
	}
	
	

}// fin classe
