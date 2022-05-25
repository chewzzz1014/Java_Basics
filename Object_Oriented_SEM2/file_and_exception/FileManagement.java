package file_and_exception;
import java.io.*;
import java.util.*;

public class FileManagement {
	public static void main (String[]args) throws Exception {
	
		//////////////////////////////////
		File input = new File("input.txt");
		try {
			PrintWriter pw = new PrintWriter(input);
			pw.println("24.4 4.0");
			pw.println("13.0 0");
			pw.println("15.0 3.0");
			pw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File \"input.txt\" not found");
			System.exit(0);
		}
		
	///////////////////////////////////////////
	
		Scanner sc = new Scanner(input);
		File output = new File("output.txt");
		PrintWriter pw1 = new PrintWriter(output);

		double n1, n2, div;

		while(sc.hasNext()) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				
				try{div = n1 / n2;
				if (n2!=0)
					pw1.printf("%.2f %.2f %.2f\n", n1, n2, div);	// print line iff n2 is not 0 (no exception)
				}
				catch (ArithmeticException e){
					System.out.println(e);
				}
				
				//pw1.printf("%.2f %.2f %.2f\n", n1, n2, div);
			}
			
			pw1.close();
			
		

		
	}

}
