package com.intiformation.swing.demo;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lanceur {

	public static void main(String[] args) {
		/*----------------------------------
		 *             configuration de base
		 * ---------------------------------------------*/
		
		//instanciation de la fen�tre de swing
		
		MaFenetre fen = new MaFenetre();
		
		//rendre visible la fenetre
		fen.setVisible(true);
		
		//donner un titre � la fenetre
		fen.setTitle("Ma premi�re app en swing");
		
		//taille de la fenetre 600px sur 300px
		fen.setSize(600, 300);
		
		// fermer la fenetre vraiment en appuyant sur la bouton de l'app
		
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// changer l'emplacement par d�faut de l'app (100 px par rapport � la gauche et idem en haut de l'�cran)
		
		fen.setLocation(100, 100);
		
		// au lieu de s'emmerder pour trouver l'endroit id�al il y cette m�thode suivante :
		fen.setLocationRelativeTo(null);// on met null car �cran pas natif de swing, il va mettre l'app au milieu de l'�cran
		
		/*-----------------------------------------------
		 *             composants graphiques
		 * ---------------------------------------------*/
		
		// qui dit composants dit classes !
		
		// pour ajouter un composant, on r�cupere la content pane, une classe de la JFrame, le container de composants
		
		Container container =  fen.getContentPane();
		
		// definition d'un layout : FlowLayout
		//c'est une classe
		FlowLayout flowlayout = new FlowLayout();
		// on pouvoir positionner les composants
		
		//ajout des layouts au container
		
		container.setLayout(flowlayout);
		
		
		//d�finition des composants
		
		// cr�ation d'un bouton
		JButton bouton1 = new JButton("click me");
		JButton bouton2 = new JButton("push me");
		
		//ajout du bouton dans le container
		container.add(bouton1);
		container.add(bouton2);
		//par d�faut quand on ajoute deux boutons, le dernier boutonn cr�e va se poser sur l'ancien bouton, pour �a il ya une solution:
		// les Layout
		
		
		/*-----------------------------------------------
		 *             Gestion des �venements
		 * ---------------------------------------------*/
		
		//association de l'�couteur impl�ment� dans la fen�tre du bouton1
		
		bouton1.addActionListener(new MaFenetre());
		
		// association dans la classe MaFenetre : bouton1.addActionListener(this);
		
		//association de l'�couteur impl�ment� dans la fen�tre du bouton2
		
				bouton2.addActionListener(new MaFenetre());
		
	}// fin main
}// fin classe
