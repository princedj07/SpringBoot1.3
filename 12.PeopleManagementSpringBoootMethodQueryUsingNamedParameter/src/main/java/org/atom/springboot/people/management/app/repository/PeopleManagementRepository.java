package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PeopleManagementRepository extends JpaRepository<Person, Integer>{

	
	@Query("select p from Person p where p.firstName=:firstname or p.lastName=:lastname")
	List<Person> findByFirstNameOrLastName(@Param("firstname") String firstName, @Param("lastname") String lastName);


}
