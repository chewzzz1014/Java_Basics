package com.example.sem2.Object_Oriented_SEM2.finals_revision;
import java.util.*;

public class ExceptionHandling {
	public static void main (String[]args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a String: ");
			String input = sc.nextLine();
			checkIsEmpty(input);
			
			sc.close();
		} catch(NullPointerException ex) {
			System.out.println("Null Command");
		} catch (EmptyException ex) {
			System.out.println(ex);
		}
	}	
	public static void checkIsEmpty(String str) throws EmptyException{
		if (str.equals(""))
			throw new EmptyException("Empty Command");
	}
	
}
