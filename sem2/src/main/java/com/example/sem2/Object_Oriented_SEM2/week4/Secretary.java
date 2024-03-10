// week 4 question 3
//CHEW ZI QING 212360
package com.example.sem2.Object_Oriented_SEM2.week4;
//inherits class Employee
public class Secretary extends Employee {
	Secretary(){
		//no-args constructor
	}
	
	//overriding toString()
	public String toString() {
		return "The Secretary "+super.toString()+".";
	}
}