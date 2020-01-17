package com.intiformation.springioc.bean;
/**
 * Classe sous forme de JavaBean (ptés en privé + 1ctor vide + getter/setter)
 * Elle va être déclarée comme un bean spring (composant) dans
 * le conteneur IoC de Spring
 * @author IN-MP-040
 *
 */

public class Adresse {
	
	/*_____________________ PROPRIETES _________________________*/

	private String rue;
	private String codePostal;
	private String ville;
	
	/*_____________________ CONSTRUCTEUR VIDE _________________________*/
	
	
	public Adresse() {
		super();
	}
	
	/*_____________________ G/S _________________________*/
	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse : [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	

	

}// fin classe
