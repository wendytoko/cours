package com.intiformation.heritage.uneSeuleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @DiscriminatorColumn : Amélioration de la colonne discriminante
 * @author IN-MP-040
 *
 */

@Entity
@DiscriminatorColumn(name="TYPE_PERSONNE", discriminatorType=DiscriminatorType.INTEGER)
public class Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersonne;
	private String nom;
	
	public Personne() {
		super();
	}
	
	

	public Personne(int idPersonne, String nom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
	
	}



	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + "]";
	}
	
	

}// fin main
