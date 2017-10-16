package com.sport.facility;

public class SwimCoach implements Coach {

	private FortuneService fortune;
	
	public SwimCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "gotta swim, fast, fast, fast";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
