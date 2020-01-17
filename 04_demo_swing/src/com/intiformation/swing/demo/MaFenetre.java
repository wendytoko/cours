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
		
		//System.out.println("bouton cliqué");
		
		if("click me".equals(labelBouton)) {
			System.out.println("bouton1 click me cliqué");
		}else if("push me".equals(labelBouton)) {
			System.out.println("bouton2 push me cliqué");
		}
		
	} //on vient de créer une fenetre swing + implémenter écouteur{

//ActionEvent = écouteur qui chope evenement qui se déclenche, on doit l'associer
	

	
}
