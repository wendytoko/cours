package com.intiformation.domaine;

/**
 * 
 * classe qui va d�finir le mod�le d'employ�
 *  * @author IN-MP-040
 *
 */
public class Employe {
/*      d�claration des propri�t�s de la classe       */
public	String nom;// d�claration de la variable nom de type String (chaine de caract�re)
public int age;
public double salaire;


/* d�finition d'un constructeur de la classe */
/**
 * Un constructeur est une m�thode sans type retour ayant comme nom le nom de la classe.
 * constructeur vide. <br/>
 * s'�x�cute � la cr�ation des objets de la classe <br/>
 */


public Employe() {
	
}


/* d�claration des m�thodes de la classe   */

/** 
 * cette  m�thode permet de d�finir le comportement d'un employ� <br/>
 * cette m�thode permet � l'employ� de demander une formation. <br/>
 * @param theme : argument ou param�tre de la m�thode qui permet de d�finir la formation demand�e par l'employ�
 */

public void demanderUneFormation(String theme) {
	System.out.println("l'employ�" + nom + "demande une formation en " + theme);
} //fin demanderUneFormation
/**
 * cette m�thode permet d'augmenter le salaire d'un employ� <br/>
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
