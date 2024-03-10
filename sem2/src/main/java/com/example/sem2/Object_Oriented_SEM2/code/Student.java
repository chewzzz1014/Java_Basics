package com.example.sem2.Object_Oriented_SEM2.code;
import java.util.Random;
public class Student {
	
	Random random = new Random();
	private String[] randomNames = {"Adams", "Baker", "Clark", "Davis", "Evans", "Frank", "Ghosh", "Hills", "Irwin", "Jones", "Klein", "Lopez", "Mason", "Nalty", "Ochoa", "Patel", "Quinn", "Reily", "Smith", "Trott", "Usman", "Valdo", "White", "Xiang", "Yakub", "Zafar"};
	
	private String name, matric, address;
	private int age;
	String randomPpl = randomNames[random.nextInt(randomNames.length)];
	
	Student(String name, String matric){
		this.name = name;
		this.matric = matric;
	}
	
	Student(){
		this.generateRandomName();
	}
	
	private String generateRandomName() {
		return randomNames[random.nextInt(randomNames.length)];
	}
}
