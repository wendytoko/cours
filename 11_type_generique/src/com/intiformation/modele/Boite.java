package com.intiformation.modele;
/**
 * permet de stocker des éléments en chaine de caractères sous forme de String
 * 
 * transformation en Object => comptatible avec tout type de donnée
 * @author IN-MP-040
 *
 */

public class Boite {
	
	// champs
	private Object element;
// ctors
	
	public Boite() {
		super ();
	}
public Boite(Object element) {
	super();
	this.element = element;
}
//getter/setter

/**
 * @return the element
 */
public Object getElement() {
	return element;
}
/**
 * @param element the element to set
 */
public void setElement(Object element) {
	this.element = element;
}
	

}// fin classe
