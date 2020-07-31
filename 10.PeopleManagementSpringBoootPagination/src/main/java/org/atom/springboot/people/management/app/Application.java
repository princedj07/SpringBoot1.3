package org.atom.springboot.people.management.app;


import java.util.List;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;


@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Person> personsList = peopleManagementService.findByLastName("nayak", 
				 PageRequest.of(0, 4, Direction.ASC, "firstName"));
		personsList.forEach(System.out::println);
		
	}


}
