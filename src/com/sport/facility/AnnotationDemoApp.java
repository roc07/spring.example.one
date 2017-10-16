package com.sport.facility;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) throws IOException {
		
		FileFortune example = new FileFortune();
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("autoApplicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		
		System.out.println("check for destroy method 1");
		
		context.close();
		
		System.out.println("check for destroy method 2");
	}

}
