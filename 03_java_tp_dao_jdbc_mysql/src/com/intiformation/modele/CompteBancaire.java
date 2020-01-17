package com.intiformation.modele;

public class CompteBancaire {
	// ____________________________________champs________________________________//

	int idCompteBancaire;
	double solde;

	// ____________________________________ctors________________________________//

	public CompteBancaire() {

	}// fin ctor vide

	public CompteBancaire(int idCompteBancaire, double solde) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		this.solde = solde;
	}// fin ctor chargé
	public CompteBancaire(int idCompteBancaire) {
		super();
		this.idCompteBancaire = idCompteBancaire;
		
	}

	// ____________________________________getters/setters________________________________//

	public int getIdCompteBancaire() {
		return idCompteBancaire;
	}

	public void setIdCompteBancaire(int idCompteBancaire) {
		this.idCompteBancaire = idCompteBancaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteBancaire [idCompteBancaire=" + idCompteBancaire + ", solde=" + solde + "]";
	}

	

	
}// fin classe
