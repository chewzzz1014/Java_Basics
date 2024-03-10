package com.example.sem2.Object_Oriented_SEM2.code;

public class TestManager {
	public static void main (String[]args) {
		Staff s1 = new Staff();
		s1.setStaffID(1111);
		s1.setSalary(1000);
		s1.printDetails();
		// or
		//printStaffDetails(s1);
		
		Manager m1 = new Manager();
		m1.setStaffID(2222);
		m1.setSalary(2000);
		m1.setDepartment("Finance");
		m1.printDetails();
		// or
		//printManagerDetails(m1);
	}
	
	
	/* 
	//or use submethod in main class
	  
	public static void printStaffDetails(Staff s) {
		System.out.printf("Staff ID: %1d\nSalary: %.1f\nBonus: %.1f\n\n", s.getStaffID(), s.getSalary(), s.bonus());
	}
	
	public static void printManagerDetails(Manager m) {
		System.out.printf("Staff/Manager ID: %1d\nDepartment: %1s\nSalary: %.1f\nBonus: %.1f\n\n", m.getStaffID(), m.getDepartment(), m.getSalary(), m.bonus());
	}
	
	*/
	
}
