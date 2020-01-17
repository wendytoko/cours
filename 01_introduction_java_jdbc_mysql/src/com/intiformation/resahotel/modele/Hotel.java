package com.intiformation.resahotel.modele;
/** 
 * classe qui va servir de container pour les données
 * récupérées de la BDD
 * cette classe doit correspondre à la table "hotels' de la base de données
 * c'est notre modèle de données
 * @author IN-MP-040
 *
 */

public class Hotel {
	/*____________champs__________*/
	private int idHotel;
	private String libelle;
	private String etoile;
	
	/*____________ctors__________*/
	public Hotel() {
		
	}

	

	public Hotel(String libelle, String etoile) {
		super();
		this.libelle = libelle;
		this.etoile = etoile;
	}

	public Hotel(int idHotel, String libelle, String etoile) {
		super();
		this.idHotel = idHotel;
		this.libelle = libelle;
		this.etoile = etoile;
	}


	/*____________getter/setters__________*/
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


	// redefinition de la méthode toString() de la classe Object
	@Override
	public String toString() {
		
		return "id = " + idHotel + " - libelle = " + libelle + " - etoile = " + etoile;//on affiche de ce que l'on veut de la classe Hotel
	}// sysout par défaut va dans la classe Object donc faut redefinir la méthode dans la classe Hotel 
	

	
}// fin classe



