package org.generation.app.repository;

import org.generation.app.model.Administrator;
import org.springframework.data.repository.CrudRepository;

public interface IAdministratorRepository extends CrudRepository<Administrator, Long> {

	Administrator findById(long idAdministrator);

}
