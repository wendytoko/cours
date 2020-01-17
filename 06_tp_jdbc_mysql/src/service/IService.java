package service;

import java.util.List;

public interface IService <T> {
	
	public boolean ajouter(T t);
	public boolean supprimer(int id);
	public boolean modifier(T t);
	List<T> getAll();
	T getById(int id);
	

}
