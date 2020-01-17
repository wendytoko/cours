package com.intiformation.test;

import com.intiformation.modele.Boite;

public class AppTestBoite {
	public static void main(String[] args) {
		

	//1. cr�ation d'un objet boite
	
	Boite box = new Boite();
	
	//2. ajout d'un �l�ment dans la boite
	
	box.setElement ("chaise");// Object element = "chaise"
	
	//3. recup de l'�lement de la boite
	
	/**
	 * affectation d'un type object � une String => erreur de compilation
	 * 												=> cast obligatoire
	 */
	String element = (String) box.getElement(); // "chaise" = Object element
	
	System.out.println("element de la boite = " + element);
	
	//4. recup d'autres type par ex double
	/**
	 * recup => erreur de compilation => cast obligatoire
	 */
	
	double element1 = (double) box.getElement();
	System.out.println("element de la boite = " + element1);
	
	/**
	 * � l'ex�cution on a une erreur 
	 */
}// fin main
	

}// fin classe
