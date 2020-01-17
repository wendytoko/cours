package com.intiformation.exception.declenchementExceptionsThrow;

public class AppTestCalculatrice3 {
public static void main(String[] args) {
	
	Calculatrice3 cal3 = new Calculatrice3();
	
	System.out.println("==> Début du programme");
	
	try {
		
		int result = cal3.div(12, 0); // peut lever une exception => code à protéger
		
		System.out.println("Résultat de la division = " + result);
		
	} catch (/*ArithmeticException*/ ArithmeticExceptionPerso ex) {
	
		System.out.println("Interception d'une ArithmeticException. " + ex.getMessage());
	}
	
	
	System.out.println("=> Fin du programme ");
}
}
