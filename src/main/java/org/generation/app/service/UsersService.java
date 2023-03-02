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


	@Override
	public boolean existsUserByEmail(String email) {

		return userRepository.existsByEmail(email);
	}


	@Override
	public Users setUser(Users user) {
		
		 if ( existsUserByEmail(user.getEmail() ) )
	            throw new IllegalStateException("The user already exists with email: " + user.getEmail());
	        else if ( user.getEmail().length() > Users.FIELD_MAX_LENGTH )
	            throw new IllegalStateException("Email length is greater than: " + Users.FIELD_MAX_LENGTH);

	        Users newUser = user;
	        newUser.setIdUsuario(0);
	        return userRepository.save(newUser);
		
	}


	@Override
	public Users updateUser(Users newDataUser) {
		
		if ( !existsUserByEmail(newDataUser.getEmail() ) )
            throw new IllegalStateException("The user does not exist with email: " + newDataUser.getEmail());
        else if ( newDataUser.getEmail().length() > Users.FIELD_MAX_LENGTH )
            throw new IllegalStateException("Email length is greater than: " + Users.FIELD_MAX_LENGTH);

        // Obtener los datos actuales del cliente
        Users user = getUserById(newDataUser.getIdUsuario());
        //Actualizar los datos permitidos
        user.setName( newDataUser.getName() );
        user.setUserName( newDataUser.getUserName() );
        user.setPassword( newDataUser.getPassword() );
        user.setPhone(newDataUser.getPhone());

        return userRepository.save(user);
		
	}


	/*@Override
	public String deleteUserById(long idUser) {
		
		 Users user = getUserById(idUser);
	        //customer.setIdCustomer(idCustomer);
	        customerRepository.save(customer);
	        return "The user was delete with id" + idCustomer;
		
	}*/

}
