package com.intiformation.heritage;

public class Compte_Courant extends Comptes {
	
	double decouvert_autorise;
	public void ﬁxeDecouvertAutorise(double montant){ 
	this.decouvert_autorise= montant; }
	public Compte_Courant(String proprio, int num, double montant, double taux, double decouvert_autorise){
		
	super(proprio, num, montant, taux);
	
}

}// fin classe
