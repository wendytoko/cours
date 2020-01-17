package com.intiformation.domaine;

public class directeuragain {

	/** Mise en place de l'encapusulation
	 * 1. propriétés en private
	 * 2. pour chaque ptés
	 *    > méthode getter (accesseur)
	 *    > méthode setter (modificateur)
	 */
	/* propriétés de classe */
	private String nom;
	private int age;
	private double salaire;
	
	
	/* constructeur de la classe */
	
public directeuragain () {
	
}

/* méthode de la classe */

public void demanderUneFormation (String theme) {
	System.out.println("Le directeur" + nom + "demande une formation en" + theme);
		
	}/*fin demanderUneFormation*/
	
	public void valideLaFormation (String theme) {

	System.out.println("Le directeur valide la formation");
	}/* fin validerLaFormation*/

	/* encapsulation des champs */
	// 1. encapsuler la pté 'nom'
	
	
	public String getNom () {
		/** permet de retourner la valeur de la pté nom <br/>
		 * c'est un accesseur (getter)
		 * @return la valeur de la pté nom
		 */
		return nom;
	}
/** permet de modifier la valeur de la pté nom <br/>
 * c'est un modificateur (setter)
 * @param nouvelleValeur : la nouvelle valeur de la pté nom
 */
	public void setNom (String nouvelleValeur) {
		nom = nouvelleValeur;
		}
	
	/* encapsulation de la pté age */
	
	public void setAge (int nouvelleValeur) {
	age = nouvelleValeur;
	}
	
	public void getAge (int nouvelleValeur) {
		
	
	}
	/* encapsulation de la pté salaire */
	public void setSalaire (double nouvelleValeur) {
		salaire = nouvelleValeur;
	

				
	
		
		
		
		
	}
}/* fin classe*/
