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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	public static final int FIELD_MAX_LENGTH= 150;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProducts;
	@Column(name = "nombre", nullable = false,length=FIELD_MAX_LENGTH)
	private String name;
	@Column(name = "precio")
	private int price;
	@Column(name = "categoria")
	private int category;
	@Column(name = "enlaceimagen")
	private String imageURL;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	@JoinTable(name = "producto_talla", joinColumns = @JoinColumn(name = "id_product"), 
	inverseJoinColumns = @JoinColumn(name = "id_product_size") )
    private Set<ProductSize> assignProductSizes = new HashSet<>();
	
	
	//setter and getter de ManytoMany
	
	public long getIdProducts() {
		return idProducts;
	}
	public Set<ProductSize> getAssignProductSizes() {
		return assignProductSizes;
	}
	
	public void setAssignProductSizes(Set<ProductSize> assignProductSizes) {
		this.assignProductSizes = assignProductSizes;
	}
	public void setIdProducts(long idProducts) {
		this.idProducts = idProducts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	

}
