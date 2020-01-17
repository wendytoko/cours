package com.intiformation.association.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class SessionFormation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSession;
	private String libelle;
	
	
    /*===================================*/
	/*=========Association===============*/
	/*===================================*/
	// Config par defaut
	/**
	/**
	 * @JoinTable : amélioration de la table de jointure
	 */
	/**
	@OneToMany(targetEntity=ModuleFormation.class, cascade=CascadeType.ALL)
	@JoinTable(name="sessions_assoc_modules"//nom de la table de jointure
	, joinColumns=@JoinColumn(name="SESSION_ID"),//nom de la FK referençant la session)
	inverseJoinColumns=@JoinColumn(name="MODULE_ID"))//nom de la FK referençant le module)
	private List<ModuleFormation> listeModules;
	
	public List<ModuleFormation> getListeModules() {
		return listeModules;
	}
	
	*/
	
	// respect de la modélisation UML 
	@OneToMany(mappedBy="sessionFormation", cascade=CascadeType.ALL)
	private List<ModuleFormation> listeModules;
	
	
	public void setListeModules(List<ModuleFormation> listeModules) {
		this.listeModules = listeModules;
	}
	public SessionFormation() {
		super();
	}
	public SessionFormation(int idSession, String libelle) {
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
		return "SessionFormation [idSession=" + idSession + ", libelle=" + libelle + "]";
	}
	
	

}
