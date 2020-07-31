package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface PeopleManagementRepository extends Repository<Person, Integer>{

	@Query(value = "select * from person_table where last_name=?1", nativeQuery = true)
	List<Person> getPersonInfoByLastName(String lastName);
	
	@Query(value = "select * from person_table where first_name=?1 and email=?2", nativeQuery = true)
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email );

}
