package com.intiformation.modele;

import com.intiformation.interfaces.IGraphique;
import com.intiformation.interfaces.IInteractif;

/**
 * la classe h�rire de Entite
 * la classe Balle impl�mtente l'interface IInteractif
 * @author IN-MP-040
 *
 */

public class Balle extends Entite implements IInteractif,IGraphique {

	@Override
	public void evoluer() {
		// TODO Auto-generated method stub
		
		/** redefinition des m�thodes des interfaces
		 * 
		 */
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		
	}// fin methode de l'interface IGraphique

	@Override
	public void gererClick() {
		// TODO Auto-generated method stub
		
	} //fin methode de l'interface IInteractif

}// fin classe
