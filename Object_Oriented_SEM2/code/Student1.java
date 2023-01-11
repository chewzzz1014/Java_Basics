package code;
// Week 1

public class Student1 {
	
	//data fields
	int idStudent;
	String name, major, classification;
	
	//first constructor. called when provided classification
	Student1(int stdId, String stdName, String stdMajor, String stdClass ){
		idStudent = stdId;
		name = stdName;
		major = stdMajor;
		classification = stdClass;
	}
	
	//second constructor. called when didn't provide classification
	Student1(int stdId, String stdName, String stdMajor ){
		idStudent = stdId;
		name = stdName;
		major = stdMajor;
		classification =" ";
	}
	
	//third constructor. called when no argument was passed in
	Student1(){
		idStudent = 0;
		name = " ";
		major = " ";
		classification = " ";
	}
	
	//accessor for every data fields
	int getId() {
		return idStudent;
	}
	
	String getName() {
		return name;
	}
	
	String getMajor() {
		return major;
	}
	
	String getClassification() {
		return classification;
	}

	//mutator for major and classification. Id student and name are considered permanent as no mutator for them
	
	void setMajor(String newMajor) {
		major = newMajor;
	}
	
	void setClass(String newClass) {
		classification = newClass;
	}
	
}

