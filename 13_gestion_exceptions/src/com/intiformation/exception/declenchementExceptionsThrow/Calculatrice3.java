package com.intiformation.exception.declenchementExceptionsThrow;

public class Calculatrice3 {
	/**
	 * calcul de la division de a sur b
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int div(int a, int b) {
		
		//cas b=0 : d�clenchement manuel d'une exception => ArithmeticException
		
		System.out.println(".... avant incident");
		if (b == 0) {
			/**
			 * 1. lev�e d'une exception en java
			 */
			
			// instanciation de l'objet de l'exception
			
			//ArithmeticException ar = new ArithmeticException("Vous ne devez pas diviser un nombre par z�ro");//
			
			// d�clenchement manuel de l'exception
			
		//	throw ar;*/
			
			// ou
			// throw new ArithmeticException("Vous ne devez pas diviser un nombre par z�ro");
			
			/** 2. lev�e d'une exception personnalis�e
			 * 
			 */
			throw new ArithmeticExceptionPerso("Vous ne devez pas diviser un nombre par z�ro");
		}
		System.out.println(".... apr�s incident");
		return a/b;
		
		
	}

}
