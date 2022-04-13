package week4;

public class Dependant extends Person{
	private char gender;
	private String dateOfBirth;
	
	Dependant(){
		System.out.println("In Dependant constructor.");
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
		return this.getName()+" ("+this.getGender()+") is a dependant.";
	}
	
}
