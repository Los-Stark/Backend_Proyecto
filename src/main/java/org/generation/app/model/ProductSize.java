package org.generation.app.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Talla")
public class ProductSize {

	public static final int FIELD_MAX_LENGTH= 20;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTalla;
	@Column(name = "Talla", nullable = false,length=FIELD_MAX_LENGTH)
	private String talla;
	/*@ManyToOne
	@JoinColumn(name="fk_id_products")
	private Products fkIdProducts;*/
	
	
	/*public Products getFkIdProducts() {
		return fkIdProducts;
	}
	public void setFkIdProducts(Products fkIdProducts) {
		this.fkIdProducts = fkIdProducts;
	}*/
	
	
	public long getIdTalla() {
		return idTalla;
	}
	public void setIdTalla(long idTalla) {
		this.idTalla = idTalla;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
}
