package com.sport.facility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach firstCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(firstCoach.getDailyWorkout());
		
		context.close();

	}

}
