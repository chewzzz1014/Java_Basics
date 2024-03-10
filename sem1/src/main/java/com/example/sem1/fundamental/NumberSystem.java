package com.example.sem1.fundamental;
public class NumberSystem {
	public static void main (String[]args) {
		
	int hex = 0x17B;		// or 0X17B
	printIt(hex,"Hexadecimal");
	
	int bin = 0b1111;		 // or 0B1111
	printIt( bin, "Binary");
	
	int oct = 057;		
	printIt( oct, "Octal");
}
	
	public static void printIt (int num, String base) {
		System.out.printf("Decimal representation of %1s: %1d\n", base, num);
	}
}
