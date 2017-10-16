package com.sport.facility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.sport.facility")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortune();
	}
	
	@Bean
	public SwimCoach swimCoach(FortuneService fortune) {
		return new SwimCoach(sadFortuneService());
	}
}
