package com.intiformation.exception.multiples;

public class AppTestCalculatrice {
	/**
	 * Interception d'exception multiples :
	 * > lorsqu'il y a une hiérarchie entre les exceptions
	 * on doit choisir l'ordre inverse de la hiérarchie
	 */



public static void main(String[] args) {
	
	Calculatrice2 cal2 = new Calculatrice2();
	System.out.println("=> début du programme");
	
	try {
		cal2.diviser();

		
	} catch (ArithmeticException ex ) {
		
		System.out.println("Interception ArithmeticException");
		
	}// fin catch 1
		
		catch (ArrayStoreException ex ) {
			
			System.out.println("Intercreption ArrayStoreException");
			
		}catch (ClassCastException ex ) {
			
			System.out.println("Interception ClassCastException");
		}
	System.out.println(" => fin du programme");
		
	}// fin main
	
}// fin classe


