package presentation;

import modele.User;
import service.ServiceUser;

public class AppTestClient {

	public AppTestClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ServiceUser service = new ServiceUser();

	
		//User p = new User("125", "NATACHA");

		//service.inscription(p);
		
		User user = service.getUserByLogin("lolita");
		System.out.println("Affichage de l'utilisateur correspondant : " + user);
		

		
	}

}
