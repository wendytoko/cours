package com.intiformation.resahotel.service;

import java.util.List;

import com.intiformation.resahotel.dao.TypeChambreDaoImpl;
import com.intiformation.resahotel.model.TypeChambre;

/**
 * 
 * @author INTIFORMATION
 *
 */
public class TypeChambreServiceImpl implements IReservableService<TypeChambre> {

	// déclaration de la dao
	private TypeChambreDaoImpl typeChambreDao;

	/**
	 * ctor vide pour initialiser la dao
	 */
	public TypeChambreServiceImpl() {
		typeChambreDao = new TypeChambreDaoImpl();
	}

	@Override
	public List<TypeChambre> findAll() {
		return typeChambreDao.getAll();
	}

	@Override
	public TypeChambre findById(int idTypeChambre) {
		return typeChambreDao.getById(idTypeChambre);
	}

	@Override
	public boolean ajouter(TypeChambre pTypeChambre) {
		return typeChambreDao.add(pTypeChambre);
	}

	@Override
	public boolean modifier(TypeChambre pTypeChambre) {
		return typeChambreDao.update(pTypeChambre);
	}

	@Override
	public boolean supprimer(int idTypeChambre) {
		return typeChambreDao.delete(idTypeChambre);
	}

}
