package codeExercises;
//Week 1
//CHEW ZI QING 212360
public class TestStudent {
	public static void main (String[] args) {
		
		//creating object of class Student using first constructor
		Student std1 = new Student(160932, "Ghazali Ali", "Science (Math)","Muda");
		
		//creating object of class Student using second constructor
		Student std2 = new Student(167432, "Abdul Rahman", "Engineering");
		//set the major of student
		std2.setMajor("Muda");
		
		//creating object of class Student using first constructor
		Student std3 = new Student(174123, "Abdul Majid", "Forestry", "Kecil");
		
		//creating object of class Student using first constructor
		Student std4 = new Student(158911, "Hoo Yee An", "Computer Science", "Bongsu");
		
		//put all objects in an array
		Student[] std = {std1, std2, std3, std4};
		
		//loop through the array which stores all objects
		for (int i=0; i<4; i++) {
			
			//use accessor to access data fields of each object
			System.out.printf("Id Student: %1d\nName: %1s\nMajor: %1s\nClassification: %1s\n\n", 
					std[i].getId(), std[i].getName(), std[i].getMajor(), std[i].getClassification());
			
		}
		
	}
}

