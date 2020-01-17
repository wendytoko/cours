package modele;

public class User {
	String login;
	String mdp;

	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public User(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
