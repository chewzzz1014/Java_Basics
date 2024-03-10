package com.example.sem2.Object_Oriented_SEM2.binary_IO;
import java.io.*;

public class ReadWriteObject {
	public static void main (String[]args) throws ClassNotFoundException, IOException{
		
		try(
			// to write into binary file
			// object of DataOutputStream as wrapper of object of FileOutputStream
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Object_Oriented_SEM2/binary_IO/bookObject.dat"));	
		)
		{
			// read 5 Book objects into binary file
			output.writeObject(new Book("Burning", 45.99));
			output.writeObject(new Book("Kill the Mockingbird", 67.50));
			output.writeObject(new Book("And Then There Were None", 70.30));
			output.writeObject(new Book("Sherlock Holmes Series", 256.80));
			output.writeObject(new Book("Interstellar", 50.00));
			
			output.close();
		}	// end of try body block
		
		
			try(
				// to read from binary file
				// object of DataInputStream as wrapper of object of FileInputStream
				FileInputStream inputFile = new FileInputStream("Object_Oriented_SEM2/binary_IO/bookObject.dat");
				// 'input' as wrapper of 'inputFile'
				ObjectInputStream input = new ObjectInputStream(inputFile);	
			)
			{
				int count = 0;
				
				// while it's not the end of the file, read the object in binary file
				// EOFException checking 
				while (inputFile.available() > 0 )
				{
					// casting to Book object
					Book b = (Book)(input.readObject());
					// add price of the object to totalPrice of all Book objects
					Book.addTotalPriceOfBooks(b.getPrice());
					count ++ ;
				}	// end of while block
			System.out.printf("Number of Books: %1d\nTotal Book Price: RM %.2f", count, Book.getTotal());	
			input.close();
			
			}	// end of try body block
		
	}
}
	

