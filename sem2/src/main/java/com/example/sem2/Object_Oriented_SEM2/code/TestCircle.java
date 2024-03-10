package com.example.sem2.Object_Oriented_SEM2.code;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[]args) {
		Circle [] circles;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of circles: ");
		int n = sc.nextInt();
		
		circles = createArray(n);
		printAll(circles);
		
		sc.close();
	}
	
	public static Circle[] createArray(int n) {
		Circle [] circles = new Circle[n];
		for (int i=0; i<n; i++) {
			circles[i] = new Circle();
			circles[i].setRadius(Math.random()*100);
			circles[i].setArea();
		}
		return circles;
	}
	
	public static void printAll(Circle[]circles) {
		int i = 1;
		System.out.print("\t\t-------------Start------------\n\n");
		for (Circle c: circles) 
			System.out.printf("\t\tCircle #%1d\nRadius: %.2f cm\nArea: %.2f cm^2\n\n", i++, c.getRadius(), c.getArea());
		System.out.print("\t\t-------------End------------");
	}
}
