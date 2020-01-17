package com.intiformation.introjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Cette classe va correspondre à une table dans la BDD. C'est Entity.
 * JPA nous oblige à la déclarer comme un JavaBean (POJO  = Plain Old Java Object)
 * Un JavaBean (modèle de données) a des spécifications techniques : 
 * Toutes les ptés en privé, au moins 1 ctor vide (pour que l'appli puisse l'instancier) et getters/setters
 * @author IN-MP-040
 *
 */

@Entity // déclaration de la classe comme Entity

public class Formateur {
	
	/**
	 * > une classe mappée vers une table dans la bdd via l'api JPA
	 * est nommée Entity
	 * 
	 * >config par défaut du mapping : @Entity  + @Id
	 */

	/*_____________________Ptés________________*/
	
	@Id // la pté sera représentée comme la PK de la table danss la bdd
	private int idFormateur;// va être ma clé primaire dans ma table dans la bdd

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
