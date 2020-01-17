package com.intiformation.conversion_numerique;

public class AppTestConversionNumerique {

	public static void main (String [] args) {
		/**
		 * 2 types de conversion numérique :
		 * 
		 * 1. conversion implicite : conversion vers un type plus étendu
		 * > sans risque de pertes d'informations
		 * 2. conversion explicite : conversion vers un type moins étendu
		 * > avec perte d'informations
		 */
		
		/* 1. conversion implicite : int vers double */
		int n = 123456789;
		double f = n;
		System.out.println("valeur f (double) = " + f);
		
		/* 2. conversion explicite : double vers long */
		float surface = 2496.8f;
int approximation = (int)surface;//cast en int
System.out.println("valeur surface (int) = " + approximation);

	}// fin main
}// fin classe
