package com.intiformation.introjpa.entity.optimisationMapping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Enseignants_de_Saint_Pierre") // permet de changer le nom de la table associ�e  � l'entit�
public class Enseignant {
	
	/*_____________________Pt�s________________*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // g�n�ration de la PK et IDENTITY correspond � l'auto increment
	@Column(name="id_enseignant")// nom de la colonne dans la bdd
	private int idEnseignant;

	@Column(name="username")
	private String identifiant;
	
	@Column(name="password")
	private String motDePasse;
	
	/*_____________________Pt�s temporelles avec ajout obligatoire de @Temporal________________*/
	@Column(name="date_de_naissance")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDeNaissance;
	
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	/**
	 * Pour exclure une pt� du mapping il y a @Translent
	 */
	
	

	
	public Enseignant () {
		
	}


	public int getIdEnseignant() {
		return idEnseignant;
	}


	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	
}
