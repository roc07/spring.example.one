package com.sport.facility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach firstCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(firstCoach.getDailyWorkout());
		
		context.close();

	}

}
