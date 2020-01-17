package dao;

public class CompteBancaire {
	// ____________________________________champs________________________________//

	int numero;
	double solde;

	// ____________________________________ctors________________________________//

	public CompteBancaire() {

	}// fin ctor vide

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public CompteBancaire(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	

	
}// fin classe
