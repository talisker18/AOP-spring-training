package com.example.AOPspringtraining.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:aop-context.xml")
public class AopApplicationConfiguration {
	
	public TracibleService tracibleServe() {
		return new TracibleService();
	}

}
