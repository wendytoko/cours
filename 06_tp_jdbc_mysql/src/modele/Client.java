package modele;

public class Client {
	
	
	int id_client;
	String nom;
	String prenom;
	String adresse;
	int code_postal;
	String ville;
	int telephone;
	

	

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int id_client, String nom, String prenom, String adresse, int code_postal, String ville, int telephone) {
		// TODO Auto-generated constructor stub
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	

}// fin classe
