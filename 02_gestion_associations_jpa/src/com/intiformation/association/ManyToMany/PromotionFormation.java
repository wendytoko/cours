package com.intiformation.association.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PromotionFormation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPromotion;
	private String libelle;
	
	
	/*---------------------------------------*/
	/*----------Association------------------*/
	/*---------------------------------------*/
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="WESH",
	joinColumns=@JoinColumn(name="ETUDIANT_ID"),
	inverseJoinColumns=@JoinColumn(name="PROMO_ID"))
	private List<Etudiant> listeEtudiants;
	
	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}
	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}
	public PromotionFormation() {
		super();
	}
	public PromotionFormation(int idPromotion, String libelle) {
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
		return "PromotionFormation [idPromotion=" + idPromotion + ", libelle=" + libelle + "]";
	}
	
	

}
