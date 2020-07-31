package com.atom.springboot.controoler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String hello() {
		
		return "welcom-to-the-world";
	}
}
