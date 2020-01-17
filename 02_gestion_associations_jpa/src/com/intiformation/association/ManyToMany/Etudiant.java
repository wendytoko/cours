package com.intiformation.association.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEtudiant;
	private String nom;
	private String prenom;
	
	
	/*---------------------------------------*/
	/*----------Association------------------*/
	/*---------------------------------------*/
	
	@ManyToMany(mappedBy="listeEtudiants")
	@JoinColumn(name="ETUDIANT_ID")
	private List<PromotionFormation> listePromotions;
	
	
	public List<PromotionFormation> getListePromotions() {
		return listePromotions;
	}
	public void setListePromotions(List<PromotionFormation> listePromotions) {
		this.listePromotions = listePromotions;
	}
	public Etudiant() {
		super();
	}
	public Etudiant(int idEtudiant, String nom, String prenom) {
		super();
		this.idEtudiant = idEtudiant;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
