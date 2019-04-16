package com.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

	@Value("${welcome.message}")
	String welcomeText;

	@GetMapping("/hello")
	public String hello() {
		return "first application" + welcomeText;
	}

}
