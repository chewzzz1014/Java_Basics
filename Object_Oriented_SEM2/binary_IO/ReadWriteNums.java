package binary_IO;
import java.io.*;

public class ReadWriteNums {
	public static void main (String[]args) throws IOException{		
		try(
		// to write into binary file
		// object of DataOutputStream as wrapper of object of FileOutputStream
		DataOutputStream output = new DataOutputStream(new FileOutputStream("Object_Oriented_SEM2/binary_IO/inputNum.dat", true));
		)
		{
			//write 150 random integers into the binary file
			for (int i=0; i<150; i++)
				output.writeInt( (int)(Math.random()*100) );
			output.close();
		}	// end of try body block
		
		try (
		// to read from binary file
		// object of DataInputStream as wrapper of object of FileInputStream
		DataInputStream input = new DataInputStream(new FileInputStream("Object_Oriented_SEM2/binary_IO/inputNum.dat"));
		)
		{
			int sum = 0, count = 0;
			// read all numbers from the binary file
			for (int i=0; i<150; i++)
			{
				sum += input.readInt();
				count ++ ;
			}  // end of for block
			
			System.out.printf("Number of integers created: %1d\nSum of all integers: %1d", count, sum);
			input.close();
		}	// end of try body block
	}
}
