package org.atom.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloWorldController {

	// BaseURL
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello-World.....";
	}
}
