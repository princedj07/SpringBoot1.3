package com.atom.springboot.controoler;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements ErrorController{

	private static final String PATH = "/error";
	
	@Override
	public String getErrorPath() {
		
		return PATH;
	}
	
	@RequestMapping(value = PATH, method = RequestMethod.GET)
	public String defaultErrorMessage() {
		return "Requested Resource is Not Found...";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String hello() {
		
		return "welcom-to-the-world";
	}
	
}
