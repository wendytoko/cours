package com.intiformation.exception.declenchementExceptionsThrow;

public class Calculatrice3 {
	/**
	 * calcul de la division de a sur b
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int div(int a, int b) {
		
		//cas b=0 : déclenchement manuel d'une exception => ArithmeticException
		
		System.out.println(".... avant incident");
		if (b == 0) {
			/**
			 * 1. levée d'une exception en java
			 */
			
			// instanciation de l'objet de l'exception
			
			//ArithmeticException ar = new ArithmeticException("Vous ne devez pas diviser un nombre par zéro");//
			
			// déclenchement manuel de l'exception
			
		//	throw ar;*/
			
			// ou
			// throw new ArithmeticException("Vous ne devez pas diviser un nombre par zéro");
			
			/** 2. levée d'une exception personnalisée
			 * 
			 */
			throw new ArithmeticExceptionPerso("Vous ne devez pas diviser un nombre par zéro");
		}
		System.out.println(".... après incident");
		return a/b;
		
		
	}

}
