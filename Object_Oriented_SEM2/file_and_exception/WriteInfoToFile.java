package file_and_exception;
import java.util.*;
import java.io.*;

public class WriteInfoToFile {
	public static void main (String[]args) throws Exception{
		// create a file object and assign its relative path from current directory
		// csv file - comma separated file
		File friendList = new File("Object_Oriented_SEM2/file_and_exception/friends.csv");
		
		// if file existed, terminate the program
		if (friendList.exists()) {
			System.out.print("File \"friends.csv\" existed");
			System.exit(0);
		}
		
		Scanner sc = new Scanner(System.in);
		
		String name, phoneNumber;
		
		System.out.print("Enter number of friends: ");
		int n = sc.nextInt();
		sc.nextLine();		// clear buffer
		
		// PrintWriter object to write into the file
		PrintWriter pw = new PrintWriter(friendList);
		// columns header
		pw.println("Name,Phone Number");
		
		for (int i = 0; i<n; i++) {
			// asking the name and phone number for n friends
			System.out.printf("\n\n(%1d) Name? ",i+1);
			name = sc.nextLine();
			
			
			System.out.printf("\n(%1d) Phone Number? ", i+1);
			phoneNumber = sc.nextLine();
			// write into the file. name and phone number are separated by comma
			pw.println(name+","+phoneNumber);
		}
		
		sc.close();
		pw.close();
		
	}
}
