package com.intiformation.exception.declenchementExceptionsThrow;
/**
 * Exception personnalisée qui hérite de ArithmeticException
 * @author IN-MP-040
 *
 */

public class ArithmeticExceptionPerso extends ArithmeticException {
	/**
	 * ctor vide
	 */

	public ArithmeticExceptionPerso() {
		super();
		
	}
	/**
	 * ctor chargé avec le message de l'exception en argument/param
	 * @param s
	 */

	public ArithmeticExceptionPerso(String s) {
		super(s);
		
	}
	
	

}
