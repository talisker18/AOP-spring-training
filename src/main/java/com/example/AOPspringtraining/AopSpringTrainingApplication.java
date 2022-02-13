package com.example.AOPspringtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.AOPspringtraining.aop.TracibleService;

@SpringBootApplication
public class AopSpringTrainingApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AopSpringTrainingApplication.class);
		ConfigurableApplicationContext context = app.run(args);
		
		context.getBean(TracibleService.class).hello("aop");
	}

}
