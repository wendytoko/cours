package service;

import java.util.List;

import couchedao.CoucheDao;
import modele.Product;

public class Service implements IService<Product> {
	private CoucheDao produitDao;

	public Service() {
		produitDao = new CoucheDao();
	}

	@Override
	public boolean ajouter(Product produit) {
		// TODO Auto-generated method stub
		return produitDao.add(produit);
	}

	
	@Override
	public List<Product> afficher() {
		// TODO Auto-generated method stub
		return produitDao.getAll();
	}

}
