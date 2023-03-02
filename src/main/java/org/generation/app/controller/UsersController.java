package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.Users;
import org.generation.app.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UsersController {
	//prueba de commit
	@Autowired
	IUsersService usersService;
	
	@GetMapping("{id}")
	public Users getUsersById(@PathVariable("id") long idUser) {
		return usersService.getUserById(idUser);
		
	}
	
	@GetMapping
	public List<Users> getAllUsers(){
		return usersService.getAllUsers();
		
	}

}
