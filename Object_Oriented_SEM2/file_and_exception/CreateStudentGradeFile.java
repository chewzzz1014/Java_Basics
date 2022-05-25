package file_and_exception;
import java.util.*;
import java.io.*;

public class CreateStudentGradeFile {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		File inputFile = new File("Object_Oriented_SEM2/file_and_exception/inputFile.txt");
/////////////////////////////////////////////////
		if (inputFile.exists()) {
			System.out.print("File \"inputFile.txt\" existed");
			
			System.out.print("\nDelete File? (y/n) ");
			char p = sc.next().toUpperCase().charAt(0);
			if (p == 'Y')
			{
				inputFile.delete();
				System.out.print("\nFile \"inputFile.txt\" deleted");
			}
			
			System.exit(0);
		}
//////////////////////////////////////////////////
		
try {
	PrintWriter pw = new PrintWriter(inputFile);
}
catch (FileNotFoundException e) {
	System.out.print("File \"inputFile.txt\" not found.");
	System.exit(0);
}
	
if (inputFile.exists()) {
	
} else {
	
}
		
	}
}
