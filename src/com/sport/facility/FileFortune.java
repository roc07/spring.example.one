package com.sport.facility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortune implements FortuneService {

	private Random rnd = new Random();
	
	public FileFortune() throws IOException {
		//initializer();
	}
	
	@PostConstruct
	private void initializer() throws IOException {
		System.out.println("Initializing FileFortune");
		
		BufferedWriter file = new BufferedWriter(new FileWriter("file_example.txt"));
		
		file.write("1. Fortune one");
		file.newLine();
		file.write("2. Fortune two");
		
		file.close();
	}
	
	@PreDestroy
	private void destroyed() {
		System.out.println("destroying fileFortune bean");
	}
	
	private String reading(int a) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("file_example.txt"));
		ArrayList<String> lines = new ArrayList<String>();
		String s = null;
		while ((s = file.readLine()) != null) {
			lines.add(s);
		} ;
		
		file.close();
		return lines.get(a);	
	}
	
	@Override
	public String getFortune(){
		int x = 0;
		x = rnd.nextInt(2);
		
		try {
			return reading(x);
		} catch (IOException e) {
			return "This failed";
		}
	}
	
}
