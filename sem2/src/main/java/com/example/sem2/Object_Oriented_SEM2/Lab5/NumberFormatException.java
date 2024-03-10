package com.example.sem2.Object_Oriented_SEM2.Lab5;
// declare our own Exception
public class NumberFormatException extends Exception {
	 private double division;
	 
	public NumberFormatException(double division) {
		super("Result of division should not less than 2.\n"+"Division Result: "+division);		
		// error message to be displayed
		this.division = division;
	}
	
	public double getDivision() {
		return this.division;
	}
}
