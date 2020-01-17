package presentation;

import modele.Client;
import service.Service;

public class AppTestClient {
	
	
	public static void main(String[] args) {
		
		
		/*-----------------------------------------*/
		/*---------Ajout d'un client---------------*/
		/*-----------------------------------------*/
		
		Service service = new Service();
		
		Client clientAdd = new Client(11,"Mezine","Younes","rue des vacances",75000,"Paris",662312254);
		
		if(service.ajouter(clientAdd)) {
			System.out.println("Infos concernant l'ajout d'un nouveau client : ");
			System.out.println("Le client a été rajouté avec succès.");
		}else {
			System.out.println("Le client n'a pas pu être rajouté.");
		}
		
		/*-----------------------------------------------*/
		/*---------Suppression d'un client---------------*/
		/*-----------------------------------------------*/
		
		
		//if(service.supprimer(3)) {
			//System.out.println("Infos concernant la suppression du client n°3 : ");
			//System.out.println("Le client a été supprimé avec succès.");
		//}else {
			//System.out.println("Le client n'a pas pu être supprimé.");
		//}
		
		
		
		
	}//fin main

	

}// fin classe
