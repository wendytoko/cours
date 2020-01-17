package com.intiformation.structure.de.decision;

public class AppTestSwitch {
	
	public static void main(String[] args) {
		


	/**
	 * 
	 * switch : 
	 * > meilleure lisiblité du code, 
	 * > fonctionnement équivalent du if-else
	 * 
	 */
	
	int month = 0;
	
	String monthName;
	
	switch (month){
	
	case 1 : monthName = "Janvier";
	break; // permet de sortir du  switch
	
	case 2:
		monthName = "Avril";
		break;
		
	case 3 :
	monthName = "Décembre";
	break;
	
	}// fin main
	
	}// fin switch

}// fin classe
