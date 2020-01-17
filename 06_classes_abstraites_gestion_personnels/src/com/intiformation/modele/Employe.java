package com.intiformation.modele;
/** classe fille derivée de Personnel
 * 
 * @author IN-MP-040
 *
 */
public class Employe extends Personnel {

	public Employe(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String decrirePersonnel() {
		// TODO Auto-generated method stub
		return "un employé avec un salaire de 30000 euros"; 
		// redefinition de la methode abstraite decrirePersonnel()//
	}

	@Override
	public double calculerSalaireBrut() {
		// TODO Auto-generated method stub
		return 350000; //redefinition//
	}

	@Override
	public double calculerMoisTravailles() {
		// TODO Auto-generated method stub
		return 6; //redefinition//
	}
	

	
}//fin classe
