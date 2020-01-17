package com.intiformation.domaine;

/**
 * 
 * classe qui va définir le modèle d'employé
 *  * @author IN-MP-040
 *
 */
public class Employe {
/*      déclaration des propriétés de la classe       */
public	String nom;// déclaration de la variable nom de type String (chaine de caractère)
public int age;
public double salaire;


/* définition d'un constructeur de la classe */
/**
 * Un constructeur est une méthode sans type retour ayant comme nom le nom de la classe.
 * constructeur vide. <br/>
 * s'éxécute à la création des objets de la classe <br/>
 */


public Employe() {
	
}


/* déclaration des méthodes de la classe   */

/** 
 * cette  méthode permet de définir le comportement d'un employé <br/>
 * cette méthode permet à l'employé de demander une formation. <br/>
 * @param theme : argument ou paramètre de la méthode qui permet de définir la formation demandée par l'employé
 */

public void demanderUneFormation(String theme) {
	System.out.println("l'employé" + nom + "demande une formation en " + theme);
} //fin demanderUneFormation
/**
 * cette méthode permet d'augmenter le salaire d'un employé <br/>
 * @param pourcentage : pourcentage d'augmentation du salaire
 */
	public void augmenterSalaire(double pourcentage) {
		  // 1.calcul de l'augmentation
		double augmentation = salaire * pourcentage/100;
		
				//2. ajout de l'augmentation au salaire
				salaire = salaire + augmentation;
		// salaire += augmentation;
		// fin augmentation
	}
}//fin classe
