package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.Users;
import org.generation.app.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsersController {
	
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
	
	@PostMapping //localhost:8080/api/customers
    public ResponseEntity<?> setNewUsers(@RequestBody Users users) {
        try {
            return new ResponseEntity<Users>(
                    usersService.setUser(users), 
                    HttpStatus.CREATED);

        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.BAD_REQUEST );
        }

    }

	
	@PutMapping
    public ResponseEntity<?> updateUser(@RequestBody Users user ){
        try {
            return new ResponseEntity<Users>(
                    usersService.updateUser(user), 
                    HttpStatus.CREATED);

        } catch (IllegalStateException e) {
            return new ResponseEntity<String>(e.getMessage() , HttpStatus.BAD_REQUEST );
        }


    }

}