package org.generation.app.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
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
@Table(name = "tallas")
public class ProductSize {

	public static final int FIELD_MAX_LENGTH= 20;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTalla;
	@Column(name = "Talla", nullable = false,length=FIELD_MAX_LENGTH)
	private String talla;
	@ManyToMany(cascade = CascadeType.REFRESH)
	private Set<Products> assignProducts = new HashSet<>();
	
	
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
