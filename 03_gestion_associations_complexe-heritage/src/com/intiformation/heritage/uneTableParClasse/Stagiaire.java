package com.intiformation.heritage.uneTableParClasse;

import javax.persistence.Entity;

@Entity
public class Stagiaire extends Employe {
	
		private String formation;
		private float note;
		
		public Stagiaire() {
			super();
		}
		public Stagiaire(String nom, String formation, float note) {
			super(nom);
			this.formation = formation;
			this.note = note;
		}
		
		
		public String getFormation() {
			return formation;
		}
		public void setFormation(String formation) {
			this.formation = formation;
		}
		public float getNote() {
			return note;
		}
		public void setNote(float note) {
			this.note = note;
		}
		@Override
		public String toString() {
			return "Stagiaire [formation=" + formation + ", note=" + note + "]";
		}

}
