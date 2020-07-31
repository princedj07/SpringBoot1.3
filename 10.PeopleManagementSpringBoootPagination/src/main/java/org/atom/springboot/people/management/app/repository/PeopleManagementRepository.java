package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementRepository extends CrudRepository<Person, Integer>{

	List<Person> findByLastName(String lastName, Pageable pageable);


	
}
