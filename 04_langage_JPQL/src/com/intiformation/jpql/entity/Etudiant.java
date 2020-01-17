package com.intiformation.jpql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name="student")
@Table(name="students")
//@NamedQuery(name="Etudiant.findAll",query="SELECT stud FROM student stud")
@NamedQueries({
	@NamedQuery(name="Etudiant.findAll",query="SELECT stud FROM student stud"),
	@NamedQuery(name="Etudiant.findById", query="SELECT stud FROM student stud WHERE stud.idEtudiant = :pEtudiantID"),
	
})
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_student")
	private int idEtudiant;
	
	@Column(name="name")
	private String nom;
	@Column(name="mail")
	private String mail;
	@Column(name="password")
	private String mdp;
	
	public Etudiant() {
		super();
	}

	public Etudiant(int idEtudiant, String nom, String mail, String mdp) {
		super();
		this.idEtudiant = idEtudiant;
		this.nom = nom;
		this.mail = mail;
		this.mdp = mdp;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", mail=" + mail + ", mdp=" + mdp + "]";
	}
	
	
	

}
