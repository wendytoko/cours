package com.intiformation.domaine;

/**
 * extends = hérite <br/>
 * Directeur hérite de Employe <br/>
 * 
 * @author IN-MP-040
 *
 */

public class Directeur extends Employe {

	/* __________________propriétés de la classe______________ */

	private double bonus;

	/* __________________constructeur de la classe______________ */
	/** 
	 * ctor 1
	 * constructeur chargé 
	 *
	 * @param nom
	 * @param age
	 * @param salaire
	 */
	
	public Directeur(String nom, int age, double salaire) {
		
		// invocation du constructeur Employe(String, int, double) de la super classe Employé
		super (nom, age, salaire);
		
		bonus = 0;
		
		
	}//fin constructeur
	
	/** surcharge du ctor
	 * ctor 2
	 * 
	 * @param nom
	 * @param age
	 */
	public Directeur (String nom, int age){
		//invocation du ctor 1 avec le mot this()
		
		this(nom, age, 75000.00);
	}//fin ctor 2
	
	
	/**
	 *  ctor 3 <br/>
	 *  surcharge du ctor. appel du ctor 1
	 * 
	 */
	public Directeur () {
		
		this("François Toko",45,80000.00);
		
	}//fin ctor3
	
	
	/* __________________méthodes de la classe______________ */
	/* Redefinition de la méthode getSalaire() de la super classe Employe */
	@Override
	public double getSalaire() {
		
		//implémentation de la méthode
		
		// salaire de base du directeur
		// super : invocation d'une méthode de la classe mère
		
		double salaireBase = super.getSalaire();
		
		// salaire du directeur avec bonus
		
		double salaireDir = salaireBase + bonus;
		return salaireDir;
		
		
	}// fin getSalaire
	
	/** redéfinition de la méthode demanderUneFormation()
	 * de la classe Employe */
	
	@Override
	
	 public void demanderUneFormation(String theme){
		 
		 // appel de la méthode demanderUneFormation de Employe
		 
		 super.demanderUneFormation(theme);
		 
		 System.out.println("Etant le directeur, il valide la formation");
	 }// fin demanderUneFormation

	/* __________________encapsulation des champs de la classe______________ */

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}// fin classe
