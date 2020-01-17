package serviceDao;

import java.util.List;

import modeleDao.Personne;

public class ServiceDao implements IServiceDao<Personne>{

	@Override
	public List<Personne> findAll() {
		
		return null;
	}

	@Override
	public Personne findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ajouter(Personne t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifier(Personne t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
