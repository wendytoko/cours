package com.intiformation.resahotel.model;

public class TypeChambre {

	/* _________________ champs ___________________ */

	private int idTypeChambre;
	private String nombreLit;
	private String typeLit;
	private String description;

	/* _________________ ctors ___________________ */

	public TypeChambre() {
	}

	public TypeChambre(int idTypeChambre, String nombreLit, String typeLit, String description) {
		this.idTypeChambre = idTypeChambre;
		this.nombreLit = nombreLit;
		this.typeLit = typeLit;
		this.description = description;
	}

	public TypeChambre(String nombreLit, String typeLit, String description) {
		this.nombreLit = nombreLit;
		this.typeLit = typeLit;
		this.description = description;
	}

	/* _________________ getters/setters ___________________ */

	public int getIdTypeChambre() {
		return idTypeChambre;
	}

	public void setIdTypeChambre(int idTypeChambre) {
		this.idTypeChambre = idTypeChambre;
	}

	public String getNombreLit() {
		return nombreLit;
	}

	public void setNombreLit(String nombreLit) {
		this.nombreLit = nombreLit;
	}

	public String getTypeLit() {
		return typeLit;
	}

	public void setTypeLit(String typeLit) {
		this.typeLit = typeLit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TypeChambre [idTypeChambre=" + idTypeChambre + ", nombreLit=" + nombreLit + ", typeLit=" + typeLit
				+ ", description=" + description + "]";
	}
	
	
}
