package com.intiformation.modele;

public abstract class Personnel {
	
	/*____________attributs_________*/
	
	private String nom;

	/*____________constructeurs_________*/
	
	public Personnel(String nom) {
		super();
		this.nom = nom;
	}
	/*____________méthodes_________*/
	
	public abstract String decrirePersonnel(); //on laisse le choix aux classes filles de redefinir elles memes la description <br/>
	
	/** ajout de 3 fonctionnalités pour tout type du personnel:
	 * 1. calculer le salaire brut
	 * 2. calculer le nombre de mois travaillés
	 * 3. calculer les indemnités de congés
	 * 
	 * comme c'est commun à tout type de personnel on le déclare en haut
	 */
	
	// specifique à un type de personnel//
	
	public abstract double calculerSalaireBrut();
	public abstract double calculerMoisTravailles();
	
	// commun à tous les types de peronnel//
	public double calculerIndemnitesConges() {
		 
		double indemnitesConges = calculerSalaireBrut() * calculerMoisTravailles()/12;
		
		return indemnitesConges;
	}
	
	/*____________getters/setters_________*/
	
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
	
	/*____________getters/setters_________*/
	

	

}//fin classe
