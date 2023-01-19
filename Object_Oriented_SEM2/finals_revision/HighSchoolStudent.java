package finals_revision;

public class HighSchoolStudent extends Student {
	HighSchoolStudent(String schoolName){
		super(schoolName);
	}
	
	public String toString() {
		return "High School "+super.toString();
	}
}
