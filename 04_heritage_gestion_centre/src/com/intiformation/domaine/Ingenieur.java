package com.intiformation.domaine;

/** final = interdiction d'heriter de la classe**/

public /*final*/ class Ingenieur extends Employe {
	


//____________propri�t�s de la classe des ing�nieurs_________//
	
	public String Specialite;
	

//_____________constructeur de la classe des ing�nieurs______//
	/** constructeur 1
	 * 
	 * @param nom
	 * @param age
	 * @param salaire
	 */

	public Ingenieur() {
	}
	
	public Ing�nieur(String pNom, int pAge, double pSalaire, String specialite) {
		super (nom, age, salaire);
		this.Specialite = specialite;
		

	
}// fin constructeur
	

	//_____________m�thode de la classe des ing�nieurs______//
	
	public final void developper() {
		System.out.println("developpe en programmation java");
		
	
		}
		
	}
	
}// fin classe