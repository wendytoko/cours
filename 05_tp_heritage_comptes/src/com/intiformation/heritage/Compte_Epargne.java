package com.intiformation.heritage;

public class Compte_Epargne extends Comptes {
	
	//propriete specifique//
	
	
	private double taux ;
	private double interets;
	
	public void ﬁxerTaux(double montant){ 
		this.taux = montant ; }
	
	public Compte_Epargne(String proprio, int num, double montant, double taux){ 
		
		//invocation de la super classe//
		super(proprio, num, montant) ; 
	
		//fixer taux//
		ﬁxerTaux(taux); 
	
		//fixer interet//
		
		interets = 0.0; }
	//calculer interets//
	
	public void calculerInteret(){ 
		interets = interets + solde;
		}
	

	
		
	

}//fin classe
