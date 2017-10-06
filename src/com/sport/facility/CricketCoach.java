package com.sport.facility;

public class CricketCoach implements Coach {

	private FortuneService fortune;
	private String mail;
	private String teamName;		
		
	public String getMail() {
		return mail;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setFortune(FortuneService fortune) {
		System.out.println("Setting Cricket Fortune");
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your swing!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortune.getFortune();
	}

}
