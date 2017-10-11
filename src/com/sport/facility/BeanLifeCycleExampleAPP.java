package com.sport.facility;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleExampleAPP {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		
		TrackCoach firstCoach = context.getBean("myTrackCoach", TrackCoach.class);

		System.out.println(firstCoach.getDailyWorkout());
		
		context.close();
		
	}

}

