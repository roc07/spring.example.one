package com.sport.facility;

public class BaseballCoach implements Coach{
	
	private FortuneService fortune;
	
	public BaseballCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting for 30 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	

}
