package service;

import java.util.List;

import couchedao.IDao;

public interface IService <T> {
	
	public boolean ajouter(T t);
	public List<T> afficher();

}
