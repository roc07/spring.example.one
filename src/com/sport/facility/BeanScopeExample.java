package com.sport.facility;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExample {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		
		TrackCoach trackCoach = context.getBean("myTrackCoach", TrackCoach.class);
		TrackCoach myTrackCoach = context.getBean("myTrackCoach", TrackCoach.class);
		
		System.out.println("Do they point to the same place in the memory? " 
		+ (trackCoach == myTrackCoach));
		
		TrackCoach firstCoach = context.getBean("myTrackCoachPrototype", TrackCoach.class);
		TrackCoach secondCoach = context.getBean("myTrackCoachPrototype", TrackCoach.class);
		
		System.out.println("Do they point to the same place in the memory? " 
		+ (firstCoach == secondCoach));
		
		context.close();
		
	}

}
