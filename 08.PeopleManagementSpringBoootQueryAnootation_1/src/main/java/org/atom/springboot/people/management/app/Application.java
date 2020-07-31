package org.atom.springboot.people.management.app;


import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		getPersonInfoByLastName();
		getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByFirstNameAndEmail() {
		
		List<Person> personsList = peopleManagementService.getPersonInfoByFirstNameAndEmail("Akshay", "ak@twiter.com");
		personsList.forEach(System.out::println);
	}

	private void getPersonInfoByLastName() {
	
		List<Person> personsList = peopleManagementService.getPersonInfoByLastName("nayak");
		personsList.forEach(System.out::println);
	}

}
