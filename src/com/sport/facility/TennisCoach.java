package com.sport.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortune")
	private FortuneService fortune;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortune = fortuneService;
//	}
	
//	@Autowired
//	public void setFortune(FortuneService fortune) {
//		this.fortune = fortune;
//	}
	
//	@Autowired
//	public void superFortune(FortuneService fortune) {
//		this.fortune = fortune;
//	}	
	
	@Override
	public String getDailyWorkout() {
		return "Rocket Launcher Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
