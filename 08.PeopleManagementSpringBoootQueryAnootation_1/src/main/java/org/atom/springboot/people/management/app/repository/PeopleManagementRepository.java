package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface PeopleManagementRepository extends Repository<Person, Integer>{

//	Repository---It is marker interface , doesn't have any methods
	@Query(value = "select p from Person p where p.lastName=?1")
	List<Person> getPersonInfoByLastName(String lastName);
	
	@Query(value = "select p from Person p where p.firstName=?1 and email=?2")
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email );
	
}
