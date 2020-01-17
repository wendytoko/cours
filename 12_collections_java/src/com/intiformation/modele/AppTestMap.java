package com.intiformation.modele;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class AppTestMap {
	
	
	public static void main(String[] args) {
		/** Map :
		 * 
		 * > structure de donn�es qui permet de retrouver rapidement
		 * un �l�ment
		 * > une map enregistre toujours des paires cl�/valeur
		 * > la valeur peut �tre retrouv�e gr�ce � la cl�
		 */
		/**
		 * Vue d'une Map :
		 * 
		 * > on a 3 vues dans une map :
		 * 1. ensemble de cl�s => forme un Set car les cl�s sont uniques
		 * 2. ensemble des valeurs
		 * 3. ensemble des paires cl�s/valeurs => forme un Set �galement
		 * 
		 * > les m�thodes suivantes de l'interface Map permettent d'afficher les 3 vues :
		 * 1. keySet() => renvoie une vue de toutes les cl�s, elle va retourner un ensemble Set<E>
		 * 2. Collection <K> values() => renvoie une vue de toutes les valeurs de la map
		 * 3. Set<Entry<K,V>> entrySet () : renvoir une vue des objets Entry<K,V> contenant 
		 * les paires cl�s/valeurs
		 */
		
		//1. cr�ation d'une map de type HashMap
		
		HashMap<Integer, String> carteMois = new HashMap<>();
		
		//2. ajout � la map avec la m�thode put () de la classe HashMap
		
		carteMois.put(1, "Janvier");
		carteMois.put(2, "F�vrier");
		carteMois.put(3, "Mars");
		carteMois.put(4, "Avril");
		
		//3. parcours de la map
		
		//3.1 parcours de l'ensemble des cl�s 
		
		Set<Integer> vuesCles = carteMois.keySet();
		System.out.println("Vue de l'ensemble des cl�s :");
		
		for(int cle:vuesCles) {
			
			//recup valeur de la cl� avec la m�thode get(cl�)
			
		String valeur = carteMois.get(cle);
		System.out.println("[" + cle + " - " + valeur + "]");
				
			}
			
		//3.2 parcours de l'ensemble des valeurs avec la m�thpde values ()
		
		System.out.println("Vue de l'ensemble des valeurs :");
		
		Collection<String> vueValeurs = carteMois.values ();
		
		for(String value:vueValeurs) {
			
		}// fin each
		
		//3.3 parcours de l'ensemble des paires cl�/valeur avec la m�thode 
		System.out.println("Vue de l'ensemble des paires cl�/valeurs :");
		
		Set<java.util.Map.Entry<Integer,String>> vueCleValeur = carteMois.entrySet();
		
		for (java.util.Map.Entry<Integer, String> cleValeur : vueCleValeur);
		
		// recup de la cl�
		
		java.util.Map.Entry<Integer, String> cleValeur;
		int cle = cleValeur.getKey();
		
		//recup de la valeur
		
		cleValeur.getValue ();
		
System.out.println();
		
			
		}// fin main
	
		

		

	


		
	}// fin classe




