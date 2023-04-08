package com.dockerize.springboopapp.dockerizespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizeSpringBootAppApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to dockerize spring boot app";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringBootAppApplication.class, args);
	}

}
