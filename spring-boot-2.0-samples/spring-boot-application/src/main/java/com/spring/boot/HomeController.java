package com.spring.boot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class HomeController {

	@Value("${welcome-message}")
	String welcomeText;

	@GetMapping("/hello")
	public String hello() {
		return "first application" + welcomeText;
	}
	
	
	@RequestMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		return "Hello  " + name + " Responsed on : " + new Date();
	}

	@RequestMapping(value = "/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable(name = "name") String name) {
		return new Student(name, "Pune", "MCA");
	}

}
