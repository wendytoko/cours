package com.intiformation.structure.de.decision;

public class AppTestIf {
	
	public static void main(String[] args) {
		
		boolean verif = false;
				
				//1ere syntaxe
				
				if(verif) System.out.println("synthaxe 1 : condition vérifiée");
		
		System.out.println("synthaxe 1 : condition non vérifiée");
		
		//2e synthaxe
		
		int valeur = 10;
		
	if (valeur > 0 || valeur < 0) {
		
		System.out.println("syntaxe 2 : condition non vérifiée");
	}
	//3e synthaxe
	
	String langue1 = "anglaise";
	String langue2 = "lingala";
	
	if("lingala".equals(langue2)) {
		// condition true
		System.out.println("synthaxe 3 : (anglais) condition vérifiée");
		System.out.println("\t nom / prenom/age");
	} else {
		System.out.println("syntaxe 3 : (lingala) condition non vérifiée");
		System.out.println("\t nom / prenom/age");
		//condition false
	}
	
	
	//4e synthaxe : if else if else
	
	String langue = "anglaise";
	
	
	if ("anglaise".equals(langue)) {
		
		// condition true
		System.out.println("synthaxe 4 : (lingala) condition vérifiée");
		System.out.println("\t nom / prenom/age");
		
	} else {
		System.out.println("syntaxe 4 : (anglaise) condition non vérifiée");
		System.out.println("\t nom / prenom/age");
		//condition false
	}
	
	//5e synthaxe if-else avec opérateur ternaire
	
	int x=30;
	int y = 50;
	int max;
	
	// cas avec if-else
	if(x<y) {
		max = y;
	}
	else {
		max = x;
	}
	System.out.println("syntaxe 5 : (if-else) max =" + max);
	
	// cas avec operateur ternaire
	// (condition)? valeur à retourner avec condition true : valeur à retourner avec condition false
	max = (x < y)?y : x;
	
	}// fin main


}// fin classe
