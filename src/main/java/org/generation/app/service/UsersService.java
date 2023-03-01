package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Users;
import org.generation.app.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {

	@Autowired
	IUsersRepository userRepository;
	
	@Override
	public Users getUserById(long idUser) {
		return userRepository.findById(idUser);

	}


	@Override
	public List<Users> getAllUsers() {
		List<Users> allUsers = (List<Users>)userRepository.findAll();
		return allUsers;
	}

}
