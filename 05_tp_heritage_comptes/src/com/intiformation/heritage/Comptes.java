package com.intiformation.heritage;

public class Comptes {
	
	//proprietes//
	
	int numero;
	String nom;
	double solde;
    double taux;
	double decouvert;
	
	//constructeur vide//
	
	Comptes(){
	
	}// fin constructeur
	
	//comportement comptes //
	
	public Comptes(String proprio, int num, double montant){ 
		this.nom= proprio; 
		this.numero = num; 
		this.solde = montant; 
	}
	
	public Comptes(String proprio, int num, double montant, double taux, double decouvert_autorise){
	this.nom = proprio;
	this.numero = num;
	this.solde = montant;
	this.taux = montant;
	this.decouvert = decouvert_autorise;
		
	}
	
	public Comptes(String proprio, int num, double montant, double taux) {
		this.nom = proprio;
		this.numero = num;
		this.solde = montant;
		this.taux = montant;
		
		
	}
	//1. consulter solde
	public double getSoldeCourant(){ 
		return this.solde ; 
		}
	//2. deposer de l'argent
	public void deposer(double montant){ 
		this.solde = solde + montant ; 
		}
	//3. retirer de l'argent
	public void retirer(double montant){ 
		System.out.println("Appel de retrait sur compte simple"); 
	}


	
}//fin classe
	