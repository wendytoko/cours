package com.intiformation.exception.declenchementExceptionsThrow;
/**
 * Exception personnalis�e qui h�rite de ArithmeticException
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
	 * ctor charg� avec le message de l'exception en argument/param
	 * @param s
	 */

	public ArithmeticExceptionPerso(String s) {
		super(s);
		
	}
	
	

}
