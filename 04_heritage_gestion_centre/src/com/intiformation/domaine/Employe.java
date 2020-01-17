package com.intiformation.domaine;

public class Employe {

	/* ________________proprietes de la classe_________________ */

	private String nom;
	private int age;
	private double salaire;

	/* __________________constructeurs de la classe______________ */

	/**
	 * 
	 * 
	 * constructeur 1 constructeur vide
	 */
	public Employe() {

	}

	/**
	 * constructeur 2 constructeur chargé qui permet d'initialiser les valeurs des
	 * propriétés
	 * 
	 * @param pNom
	 * @param pAge
	 * @param pSalaire
	 */
	public Employe(String pNom, int pAge, double pSalaire) {
		nom = pNom;
		age = pAge;
		salaire = pSalaire;
	}
/** constructeur 3
 * 
 * @param pNom
 * @param pAge
 */
	public Employe(String pNom, int pAge) {
		nom = pNom;
		age = pAge;
	}
	
	/** constructeur 4
	 * 
	 * @param pAge
	 * @param pNom
	 * @param pSalaire
	 */
	public Employe(int pAge,String pNom, double pSalaire) {
		nom = pNom;
		age = pAge;
		salaire = pSalaire;
	}
	
	

	/* __________________méthodes de la classe______________ */
	/**
	 *  permet de demander une formation
	 * 
	 * @param theme
	 */
	public void demanderUneFormation(String theme) {
		System.out.println("l'employé " + nom + " demande une formation en " + theme);
	} //fin demanderUneFormation
	
	/* __________________encapsulation des attributs de la classe______________ */
	
	/* raccourci : alt+shift+s*/
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	


}// fin classe


