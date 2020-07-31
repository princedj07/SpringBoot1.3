package org.atom.springboot.people.management.app.service;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.repository.PeopleManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementRepository peopleManagementRepository;

	public List<Person> getPersonInfoByLastName(String lastName) {

		return peopleManagementRepository.getPersonInfoByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {

		return peopleManagementRepository.getPersonInfoByFirstNameAndEmail(firstName, email);
	}

}
