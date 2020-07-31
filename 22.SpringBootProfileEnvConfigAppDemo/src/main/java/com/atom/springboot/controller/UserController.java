package com.atom.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
	
	@Value(value = "${welcome.message}")
	private String message;
	
	@RequestMapping("/")
	public String hello() {
		return message;
	}

}
