package fr.formation.inti.dao;

import java.io.Serializable;
import java.util.List;

public interface IDaoGeneric <T, PK extends Serializable> {
	PK create(T t);
	void update(T t);
	void delete(T t);
	T getById(T t);
	List<T> getAll();
	
}
