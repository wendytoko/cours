package com.intiformation.resahotel.modele;

public class TypesChambres {
	
	/*____________champs__________*/
	public int id_type_chambres;
	public int nombre_lit;
	public String type_lit;
	public String description;

	/*____________ctors__________*/
	public TypesChambres() {
		
	}
	
	public TypesChambres(int id_type_chambres, int nombre_lit, String type_lit, String description) {
		super();
		this.id_type_chambres = id_type_chambres;
		this.nombre_lit = nombre_lit;
		this.type_lit = type_lit;
		this.description = description;
		
	}
	/*____________getter/setters__________*/
	
	public int getId_type_chambres() {
		return id_type_chambres;
	}

	public void setId_type_chambres(int id_type_chambres) {
		this.id_type_chambres = id_type_chambres;
	}

	public int getNombre_lit() {
		return nombre_lit;
	}

	public void setNombre_lit(int nombre_lit) {
		this.nombre_lit = nombre_lit;
	}

	public String getType_lit() {
		return type_lit;
	}

	public void setType_lit(String type_lit) {
		this.type_lit = type_lit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// redefinition de la méthode toString() de la classe Object
		@Override
		public String toString() {
			
			return "id = " + id_type_chambres + " - nombre de lits = " + nombre_lit + " - types de lits = " + type_lit + " - description = " + description;//on affiche de ce que l'on veut de la classe Hotel
		}// sysout par défaut va dans la classe Object donc faut redefinir la méthode dans la classe Hotel 
		

	
}
