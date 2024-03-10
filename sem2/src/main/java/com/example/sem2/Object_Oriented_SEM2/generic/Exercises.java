package com.example.sem2.Object_Oriented_SEM2.generic;

import java.util.*;
 class Exercises {
	public static void main (String[]args) {
		// generic ArrayList that stores Integer objects
		ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(new Integer[]{244, 543, 1243, 8, 2, 4354, 32, 67}));
		System.out.println("Smallest Element is "+min(nums) );
		
		// generic ArrayList that stores String objects
		ArrayList <String> strs = new ArrayList<>(Arrays.asList(new String[] {"Not Bad", "Excellent", "Marvelous", "Interesting", "Moderate"}));
		System.out.println("Smallest Element is "+min(strs) );
	}
	
	// generic method that accepts generic ArrayList and return element of generic type
	public static <E extends Comparable<E>> E min (ArrayList<E> list) {
		// let first element became the smallest element first
		E min = list.get(0);
		for (int i=1;i<list.size(); i++) 
			// since E is subclass of Comparable
			if (list.get(i).compareTo(min) <0 )
				min = list.get(i);
		return min;
	}
}
