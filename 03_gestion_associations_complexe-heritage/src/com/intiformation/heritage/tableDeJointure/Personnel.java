package com.intiformation.heritage.tableDeJointure;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)// pour dire que l'on va utiliser la strategie table de jointure
@DiscriminatorColumn(name="TYPE_PERSONNEL", 
discriminatorType=DiscriminatorType.STRING)// pour ameliorer la colonne discriminante
public class Personnel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersonne;
	private String nom;
	
	public Personnel() {
		super();
	}
	
	

	public Personnel(String nom) {
		super();
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
		return "Personnel [idPersonne=" + idPersonne + ", nom=" + nom + "]";
	}

}
