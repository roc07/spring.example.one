package com.sport.facility;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("myTrackCoach", TrackCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		CricketCoach cricketCoach = context.getBean("otherCricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println("Mail " + cricketCoach.getMail());
		System.out.println("Team name: " + cricketCoach.getTeamName());
		
		System.out.println(cricketCoach.getDailyFortune());		
						
		context.close();
	}

}
