package binary_IO;
import java.io.*;

public class ReadWriteNums {
	public static void main (String[]args) throws IOException{
			
		try(
		DataOutputStream output = new DataOutputStream(new FileOutputStream("Object_Oriented_SEM2/binary_IO/inputNum.dat", true));
		)
		{
			for (int i=0; i<20; i++)
				output.writeInt( (int)(Math.random()*100) );
			output.close();
		}	// end of try body block
		
		try (
		DataInputStream input = new DataInputStream(new FileInputStream("Object_Oriented_SEM2/binary_IO/inputNum.dat"));
		)
		{
			int sum = 0, count = 0;
			for (int i=0; i<20; i++)
			{
				sum += input.readInt();
				count ++ ;
			}  // end of for block
			
			System.out.printf("Number of integers created: %1d\nSum of all integers: %1d", count, sum);
			input.close();
		}	// end of try body block
		
	}
}
