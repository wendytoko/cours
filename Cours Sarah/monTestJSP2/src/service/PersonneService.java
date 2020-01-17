package service;

import Modele.Personne;
import dao.PersonneDao;

public class PersonneService implements IPersonneService {

	private PersonneDao dao;
	
	public PersonneService() {
		dao=new PersonneDao();
	}
	
	@Override
	public void ajouterPersonne(Personne p) {
		dao.ajouterPersonne(p);
		
	}

	@Override
	public Personne afficherPersonne(Personne p) {
		
		return dao.afficherPersonne(p);
	}

}
