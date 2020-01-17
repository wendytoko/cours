package serviceDao;

import java.util.List;

public interface IServiceDao <T>  {
	

	public List<T> findAll();

	public T findById(int id);

	public boolean ajouter(T t);

	public boolean modifier(T t);

	public boolean supprimer(int id);
}
