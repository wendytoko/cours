package couchedao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modele.Product;
import modele.ProduitManagedBean;
import service.Service;

public class CoucheDao implements IDao<Product> {

	public CoucheDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Product produit) {
		PreparedStatement ps = null;

		try {
			String addReq = "INSERT INTO produit (code,nom,date,prix) VALUES (?,?,?,?)";

			ps = this.connection.prepareStatement(addReq);
			
			ps.setString(1, produit.getCodeProduit());
			ps.setString(2, produit.getNomProduit());
			ps.setString(3, produit.getDateFabrication());
			ps.setFloat(4, produit.getPrix());
			
			int verifAdd = ps.executeUpdate();
			
			return verifAdd==0 ? false : true;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List <Product> getAll() {
		List<Product> produits=new ArrayList<>();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String afficherReq = "SELECT * FROM produit";
		
		try {
			ps=this.connection.prepareStatement(afficherReq);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = ps.executeQuery();
			while(rs.next()) {
				
				Product p=new Product();
				p.setCodeProduit(rs.getString(1));
				p.setNomProduit(rs.getString(2));
				p.setDateFabrication(rs.getString(3));
				p.setPrix((Float)rs.getFloat(4));
				
				
				
				
				produits.add(p);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return produits;
	}

			
			
			
		} 
	

