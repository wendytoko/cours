package com.intiformation.association.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ModuleFormation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSession;
	private String libelle;
	
	
    /*===================================*/
	/*=========Association===============*/
	/*===================================*/
	
	// Many modules to One session
	/**
	 * coté * => porteur de la FK => utilisation de @JoinColumn
	 */
	@ManyToOne
	@JoinColumn(name="SESSION_ID", referencedColumnName="idSession")
	private SessionFormation sessionFormation;
	
	
	public SessionFormation getSessionFormation() {
		return sessionFormation;
	}
	public void setSessionFormation(SessionFormation sessionFormation) {
		this.sessionFormation = sessionFormation;
	}
	public ModuleFormation() {
		super();
	}
	public ModuleFormation(int idSession, String libelle) {
		super();
		this.idSession = idSession;
		this.libelle = libelle;
	}
	public int getIdSession() {
		return idSession;
	}
	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "ModuleFormation [idSession=" + idSession + ", libelle=" + libelle + "]";
	}
	
	

}
