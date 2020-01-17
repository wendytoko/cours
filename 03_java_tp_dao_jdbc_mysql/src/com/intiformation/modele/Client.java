package com.intiformation.modele;

public class Client {

	// ____________________________________champs________________________________//

	int idclient;
	String nom;
	String prenom;
	String adresse;
	int codepostal;
	String ville;
	int telephone;
	

	// ____________________________________ctor________________________________//

	public Client() {

	}// fin ctor vide

	public Client(int idclient, String nom, String prenom, String adresse, int codepostal, String ville, int telephone) {
		super();
		this.idclient = idclient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.telephone = telephone;
		
	}// fin ctor chargé

	// ____________________________________getters/setters________________________________//

	public Client(String nom, String prenom, String adresse, int codepostal, String ville, int telephone) {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String nom, String prenom, String adresse) {
		
	}

	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


		// ____________________________________redéfiinition de la classe
		// Object________________________________//

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "idclient = " + idclient + " \t> - nom = " + nom + " \t> - prénom = " + prenom + " \t> - adresse = " + adresse
				+ " \t> - code postal = " + codepostal + "\t> - ville = " + ville + " \t> -téléphone = " + telephone;
	}

}// fin classe
