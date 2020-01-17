package coucheDao.copy;

import java.sql.Connection;
import java.util.List;

import connexion.Connexion;

public interface IDao <T> {
	

		// recup de la connexion a la bdd
		public Connection connection = Connexion.getConnection();

		// d�finition des m�thodes � exposer dans la dao

		public List<T> getAll();

		public T getById(int id);

		public boolean add(T t);

		public boolean update(T t);

		public boolean delete(int id);

}
