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
@Table(schema="boutique", name="CommandeClient")
public class CommandeClient implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="montant")
	private double montant;
	
	@Column(name="date_creation")
	private Date date_creation;
	
	@Column(name="no_confirmation")
	private int no_confirmation;
	
	@Column(name="client_id")
	private int client_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public int getNo_confirmation() {
		return no_confirmation;
	}

	public void setNo_confirmation(int no_confirmation) {
		this.no_confirmation = no_confirmation;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	
	
	
	
}