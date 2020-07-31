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
	
	@RequestMapping("/test1")
	public String hello() {
		log.info("inside hello method");
		return "Hello World...";
	}
	
	@RequestMapping("/test2")
	public String hello1() {
		log.info("inside hello2 method");
		return "Hello World...wins";
	}

}
