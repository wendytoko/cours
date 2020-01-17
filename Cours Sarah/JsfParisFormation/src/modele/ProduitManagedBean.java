package modele;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;



import service.Service;

public class ProduitManagedBean {

	String code;
	String nom;
	String date;
	float prix;
	List<ProduitManagedBean> produits = new ArrayList<>();
	private Service service=new Service();

	public ProduitManagedBean() {
		
	}

	public void ajouter() {
		FacesContext fcontent = FacesContext.getCurrentInstance();
		fcontent.addMessage(null, new FacesMessage("Produit ajouté : " + nom + " à " + prix));

		System.out.println("nom produit : " + this.getNom() + " prix du produit : " + this.getPrix()
				+ " date de fabrication : " + this.getDate() + "code du produit : " + this.getCode());

		Service produitManager = new Service();

		Product produit = new Product(code, nom,prix, date );
		System.out.println("Ajout d'un nouveau produit :");
		if (produitManager.ajouter(produit)) {
			System.out.println("\t INFO : le produit à été ajouté avec succès");
		} else {
			System.out.println("\t INFO : l'ajout du produit a échoué ");

		}
		System.out.println(this.getProduits());
		

	}// fin méthode ajouter
	
	public void redirectToadd() throws IOException {
		FacesContext fcontex = FacesContext.getCurrentInstance();
		ExternalContext externcontext = fcontex.getExternalContext();
		externcontext.redirect(externcontext.getRequestContextPath()+ "/addProduct.xhtml");
	}

	

	public ProduitManagedBean(String code, String nom, String date, float prix) {
		super();
		this.code = code;
		this.nom = nom;
		this.date = date;
		this.prix = prix;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	public List<Product> getProduits() {
		for(Product p: service.afficher()) {
			
			System.out.println(p.getNomProduit());
		}
		return service.afficher();
	}

	public void setProduits(List<ProduitManagedBean> produits) {
		this.produits = produits;
	}

}
