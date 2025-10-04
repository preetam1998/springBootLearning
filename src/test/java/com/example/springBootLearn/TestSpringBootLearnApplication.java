package com.example.springBootLearn;

import org.springframework.boot.SpringApplication;

public class TestSpringBootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootLearnApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
