package com.neocool.spring_aws_ecs;

import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsEcsApplication {

	private static Logger log = LoggerFactory.getLogger(XSlf4j.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsEcsApplication.class, args);
	}

}
