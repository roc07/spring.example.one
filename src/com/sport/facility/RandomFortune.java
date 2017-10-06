package com.sport.facility;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] randomFortune = {"Practice more Java!", 
			"Learn Some SQL!", "Take a Break"};
	
	@Override
	public String getFortune() {
		Random rnd = new Random();
		
		return randomFortune[rnd.nextInt(3)];
	}

}
