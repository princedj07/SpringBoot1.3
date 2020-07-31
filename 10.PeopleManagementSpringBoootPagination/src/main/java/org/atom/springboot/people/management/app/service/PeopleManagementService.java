package org.atom.springboot.people.management.app.service;

import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.repository.PeopleManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementRepository peopleManagementRepository;

	public List<Person> findByLastName(String lastName, PageRequest pagerequest) {
		
		return peopleManagementRepository.findByLastName(lastName,pagerequest);
	}
	

}
