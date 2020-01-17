package com.intiformation.heritage.uneTableParClasse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmploye;
	private String nom;
	
	public Employe() {
		super();
	}
	
	

	public Employe(String nom) {
		super();
		this.nom = nom;
	
	}



	
	
	public int getIdEmploye() {
		return idEmploye;
	}



	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	@Override
	public String toString() {
		return "Personnel [idEmploye=" + idEmploye + ", nom=" + nom + "]";
	}

}
