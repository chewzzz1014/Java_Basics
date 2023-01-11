package file_and_exception;
import java.util.*;
import java.io.*;

public class WriteFriendList {
	public static void main (String[]args) {
		
		String name, phone;
		// create new file with relative path from current directory
		File fList = new File("Object_Oriented_SEM2/file_and_exception/friends.txt");
		
		Scanner sc = new Scanner (System.in);
		
		try {
			// pw is used to write into fList
			PrintWriter pw = new PrintWriter(fList);
			System.out.print("Enter number of friends: ");
			int n = sc.nextInt();
			sc.nextLine();   // clear buffer
			
			// get all the friends
			for (int i=0; i<n; i++) {
				System.out.printf("\n(%1d) Name: ", i+1);
				name = sc.nextLine();
				System.out.printf("\n(%1d) Phone Number: ", i+1);
				phone = sc.nextLine();
				
				// replace space with _
				// so that we would not need to set multiple delimiters
				name = name.replace(' ', '_');
				phone = phone.replace(' ', '_');
				// write into fList
				pw.println(name+" "+phone);
			}
			
			sc.close();
			pw.close();
			
		} catch(FileNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		} catch(InputMismatchException e) {
			System.out.println(e+": Wrong Input Type. Rerun the program.");
			System.exit(0);
		}
		
		// Read From File
		try {
			System.out.print("\n\n******************************************\n");
			System.out.print("\t\tFriend List\n");
			// readFile object is used to read the contents from fList
			Scanner readFile = new Scanner(fList);
			while(readFile.hasNext()) {
				name = readFile.next();
				// replace _ with space to get our original input
				name = name.replace('_', ' ');
				
				phone = readFile.next();
				phone = phone.replace('_', ' ');
				
				System.out.printf("Name: %1s \nPhone Number: %1s\n\n", name, phone);
			}
			
			readFile.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		
	}
}
