package com.sport.facility;

public class TrackCoach implements Coach {

	private FortuneService fortune;
	
	public TrackCoach(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 30 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return ("Track Coach says: " + this.fortune.getFortune());
	}

}
