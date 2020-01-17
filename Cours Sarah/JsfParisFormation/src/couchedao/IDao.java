package couchedao;

import java.sql.Connection;
import java.util.List;

import utilitaire.MyConnection;

public interface IDao <T>{
	public Connection connection = MyConnection.getConnection();
	

	public boolean add(T t);
	public List<T> getAll();


}
