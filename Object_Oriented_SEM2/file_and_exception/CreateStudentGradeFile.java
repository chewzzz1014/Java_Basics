package file_and_exception;
import java.util.*;
import java.io.*;

public class CreateStudentGradeFile {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
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
			
			sc.close();
			System.exit(0);
		}
//////////////////////////////////////////////////
		
	try {
		PrintWriter pw = new PrintWriter(inputFile);
		pw.println("12345 15 20 15 9 36");
		pw.println("67890 12 17 10 8 30");
		pw.println("11223 12 18 12 9 32");
		pw.close();
	}
	catch(FileNotFoundException e){
		System.out.println(e);
		System.exit(0);
	}
	/////////////////////////////////////////////////	
	
	int matric, test, labTest, quiz, project, finalExam, total;
	try {
		Scanner sc1 = new Scanner(inputFile);
		File outputFile = new File("Object_Oriented_SEM2/file_and_exception/outputFile.txt");
		PrintWriter pw1 = new PrintWriter(outputFile);
		
		while(sc1.hasNext()) {
			matric = sc1.nextInt();
			test = sc1.nextInt();
			labTest = sc1.nextInt();
			quiz = sc1.nextInt();
			project = sc1.nextInt();
			finalExam = sc1.nextInt();
			
			total = test+labTest+quiz+project+finalExam;
			
			pw1.printf("%1d %1d %1s\n", matric, total, getGrade(total));
		}	// end of while block
		
		sc1.close();
		pw1.close();
		
	}	// end of try block
	catch(FileNotFoundException e){
		System.out.println(e);
		System.exit(0);
	}	// end of catch block
	catch(Exception e) {
		System.out.print("File \"outputFile.txt\" existed");
	}	// end of catch block
	
	}


public static String getGrade(int t) {
	String grade = "F";
	if (t>=80 && t<=100)
		grade = "A";
	else if (t>=75 && t<=79)
		grade = "A-";
	else if (t>=70 && t<=74)
		grade = "B+";
	else if (t>=65 && t<=69)
		grade = "B";
	else if (t>=60 && t<=64)
		grade = "B-";
	else if (t>=55 && t<=59)
		grade = "C+";
	else if (t>=50 && t<=54)
		grade = "C";
	else if (t>=47 && t<=49)
		grade = "C-";
	else if (t>=44 && t<=46)
		grade = "D+";
	else if (t>=40 && t<=43)
		grade = "D";
	
	return grade;
}

}