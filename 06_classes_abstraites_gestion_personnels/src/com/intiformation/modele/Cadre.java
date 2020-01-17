package com.intiformation.modele;
/** classe deriv�e de la classe Personnel
 * 
 * @author IN-MP-040
 *
 */
public abstract class Cadre extends Personnel {
	

	public Cadre(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}//fin ctor
	
	public abstract double calculerPrimeFinAnnee(); 
		
	// calcul de primes de fin d'ann�e pour un cadre donn� qui diff�re d'un cadre � un autre <br/>

	@Override
	public String decrirePersonnel() {
		// TODO Auto-generated method stub
		return "un cadre avec un bonus du 6000 euros";
	}

	@Override
	public double calculerSalaireBrut() {
		// TODO Auto-generated method stub
		return 45000;
	}

	@Override
	public double calculerMoisTravailles() {
		// TODO Auto-generated method stub
		return 9;
	}

}//fin classe
