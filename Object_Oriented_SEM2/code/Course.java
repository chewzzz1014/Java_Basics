package code;
// Week 2
// CHEW ZI QING 212360
public class Course {

	//data fields of class Course
	private String courseName;
	private String[] students;		
	private int numOfStudents;
	private int currIdxStudents = 0;	//keep track of current index in array students
	
	// constructor of class Course
	Course(String courseName){
		this.courseName = courseName;
		System.out.println("How many students in this course? ");
		
		java.util.Scanner sc = new java.util.Scanner (System.in);
		numOfStudents = sc.nextInt();		//asking for size of array students of every object of Course created
		
		students = new String[numOfStudents];
		
	}
	
	String getCourseName() {	//accessor of courseName
		return courseName;
	}
	
	void addStudent (String name) {		//add student into array
		students[currIdxStudents] = name;	//assigned "name" into index "currIdxStudents" of array students
		currIdxStudents++;		//move from (current index) to (current index + 1)
	}
	
	String[] getStudents() {	//accessor of array students
		return students;
	}
	
	int getNumOfStudents() {		//accessor of number of students in this course
		return numOfStudents;
	}
}
