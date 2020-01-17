package com.intiformation.exceptions.Verifiees;


import java.io.IOException;

public class Animation {
	/**
	 * permet de télécharger une image
	 * la méthode propage une exception de type IOException
	 * @param filePath : chemin vers l'image
	 */
	
	public void loadImage (String filePath) throws IOException{
		
		// cas d'erreur : photo vide
		
		if (filePath.isEmpty()) {
			
		// déclenchement (levée) d'une exception => IOExcption
		
		throw new IOException("Problème E/S : Error Loading Image");
		}
	
		
		System.out.println("Loading image : " + filePath);
		
	}

}
