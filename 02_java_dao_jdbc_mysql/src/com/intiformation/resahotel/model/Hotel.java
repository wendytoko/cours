package com.intiformation.resahotel.model;

/**
 * classe qui va servir de container pour les donn�es r�cup�r�es de la BDD <br/>
 * cette classe doit correspondre � la table 'hotels' de la BDD <br/>
 * c'est notre modele de donn�es <br/>
 * 
 * @author INTIFORMATION
 *
 */
public class Hotel {

	/* _________________ champs ___________________ */
	private int idHotel;
	private String libelle;
	private String etoile;

	/* _________________ ctors ___________________ */

	public Hotel() {
		super();
	}

	public Hotel(String libelle, String etoile) {
		this.libelle = libelle;
		this.etoile = etoile;
	}

	public Hotel(int idHotel, String libelle, String etoile) {
		this.idHotel = idHotel;
		this.libelle = libelle;
		this.etoile = etoile;
	}

	/* _________________ getters/setters ___________________ */

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getEtoile() {
		return etoile;
	}

	public void setEtoile(String etoile) {
		this.etoile = etoile;
	}

	
	/*red�finition de la m�thode toString() de la classe Object */
	
	@Override
	public String toString() {
		
		return "id = " + idHotel + " - libelle = " + libelle + " - etoile = " + etoile;
	}

}// end class











