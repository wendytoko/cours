package com.intiformation.resahotel.lanceur;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.intiformation.resahotel.modele.Hotel;
import com.mysql.jdbc.Driver;

/**
 * cette classe permet de r�cup�rer la liste des hotels dans la BDD via l'API
 * JDBC
 * 
 * @author IN-MP-040
 *
 */

public class AfficherListeHotels {

	public static void main(String[] args) {

		// 1. chargement du pilote jdbc de MySQL = on cr�e la relation entre JDBC et le pilote//

		/**1 ere m�thode
		 * enregister l'objet pilote dans le DriverManager (gestionnaire de pilote)
		 */
//DrvierManager = annuaire de plusieurs pilotes, va permettre une connexion avec BDD
		try {
			Driver pilote = new Driver();

			DriverManager.registerDriver(pilote);// on enregistre

			/* 2eme m�thode : */
			/**
			 * On enregistre le pilote dans le DriverManager
			 */

			Class.forName("com.mysql.jdbc.Driver");// il enregistre le pilote dans le DriverManager, on fait �a quand on a juste le nom de la classe
			// com.mysql.jdbc.Driver c'est le pilote

			// 2. Recup d'une connexion vers la bdd//

			/**
			 * la recup se fait via le DriverManager
			 */
			String url = "jdbc:mysql://localhost:3306/db_gestion_hotel";
			String user = "root";
			String password = "wendy";

			Connection connexion = DriverManager.getConnection(url, user, password);// on recup la connexion grave � la m�thode getConnection()

			// 3. Ex�cution de requ�tes SQL vers la BDD //
			// 3.1 definition de la requ�te SQL

			String requeteSQL = "SELECT * FROM hotels";//flux vers la BDD entre la connexion et la BDD

			// 3.2 definition de la requete JDBC via statement

			Statement requeteJDBC = connexion.createStatement();// Statement : est une voiture dans le flux qui va emmener la requete SQL vers la BDD
			// on la recup � partir de la connexion

			/*
			 * Statement : objet qui va v�hiculer la requ�tes
			 */
			/// 4. execution de la requete vers la bdd et recup du r�sultat de la requ�te/
			/// 4. execution de la requete vers la bdd et recup du r�sultat de la requ�te

			/**
			 * executeQuery() : � utiliser quand on r�cup�re des don�es de la BDD > SELECT =
			 * EXECUTEQUERY
			 */
			ResultSet resultats = requeteJDBC.executeQuery(requeteSQL);//executeQuery = aller-retour entre la BDD et la connex qui va donner le ResultSet
			// 5. extraction du ResultSet
			// 4.1 initialisation de la t�te de lecture via la m�thode next()//

			Hotel hotel = null;
			List<Hotel> listeHotel = new ArrayList<>();

			while (resultats.next()) {// tant que next() renvoie true, il execute. next() est notre curseur pour lire les donn�es du ResultSet

				// 4.2 recup des donn�es du resultSet via les m�thodes getXXX()

				int hotelID = resultats.getInt(1);// 1 = indice de la colonne
				// int hotelID = resultats.getInt("id_hotel");// id_hotel = nom de la colonne

				String libelleHotel = resultats.getString(2);
				// String libelleHotel = resultats.getString("libelle");

				String etoileHotel = resultats.getString(3);
				// String etoileHotel = resultats.getString("etoile");

				// 4.3 ajout des donn�es dans un objet de type Hotel

				hotel = new Hotel(hotelID, libelleHotel, etoileHotel);

				// 4.4 ajout de l'objet hotel � la liste

				listeHotel.add(hotel);

			} // end while

			// 5. exploitation du r�sultats = affichage

			System.out.println("Liste des Hotels dans la BDD");

			for (Hotel h : listeHotel) {
				System.out.println("\t> " + h);
			} // fin for each

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// fin main

}// fin classe
