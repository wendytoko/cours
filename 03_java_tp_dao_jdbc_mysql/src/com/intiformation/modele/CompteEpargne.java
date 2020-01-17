package com.intiformation.modele;

public class CompteEpargne extends CompteBancaire{

	// ____________________________________champs________________________________//
	
	double tauxremuneration = 0.03 ;
	
	// ____________________________________ctors________________________________//
	
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(int idCompteBancaire, int solde) {
		super(idCompteBancaire, solde);
		// TODO Auto-generated constructor stub
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
