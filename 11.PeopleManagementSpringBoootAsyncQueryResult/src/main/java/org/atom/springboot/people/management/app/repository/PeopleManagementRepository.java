package org.atom.springboot.people.management.app.repository;

import java.util.concurrent.CompletableFuture;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.repository.Repository;
import org.springframework.scheduling.annotation.Async;

public interface PeopleManagementRepository extends Repository<Person, Integer>{

	@Async
	CompletableFuture<Person> findByEmail(String email);

	

}
