package file_and_exception;
import java.util.*;
import java.io.*;

public class ReadFromFile {
	public static void main (String[]args) throws Exception{
		
	
		Scanner rf = new Scanner("Object_Oriented_SEM2/file_and_exception/friends.csv");
		
		// csv file uses comma to separate contents
		rf.useDelimiter(",|\\r\\n");
		
		String c = rf.next();
		System.out.print(c);
		
		String c1 = rf.next();
		System.out.print(c1);
		/*
		String title1 = rf.next();
		String title2 = rf.next();
		
		
		String content1, content2;
		int i = 1;
		while (rf.hasNext()) {
			content1 = rf.next();
			content2 = rf.next();
			
			System.out.printf("\n(%1d)%1s: %1s\n%1s: %1s",i, title1, content1, title2, content2);
		}
		*/
	
	}
}
