package fr.eilco.metier.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="boutique", name="Produit")

public class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="description")
	private String description;
	
	@Column(name="dernier_maj")
	private Date dernier_maj;
	
	@Column(name="categorie_id")
	private int categorie_id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDernier_maj() {
		return dernier_maj;
	}

	public void setDernier_maj(Date dernier_maj) {
		this.dernier_maj = dernier_maj;
	}

	public int getCategorie_id() {
		return categorie_id;
	}

	public void setCategorie_id(int categorie_id) {
		this.categorie_id = categorie_id;
	}
	

}