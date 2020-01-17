package modele;

public class Product {
	private String codeProduit;
	private String nomProduit;
	private float prix;
	private String dateFabrication;
	public Product() {
	
	}
	
	public Product(String codeProduit, String nomProduit, float prix, String dateFabrication) {
		super();
		this.codeProduit = codeProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.dateFabrication = dateFabrication;
	}

	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(String dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

}
