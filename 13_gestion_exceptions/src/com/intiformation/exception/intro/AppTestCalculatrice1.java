package com.intiformation.exception.intro;



public class AppTestCalculatrice1 {
	
	public static void main(String[] args) {
		Calculatrice1 calc1 = new Calculatrice1();
		System.out.println("=> début du programme");
		try {
			
			// appel de la methode diviser
			calc1.diviser(); // levée d'exception = création d'un objet de type java.lang.ArithmeticException
			
		}catch(ArithmeticException ex) {
			System.out.println("Incerception exception");
			
		}// end catch
		
		
		System.out.println(" => fin du programme");
		
	}// fin methode

	

}// fin classe
