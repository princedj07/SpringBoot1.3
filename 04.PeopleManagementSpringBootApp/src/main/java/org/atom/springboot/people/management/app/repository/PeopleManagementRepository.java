package org.atom.springboot.people.management.app.repository;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementRepository extends CrudRepository<Person, Integer>{

}
