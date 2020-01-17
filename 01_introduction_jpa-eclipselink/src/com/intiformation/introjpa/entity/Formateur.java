package com.intiformation.introjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Cette classe va correspondre � une table dans la BDD. C'est Entity.
 * JPA nous oblige � la d�clarer comme un JavaBean (POJO  = Plain Old Java Object)
 * Un JavaBean (mod�le de donn�es) a des sp�cifications techniques : 
 * Toutes les pt�s en priv�, au moins 1 ctor vide (pour que l'appli puisse l'instancier) et getters/setters
 * @author IN-MP-040
 *
 */

@Entity // d�claration de la classe comme Entity

public class Formateur {
	
	/**
	 * > une classe mapp�e vers une table dans la bdd via l'api JPA
	 * est nomm�e Entity
	 * 
	 * >config par d�faut du mapping : @Entity  + @Id
	 */

	/*_____________________Pt�s________________*/
	
	@Id // la pt� sera repr�sent�e comme la PK de la table danss la bdd
	private int idFormateur;// va �tre ma cl� primaire dans ma table dans la bdd

	private String identifiant;
	
	private String motDePasse;
	
	
	
	/*_____________________Ctors________________*/
	
	public Formateur() {
		
	}

	/*_____________ __Getters/Setters________________*/

	public int getIdFormateur() {
		return idFormateur;
	}



	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}



	public String getIdentifiant() {
		return identifiant;
	}



	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
	
	
	
	
	
	
}// fin classe
