package binary_IO;
import java.io.*;

public class ReadWriteObject {
	public static void main (String[]args) throws ClassNotFoundException, IOException{
		
		try(
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Object_Oriented_SEM2/binary_IO/bookObject.dat"));	
		)
		{
			output.writeObject(new Book("Burning", 45.99));
			output.writeObject(new Book("Kill the Mockingbird", 67.50));
			output.writeObject(new Book("And Then There Were None", 70.30));
			output.writeObject(new Book("Sherlock Holmes Series", 256.80));
			output.writeObject(new Book("Interstellar", 50.00));
			
			output.close();
		}	// end of try body block
		
		
			try(
				FileInputStream inputFile = new FileInputStream("Object_Oriented_SEM2/binary_IO/bookObject.dat");
				ObjectInputStream input = new ObjectInputStream(inputFile);	
			)
			{
				int count = 0;
				
				// while it's not the end of the file
				while (inputFile.available() > 0 )
				{
					// casting to Book object
					Book b = (Book)(input.readObject());
					System.out.println(b.getPrice());
					Book.addTotalPriceOfBooks(b.getPrice());
					count ++ ;
				}	// end of while block
			System.out.printf("Number of Books: %1d\nTotal Book Price: RM %.2f", count, Book.getTotal());	
			input.close();
			
			}	// end of try body block
		
	}
}
	

