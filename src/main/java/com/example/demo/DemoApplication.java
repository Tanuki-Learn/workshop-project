package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static final String GITHUB_TOKEN = "ghp_1A2b3C4d5E6f7G8h9I0jK1lM2nO3pQ4rS5tU";

	@GetMapping("/")
	String home() {
		return "Spring is here!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
