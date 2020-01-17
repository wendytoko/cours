package com.intiformation.exceptions.Verifiees;

import java.io.IOException;

public class AppTestAnimation {
	
	// constante = chemin de l'image
	public static final String IMAGE_PATH = "lalala.gif";
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animation jeu = new Animation();
		System.out.println("> début du jeu");
		
		try {
			jeu.loadImage(IMAGE_PATH);
		} catch (IOException e) {
			
			e.printStackTrace();
			
			System.out.println("Interception IOException : " + e.getMessage());
		}finally {
			
			System.out.println("Exécution du bloc finally");// erreur ou pas, on va afficher le message
		
		}
		
		System.out.println("> fin du jeu");
	}

}
