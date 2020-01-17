package com.intiformation.modele;

public class CompteCourant extends CompteBancaire {
	
	// ____________________________________champs________________________________//
	
	int decouvert;
	
	// ____________________________________ctors________________________________//

	public CompteCourant() {
		super();
		
	}

	public CompteCourant(int idCompteBancaire, int solde) {
		super(idCompteBancaire, solde);
		
	}

	// ____________________________________getters/setters________________________________//
	@Override
	public int getIdCompteBancaire() {
		// TODO Auto-generated method stub
		return super.getIdCompteBancaire();
	}

	@Override
	public void setIdCompteBancaire(int idCompteBancaire) {
		// TODO Auto-generated method stub
		super.setIdCompteBancaire(idCompteBancaire);
	}

	@Override
	public double getSolde() {
		// TODO Auto-generated method stub
		return super.getSolde();
	}

	@Override
	public void setSolde(double solde) {
		// TODO Auto-generated method stub
		super.setSolde(solde);
	}
	
	

}// fin classe
