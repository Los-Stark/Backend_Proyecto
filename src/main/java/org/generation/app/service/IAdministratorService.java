package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Administrator;

public interface IAdministratorService {

	Administrator getAdministratorById(long idAdministrator);
	
	Administrator setUserAdministrator(Administrator user);
	
	Administrator updateUserAdministrator(Administrator administrator);
	
	public List<Administrator> getAllAdministrators();
	
	
}
