package com.intiformation.modele.generique;
/**
 * def de la classe comme g�n�rique 
 * classe g�n�rique de type T. T = param�tre de type objet obligatoirement
 * ca veut dire que c'est une classe et non un type primitif (int, double ...)
 * peut �tre de n'importe quel type
 * @author IN-MP-040
 *
 */

public class BoiteGenerique1<T> {
	
// champs
	public T element;
	
	// ctor vide
	
	public BoiteGenerique1() {
		
	}// fin ctor vide
	
	// ctor charg�
	public BoiteGenerique1(T element) {
		this.element = element;
		
	}// fin ctor charg�

// getter/setter
	

/**
	 * @return the element
	 */
	public T getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}

}//end classe
// ctor


