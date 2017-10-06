package com.sport.facility;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You're lucky today!";
	}

}
