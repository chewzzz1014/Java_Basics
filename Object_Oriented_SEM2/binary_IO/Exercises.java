package binary_IO;
import java.util.*;
import java.io.*;
import java.text.*;

public class Exercises {
	public static void main (String[]args) throws ClassNotFoundException, IOException{
		
		String filePath = "Object_Oriented_SEM2/binary_IO/inputObject.dat";
		try(
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filePath));
			)
		{
			output.writeObject(new int[] {1, 2, 3, 4, 5, 6});
			output.writeObject(new Date());
			output.writeDouble(10.5);
			output.close();
		}
		
		try(
				ObjectInputStream input = new ObjectInputStream(new FileInputStream(filePath));
			)
		{
			int[] nums = (int[]) (input.readObject());
			Date now = (Date) (input.readObject());
			double val = input.readDouble();
			
			input.close();
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = formatter.format(now);
			
			System.out.println("*****Content of inputObject.dat*****");
			System.out.printf("Array: %1s\nDate: %1s\nDecimal Number: %.2f", Arrays.toString(nums), dateString, val);
		}	
	}
}
