package org.atom.springboot.people.management.app;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.atom.springboot.people.management.app.model.Person;
import org.atom.springboot.people.management.app.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application implements CommandLineRunner {
	
	@Autowired
	PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CompletableFuture<Person> completableFuture = peopleManagementService.findByEmail("ak@twiter.com");
		Person person = completableFuture.get(20, TimeUnit.SECONDS);
		System.out.println(person);
	}



}
