package com.example.sem2.Object_Oriented_SEM2.finals_revision;
import java.io.*;
import java.util.*;

public class FileManagement {
	public static void main (String[]args) {
		writeInputFile();
		
		double n1, n2, r;
		File input = new File("Object_Oriented_SEM2/finals_revision/input.txt");
		File output = new File("Object_Oriented_SEM2/finals_revision/output.txt");
		try(
			Scanner sc = new Scanner (input);
			PrintWriter pw = new PrintWriter(output);
		){
			while(sc.hasNext()) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				r = n1 / n2;
				pw.printf("%.1f %.1f %.1f\n", n1, n2, r);
			}
		}catch (IOException ex) {
			System.out.println("Input File does not exist or Output File already existed.");
			System.exit(0);
		} catch(ArithmeticException ex) {
			System.out.println("Cannot Divide by 0.");
		}
	}
	
	public static void writeInputFile() {
		File input = new File("Object_Oriented_SEM2/finals_revision/input.txt");
		try(PrintWriter pw = new PrintWriter(input);){
			pw.printf("%.1f %.1f\n%.1f %.1f\n%.1f %.1f", 24.0, 4.0, 13.0, 0.0, 15.0, 3.0);
		} catch(FileNotFoundException ex) {
			System.exit(0);
		}	
	}
	
}
