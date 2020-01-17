package com.intiformation.modele.generique;
import com.intiformation.modele.generique.BoiteGenerique1;

public class AppTestGenerique {
	public static void main(String[] args) {
		
		
		// creation d'un objet de type BoiteGenerique
		
		BoiteGenerique1<String> genericBox = new BoiteGenerique1<>();
		
		// ajout d'un élément dans la boite
	
		genericBox.setElement("chaise");
		
		// recup de l'élément
		String element = genericBox.getElement();
		
		System.out.println("élement (s) de la boite = " + element);
		// création d'un objet de type BoiteGenerique avec des entiers
		
		BoiteGenerique1<Integer> genericBoxInt = new BoiteGenerique1<>();
		
		// ajout d'un élément dans la boite
		
		genericBoxInt.setElement (120);
		
		// recup de l'élement
		
		int elemt = genericBoxInt.getElement ();
		/**
		 * autoboxing = boxing (int (donnée primitive) -> Integer) + boxing (Integer -> int)
		 */
		// exemple boxing
		Integer x = new Integer (3);
		
		// utilité des classes enveloppes (WRAPPERS)
		// exemple : transformation une chaine en entier
		
		int y = Integer.parseInt("123");
		
	}// fin main



}// end classe
