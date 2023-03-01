package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Products;
import org.generation.app.model.Users;

public interface IUsersService {

	public Users getUserById(long idUser);
	public List<Users> getAllUsers();
	
}
