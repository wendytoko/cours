package com.intiformation.modele;

public abstract class Personnel {
	
	/*____________attributs_________*/
	
	private String nom;

	/*____________constructeurs_________*/
	
	public Personnel(String nom) {
		super();
		this.nom = nom;
	}
	/*____________m�thodes_________*/
	
	public abstract String decrirePersonnel(); //on laisse le choix aux classes filles de redefinir elles memes la description <br/>
	
	/** ajout de 3 fonctionnalit�s pour tout type du personnel:
	 * 1. calculer le salaire brut
	 * 2. calculer le nombre de mois travaill�s
	 * 3. calculer les indemnit�s de cong�s
	 * 
	 * comme c'est commun � tout type de personnel on le d�clare en haut
	 */
	
	// specifique � un type de personnel//
	
	public abstract double calculerSalaireBrut();
	public abstract double calculerMoisTravailles();
	
	// commun � tous les types de peronnel//
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
