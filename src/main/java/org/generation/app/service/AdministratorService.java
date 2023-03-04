package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Administrator;
import org.generation.app.repository.IAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdministratorService implements IAdministratorService {

	@Autowired
	IAdministratorRepository administratorRepository;

	@Override
	public Administrator getAdministratorById(long idAdministrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrator setUserAdministrator(Administrator user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrator updateUserAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrator> getAllAdministrators() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
}
