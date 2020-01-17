package com.intiformation.domaine;

/** final = interdiction d'heriter de la classe**/

public /*final*/ class Ingenieur extends Employe {
	


//____________propriétés de la classe des ingénieurs_________//
	
	public String Specialite;
	

//_____________constructeur de la classe des ingénieurs______//
	/** constructeur 1
	 * 
	 * @param nom
	 * @param age
	 * @param salaire
	 */

	public Ingenieur() {
	}
	
	public Ingénieur(String pNom, int pAge, double pSalaire, String specialite) {
		super (nom, age, salaire);
		this.Specialite = specialite;
		

	
}// fin constructeur
	

	//_____________méthode de la classe des ingénieurs______//
	
	public final void developper() {
		System.out.println("developpe en programmation java");
		
	
		}
		
	}
	
}// fin classe