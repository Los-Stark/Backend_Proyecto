package org.generation.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAdministrator;
	@OneToOne
	@JoinColumn(name="fk_id_users")
	private Users fkIdUsers;
	public long getIdAdministrator() {
		return idAdministrator;
	}
	public void setIdAdministrator(long idAdministrator) {
		this.idAdministrator = idAdministrator;
	}
	public Users getFkIdUsers() {
		return fkIdUsers;
	}
	public void setFkIdUsers(Users fkIdUsers) {
		this.fkIdUsers = fkIdUsers;
	}
	
	
	
}
