package dao;

import Modele.Personne;

public interface IPersonneDao {
	
	public void ajouterPersonne(Personne p);
	
	public Personne afficherPersonne(Personne p);

}
