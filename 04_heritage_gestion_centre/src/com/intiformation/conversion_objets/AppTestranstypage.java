package com.intiformation.conversion_objets;

public class AppTestranstypage {

	public static void main(String[] args) {
		//1. declaration de variables
		Object obj;
		Employe empl;
		Directeur dir;
		Ingenieur ing;
		
		//2. création de l'objet ingénieur + conversion
	//2.1. creation
		ing = new Ingenieur();
		//2.2 conversion ingenieur en Object
		obj = ing; // conversion ingenieur -> Object : ça marche
		empl = ing; // conversion ingenieur -> employe : ça marche
		dir = ing; // conversion directeur -> ingenieur est censé ne pas marcher 
		// car s'il  n'y a pas d'héritage il peut pas : typage haut
		
		//3. creation de l'objeet Employe + conversion
		empl = new Employe();
		obj = empl;// marche
		dir = empl; // marche
		ing = empl; // marche
		
		
		
	}//fin main
	
	//appel de la méthode convertirType ()
	convertirType(obj);
	convertirType(empl);
	convertirType(dir);
	convertirType(ing);
	/** 
	 * permet de convertir des objets <br/>
	 * @param <Directeur>
	 * @param <Ingenieur>
	 * @param <Employe>
	 * */
@SuppressWarnings("unchecked")
public static <Directeur, Ingenieur, Employe> void convertirType(Object pObject) {
	
	Object object;
	Employe employe;
	Directeur directeur;
	Ingenieur ingenieur;
	
	//conversion
	object = pObject;
	employe = (Employe) pObject; // on cast en Employe
	directeur = (Directeur) pObject; // on cast en Directeur
	ingenieur = (Ingenieur) pObject;// on cast en Ingenieur
	
}// fin convertirType
	 
	
} //fin classe
