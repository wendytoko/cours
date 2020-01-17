package service;

import couchedao.CoucheDaoUser;
import modele.User;

public class ServiceUser  implements IServiceUser{
	
	CoucheDaoUser couchedao = new CoucheDaoUser();

	public ServiceUser() {
		
	}



	@Override
	public User getUserByLogin(String login) {
		
		return couchedao.getUserByLogin(login);
	}



	@Override
	public boolean inscription(User user) {
		
		return couchedao.inscription(user);
	}






}
