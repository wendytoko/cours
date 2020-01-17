package com.intiformation.modele;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class AppTestMap {
	
	
	public static void main(String[] args) {
		/** Map :
		 * 
		 * > structure de données qui permet de retrouver rapidement
		 * un élément
		 * > une map enregistre toujours des paires clé/valeur
		 * > la valeur peut être retrouvée grâce à la clé
		 */
		/**
		 * Vue d'une Map :
		 * 
		 * > on a 3 vues dans une map :
		 * 1. ensemble de clés => forme un Set car les clés sont uniques
		 * 2. ensemble des valeurs
		 * 3. ensemble des paires clés/valeurs => forme un Set également
		 * 
		 * > les méthodes suivantes de l'interface Map permettent d'afficher les 3 vues :
		 * 1. keySet() => renvoie une vue de toutes les clés, elle va retourner un ensemble Set<E>
		 * 2. Collection <K> values() => renvoie une vue de toutes les valeurs de la map
		 * 3. Set<Entry<K,V>> entrySet () : renvoir une vue des objets Entry<K,V> contenant 
		 * les paires clés/valeurs
		 */
		
		//1. création d'une map de type HashMap
		
		HashMap<Integer, String> carteMois = new HashMap<>();
		
		//2. ajout à la map avec la méthode put () de la classe HashMap
		
		carteMois.put(1, "Janvier");
		carteMois.put(2, "Février");
		carteMois.put(3, "Mars");
		carteMois.put(4, "Avril");
		
		//3. parcours de la map
		
		//3.1 parcours de l'ensemble des clés 
		
		Set<Integer> vuesCles = carteMois.keySet();
		System.out.println("Vue de l'ensemble des clés :");
		
		for(int cle:vuesCles) {
			
			//recup valeur de la clé avec la méthode get(clé)
			
		String valeur = carteMois.get(cle);
		System.out.println("[" + cle + " - " + valeur + "]");
				
			}
			
		//3.2 parcours de l'ensemble des valeurs avec la méthpde values ()
		
		System.out.println("Vue de l'ensemble des valeurs :");
		
		Collection<String> vueValeurs = carteMois.values ();
		
		for(String value:vueValeurs) {
			
		}// fin each
		
		//3.3 parcours de l'ensemble des paires clé/valeur avec la méthode 
		System.out.println("Vue de l'ensemble des paires clé/valeurs :");
		
		Set<java.util.Map.Entry<Integer,String>> vueCleValeur = carteMois.entrySet();
		
		for (java.util.Map.Entry<Integer, String> cleValeur : vueCleValeur);
		
		// recup de la clé
		
		java.util.Map.Entry<Integer, String> cleValeur;
		int cle = cleValeur.getKey();
		
		//recup de la valeur
		
		cleValeur.getValue ();
		
System.out.println();
		
			
		}// fin main
	
		

		

	


		
	}// fin classe




