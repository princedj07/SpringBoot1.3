package org.atom.springboot.people.management.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
//		createNewPerson();
//		createMultiplePersons();
//		getPersonById();
//		deletePersonEntity();
		updatePersonEmailByid();
	}

	private void updatePersonEmailByid() {
		
		peopleManagementService.updatePersonEmailByid(3,"prince1850@yahoo.com");
	}

	private void deletePersonEntity() {
		
		Person person = new Person();
		person.setId(2);
		peopleManagementService.deletePersonEntity(person);
		
	}

	private void getPersonById() {
		
		List<Integer> ids = new ArrayList<>();
		ids.add(2);
		ids.add(3);
		ids.add(20);
		
		Iterable<Person> iterablePerson = peopleManagementService.getPersonById(ids);
		iterablePerson.forEach(System.out::println);
		
	}

	private void createMultiplePersons() {
		
		List<Person> personsList = Arrays.asList(new Person("Ram", "nayak", "srk@ram.com", new Date()),
				new Person("Akshay", "Rane", "ak@twiter.com", new Date()));
		Iterable<Person> createPersons = peopleManagementService.createNewPerson(personsList);
		
		for (Person person : createPersons) {
			System.out.println(person);
		}
	}

	private void createNewPerson() {
		
		Person person = new Person( "Prince", "Dj", "prince@yahoo.com", new Date());
		Person person2 = peopleManagementService.createNewPerson(person);
		System.out.println("Person Details : "+person2.toString());
	}

}
