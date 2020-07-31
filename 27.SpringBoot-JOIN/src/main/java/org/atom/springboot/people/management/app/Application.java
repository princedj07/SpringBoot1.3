package org.atom.springboot.people.management.app;


import java.util.List;

import org.atom.springboot.people.management.app.service.AtomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	AtomService atomService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//getInfoByJoin("+919848304");
		getInfoByJoin("0000000004");
	}

	private void getInfoByJoin(String string) {
		List<Object[]> list = atomService.getInfoByJoin(string);
		
		for (Object[] objects : list) {
			System.out.println(objects[0]+ "--- "+objects[1]);
		}
	}

	

}
