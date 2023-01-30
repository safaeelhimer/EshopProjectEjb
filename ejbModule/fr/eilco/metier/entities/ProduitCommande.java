package fr.eilco.metier.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="boutique", name="ProduitCommande")

public class ProduitCommande implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="commande_client_id")
	private int commande_client_id;
	
	@Column(name="produit_id")
	private int produit_id ;
	
	@Column(name="quantite")
	private int quantite;

	public int getCommande_client_id() {
		return commande_client_id;
	}

	public void setCommande_client_id(int commande_client_id) {
		this.commande_client_id = commande_client_id;
	}

	public int getProduit_id() {
		return produit_id;
	}

	public void setProduit_id(int produit_id) {
		this.produit_id = produit_id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
	
	
}