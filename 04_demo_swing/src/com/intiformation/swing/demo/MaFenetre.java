package com.intiformation.swing.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaFenetre extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		
		//recup du label des boutons
		

		String labelBouton = ((JButton)event.getSource()).getText();
		
		//System.out.println("bouton cliqu�");
		
		if("click me".equals(labelBouton)) {
			System.out.println("bouton1 click me cliqu�");
		}else if("push me".equals(labelBouton)) {
			System.out.println("bouton2 push me cliqu�");
		}
		
	} //on vient de cr�er une fenetre swing + impl�menter �couteur{

//ActionEvent = �couteur qui chope evenement qui se d�clenche, on doit l'associer
	

	
}
