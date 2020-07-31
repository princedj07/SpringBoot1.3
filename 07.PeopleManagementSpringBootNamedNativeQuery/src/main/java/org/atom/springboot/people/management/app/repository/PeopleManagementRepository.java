package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.repository.Repository;

public interface PeopleManagementRepository extends Repository<Person, Integer>{

//	Repository---It is marker interface , doesn't have any methods
	
	List<Person> getPersonInfoByLastName(String lastName);
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email );
}
