package com.intiformation.exceptions.Verifiees;


import java.io.IOException;

public class Animation {
	/**
	 * permet de t�l�charger une image
	 * la m�thode propage une exception de type IOException
	 * @param filePath : chemin vers l'image
	 */
	
	public void loadImage (String filePath) throws IOException{
		
		// cas d'erreur : photo vide
		
		if (filePath.isEmpty()) {
			
		// d�clenchement (lev�e) d'une exception => IOExcption
		
		throw new IOException("Probl�me E/S : Error Loading Image");
		}
	
		
		System.out.println("Loading image : " + filePath);
		
	}

}
