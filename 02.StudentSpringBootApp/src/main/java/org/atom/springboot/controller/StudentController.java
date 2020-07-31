package org.atom.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class StudentController {
	
	@RequestMapping(value = "/geted", method =RequestMethod.GET )
	public String hello() {
		return "Get-Mapping ok..";
	}

	@RequestMapping(value = "/posted", method =RequestMethod.POST)
	public String hello1() {
		return "Post-Mapping ok..";
	}
	
	
	@GetMapping
	public String hello2() {
		return "Get-Mapping ok..@GetMapping";
	}

	@PostMapping
	public String hello3() {
		return "Post-Mapping ok..@PostMapping";
	}
}
