package org.atom.springboot.people.management.app.service;

import java.util.List;
import java.util.Optional;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.repository.PeopleManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementRepository peopleManagementRepository;
	
	public Person createNewPerson(Person person) {
		
		return peopleManagementRepository.save(person);
	}

	public Iterable<Person> createNewPerson(List<Person> personsList) {
		
		Iterable<Person> iterableList = peopleManagementRepository.saveAll(personsList);
		return iterableList;
	}

	public Iterable<Person> getPersonById(List<Integer> ids) {
		
		return peopleManagementRepository.findAllById(ids);
	}

	public void deletePersonEntity(Person person) {
		
		 peopleManagementRepository.delete(person);
	}

	public void updatePersonEmailByid(int id, String email) {
		
		Person personId = peopleManagementRepository.findById(id).get();
		if(id==personId.getId()) {
			personId.setEmail(email);
		}
		peopleManagementRepository.save(personId);
		
	}

}
