// CHEW ZI QING 212360
public class TestCourse {

	public static void main (String[]args) {
		
		//create objects of class course
		Course course1 = new Course ("Programming II");
		for (String std: new String[]{"Siti Aminah Muhammad", "Halim Zainal Abidin", "Jason Lim", "Abb", "Qiu","Jake"})	//6 students passed in anonymous array
			course1.addStudent(std);
		printStudents(course1);
		
		Course course2 = new Course("Database Systems");
		for (String std: new String[] {"a","b","c","d","e","f","g","h","i"})	//9 students passed in anonymous array
			course2.addStudent(std);
		printStudents(course2);
	}
	
	
	//function to print all the names in a course
	public static void printStudents(Course c) {
		
		System.out.printf("Number of students in %1s: %1d\n", c.getCourseName(), c.getNumOfStudents());
		
		int idx = 1;
		for (String name : c.getStudents()) {
			System.out.printf("%1d. %1s\n", idx, name);
			idx++;
		}
		
	}
}
