package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	private static final String GITHUB_TOKEN = "ghp_1A2b3C4d5E6f7G8h9I0jK1lM2nO3pQ4rS5tU";

	@Test
	public void contextLoads() {
	}

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void homeResponse() {
		String body = this.restTemplate.getForObject("/", String.class);
		assertThat(body).isEqualTo("Spring is here!");
	}
}
