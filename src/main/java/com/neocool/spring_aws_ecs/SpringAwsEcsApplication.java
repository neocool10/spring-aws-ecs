package com.neocool.spring_aws_ecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsEcsApplication {
	
	@GetMapping("/")
    public String home() {
        return "Hello World, This is spring boot application.";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsEcsApplication.class, args);
	}

}
