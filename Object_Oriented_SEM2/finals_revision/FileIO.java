package finals_revision;
import java.util.*;
import java.io.*;

public class FileIO {
	public static void main (String[]args) throws Exception {
		Scanner stdin = new Scanner (System.in);
		System.out.println("Enter file_name and content_for_file");
		String fileName = stdin.next();
		String content = stdin.next();
		fileName += ".txt";
		
		// clear buffer
		stdin.nextLine();
		
		String filePath = "Object_Oriented_SEM2/finals_revision/"+fileName;
		File file = new File(filePath);
		PrintWriter pw = new PrintWriter(filePath);
		pw.println(content);
		
		// close Scanner and PrintWriter
		stdin.close();
		pw.close();
	}
}
