package com.intiformation.springioc.autowiring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Formateur {

	private String nom;
	private String domaine;

	// association avec le Module
	@Autowired // injection par type
	@Qualifier("moduleBean1") // injecte moi le bean 'moduleBean1' dasn la prop 'module'
	private Module module;

	/**
	 * ctor vide 
	 */
	public Formateur() {
	}

	/**
	 * ctor chargé 
	 */
	public Formateur(String nom, String domaine, Module module) {
		this.nom = nom;
		this.domaine = domaine;
		this.module = module;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public Module getModule() {
		return module;
	}
	
	
	public void setModule(Module module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "Formateur [nom=" + nom + ", domaine=" + domaine + ", module=" + module + "]";
	}

}
