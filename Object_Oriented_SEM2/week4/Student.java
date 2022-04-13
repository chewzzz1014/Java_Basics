// Week 4
// CHEW ZI QING 212360
package week4;

public class Student {
	
	// private data fields
	private int matric;
	private String name, email;
	private double gpa;
	
	// no-args constructor
	Student(){
		
	}
	
	// constructor with arguments
	Student(int matric, String name){
		this.matric = matric;
		this.name = name;
	}
	
	// accessor of private data fields
	public int getMatric() {
		return this.matric;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	
	// setter of private data fields
	public void setMatric(int matric) {
		this.matric = matric;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// return the data fields in one string
	public String toString() {
		String out = "Student\nMatric: "+this.getMatric()+"\nName: "+this.getName()+"\nE-mail: "+this.getEmail()+"\nGPA: "+this.getGpa();
		return out;
	}
	
}
