package com.sport.facility;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("autoApplicationContext.xml");
		
		TennisCoach firstCoach = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach secondCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(firstCoach == secondCoach);
		System.out.println(firstCoach);
		System.out.println(secondCoach);
	}

}
