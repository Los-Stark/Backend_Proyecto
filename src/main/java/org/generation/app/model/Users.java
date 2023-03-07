package org.generation.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Users {
	
	public static final int FIELD_MAX_LENGTH= 100;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	@Column(name = "nombre_completo",nullable = false,length=FIELD_MAX_LENGTH)
	private String name;
	@Column(name = "nombres_de_usuarios",nullable = false,length=FIELD_MAX_LENGTH)
	private String userName;
	@Column(name = "telefono",length=FIELD_MAX_LENGTH)
	private String phone;
	@Column(name = "email",nullable = false, updatable=false, unique = true, length= FIELD_MAX_LENGTH)
	private String email;
	@Column(name = "contrasenia",length=FIELD_MAX_LENGTH)
	private String password;
	
	
	public long getIdUsuario() {
		return idUser;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUser = idUsuario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
