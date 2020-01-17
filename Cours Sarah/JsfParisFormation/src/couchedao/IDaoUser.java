package couchedao;

import modele.User;

public interface IDaoUser {
	
	public boolean inscription(User user);
	public User getUserByLogin(String login);

}
