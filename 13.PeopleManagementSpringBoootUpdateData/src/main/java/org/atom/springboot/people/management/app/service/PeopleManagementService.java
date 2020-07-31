package org.atom.springboot.people.management.app.service;

import org.atom.springboot.people.management.app.repository.PeopleManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementRepository peopleManagementRepository;

	public void updateEmailById(int id, String newEmail) {
		
		peopleManagementRepository.updateEmailById(id,newEmail);
	}

	
}
