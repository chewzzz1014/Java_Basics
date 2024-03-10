package com.example.sem2.Object_Oriented_SEM2.finals_revision;

public class HighSchoolStudent extends Student {
	HighSchoolStudent(String schoolName){
		super(schoolName);
	}
	
	public String toString() {
		return "High School "+super.toString();
	}
}
