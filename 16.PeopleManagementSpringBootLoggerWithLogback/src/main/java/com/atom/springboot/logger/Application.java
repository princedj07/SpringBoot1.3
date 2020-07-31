package com.atom.springboot.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		log.info("messsage info getting printed");
		log.error("messsage error getting printed");
		log.debug("messsage debug getting printed");
		log.warn("messsage warn getting printed");

	}

	@RequestMapping("/")
	public String hello() {

		String name = "kk";
		if (name.length() == 2) {
			log.info("Inside hello method");
			throw new RuntimeException("opps error haas been occurred");
		}
		return name;
	}

}
