package com.intiformation.exception.multiples;

public class Calculatrice2 {
	
	public void diviser() {
		
		// déclenchement de plusieurs exceptions
		
		 // division par zero => ArithmeticException
		
		int x;
		x = 1/0;
		
		// stockage d'un mauvais type dans un tableau => ArrayStoreException
		
		Object[] tab = new Integer[4];
		tab [0] = 4.4; // erreur car 4.4 n'est pas un entier
		
		// caster un objet en sous classe dont il n'est pas une instance
		// => ClassCastException
		
		Object obj = Integer.valueOf(42);
		String chaine = (String)obj;
		
		
		
		
	}// fin methode
}// fin classe
