package modele;

import dao.CompteBancaire;

public class CompteCourant extends CompteBancaire {
	
	// ____________________________________champs________________________________//
	
	int decouvert = 100;
	
	
	// ____________________________________ctors________________________________//

	public CompteCourant() {
		super();
		
	}

	public CompteCourant(int decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteCourant(int numero, int solde) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
	}
	
	// ____________________________________getters/setters________________________________//

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



	





}// fin classe
