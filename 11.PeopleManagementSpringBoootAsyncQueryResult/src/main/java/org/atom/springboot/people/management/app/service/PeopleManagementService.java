package org.atom.springboot.people.management.app.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.repository.PeopleManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementRepository peopleManagementRepository;

	public CompletableFuture<Person> findByEmail(String email) {
		
		return peopleManagementRepository.findByEmail(email);
	}

	
}
