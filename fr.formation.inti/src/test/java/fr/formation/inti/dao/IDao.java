package fr.formation.inti.dao;

import java.util.List;

public interface IDao <T>{
	
	Integer create(T t);
	void update(T t);
	void delete(T t);
	T getById(T t);
	List<T> getAll();
	

}// fin interface
