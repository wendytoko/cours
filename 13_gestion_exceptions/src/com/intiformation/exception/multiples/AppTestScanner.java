package com.intiformation.exception.multiples;

import java.util.Scanner;

public class AppTestScanner {

	public static void main(String[] args) {
		
		//lire au clavier
		
		Scanner in = new Scanner(System.in);
		System.out.println("Quel est ton nom ?");
		
	   String nom = in.nextLine();
	   
	   System.out.println("Merci, " + nom);
		
}
}