

public class Course {

	private String courseName;
	private String[] students;
	private int numOfStudents;
	private int currIdxStudents = 0;
	
	Course(String courseName){
		this.courseName = courseName;
		System.out.println("How many students in this course? ");
		
		java.util.Scanner sc = new java.util.Scanner (System.in);
		numOfStudents = sc.nextInt();
		
		students = new String[numOfStudents];
		
		sc.close();
	}
	
	String getCourseName() {
		return courseName;
	}
	
	void addStudent (String name) {
		students[currIdxStudents] = name;
		currIdxStudents++;
	}
	
	String[] getStudents() {
		return students;
	}
	
	int getNumOfStudents() {
		return numOfStudents;
	}
	
	
}
