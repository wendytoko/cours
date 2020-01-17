package modele;

import dao.CompteBancaire;

public class CompteEpargne extends CompteBancaire{

	// ____________________________________champs________________________________//
	
	double tauxremuneration = 0.03;
	
	// ____________________________________ctors________________________________//
	
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return super.getNumero();
	}

	@Override
	public void setNumero(int numero) {
		// TODO Auto-generated method stub
		super.setNumero(numero);
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

	public CompteEpargne(int numero, int solde) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(int tauxremuneration) {
		super();
		this.tauxremuneration = tauxremuneration;
	}

	// ____________________________________getters/setters________________________________//
	
	
	

}// fin classe
