package com.intiformation.association.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdresse;
	private String rue;
	private String codePostal;
	private String ville;
	
	/*----------------------------------------------*/
	/*---------------Association--------------------*/
	/*-----------1 adresse to 1 personne------------*/
	/*----------------------------------------------*/
	
	/**
	 * la classe Adresse doit definir la relation inverse
	 * en précisant la classe propriétaire via le param 'mappeBy'
	 */
	@OneToOne(mappedBy="adresse", cascade=CascadeType.ALL)// mappedBy vise la pté 'adresse' déclarée dans la classe Personne
	private Personne personne;
	
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	Adresse(){
		
	}

	public Adresse(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "code postal : " + this.getCodePostal() + "ville : " + this.getVille() + "rue : " + this.getRue();
	}
	

}// fin classe
