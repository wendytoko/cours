package modele;

import service.ServiceUser;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UserManagedBean {
	
	
	private User usermodel;
	private ServiceUser service;
	
	
	
	public UserManagedBean() {
		setUsermodel(new User());
		setService(new ServiceUser());
	}



	public User getUsermodel() {
		return usermodel;
	}



	public void setUsermodel(User usermodel) {
		this.usermodel = usermodel;
	}



	public ServiceUser getService() {
		return service;
	}



	public void setService(ServiceUser service) {
		this.service = service;
	}
	
	
	public void inscrire() {
		User u=service.getUserByLogin(usermodel.getLogin());
		if(u==null) {
		service.inscription(usermodel);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Succès inscription", "Vous êtes inscrit !"));
		}else {
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,
					"Erreur inscription", "Vous êtes déjà inscrit !"));
			
		}
	}
	
	public void login () {
		User user = service.getUserByLogin(usermodel.getLogin());
	}

}
