package com.intiformation.testConstantes;

public class TestConstantes {
	
public static void main(String[] args) {
	//1. creaton d'un objet de type de la classe Constantes
	// initialisation de la valeur de B (constante) via le ctor
	
	Constantes cons = new Constantes(6);
	
	//2. recup des valeurs A et B
	//A et B sont des constantes d'instance => on doit utiliser l'objet
	
	int valeurA = cons.A;
	int valeurB = cons.B;
	
	System.out.println("valeur de la constante A = " + valeurA);
	System.out.println("valeur de la constante B = " + valeurB);
	
	
//3. recup de la valeur de la constante C
	// C est une constante de classe => on doit donc utiliser la classe
	
	int valeurC = Constantes.C;
	
	System.out.println("valeur de la constante C = " + valeurC);
	
	
}// fin main
}// fin classe
