package org.generation.app.repository;

import java.util.List;

import org.generation.app.model.Products;
import org.generation.app.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUsersRepository extends CrudRepository<Users, Long> {
	
	Products findById(long idUser);
    List<Users> findAllByName(String name);
	

}
