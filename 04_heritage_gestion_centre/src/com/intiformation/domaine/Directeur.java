package com.intiformation.domaine;

/**
 * extends = h�rite <br/>
 * Directeur h�rite de Employe <br/>
 * 
 * @author IN-MP-040
 *
 */

public class Directeur extends Employe {

	/* __________________propri�t�s de la classe______________ */

	private double bonus;

	/* __________________constructeur de la classe______________ */
	/** 
	 * ctor 1
	 * constructeur charg� 
	 *
	 * @param nom
	 * @param age
	 * @param salaire
	 */
	
	public Directeur(String nom, int age, double salaire) {
		
		// invocation du constructeur Employe(String, int, double) de la super classe Employ�
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
		
		this("Fran�ois Toko",45,80000.00);
		
	}//fin ctor3
	
	
	/* __________________m�thodes de la classe______________ */
	/* Redefinition de la m�thode getSalaire() de la super classe Employe */
	@Override
	public double getSalaire() {
		
		//impl�mentation de la m�thode
		
		// salaire de base du directeur
		// super : invocation d'une m�thode de la classe m�re
		
		double salaireBase = super.getSalaire();
		
		// salaire du directeur avec bonus
		
		double salaireDir = salaireBase + bonus;
		return salaireDir;
		
		
	}// fin getSalaire
	
	/** red�finition de la m�thode demanderUneFormation()
	 * de la classe Employe */
	
	@Override
	
	 public void demanderUneFormation(String theme){
		 
		 // appel de la m�thode demanderUneFormation de Employe
		 
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
