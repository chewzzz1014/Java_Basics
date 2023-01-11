package finals_revision;

public class Student {
	private String schoolName;
	
	Student(String schoolName){
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return this.schoolName;
	}
	public String toString() {
		return "Student at "+this.schoolName;
	}
}
