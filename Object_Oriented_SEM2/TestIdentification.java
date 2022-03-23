//CHEW ZI QING 212360
public class TestIdentification{
	public static void main (String args[]) {
		
		//creating object of class Identification
		Identification lecturer = new Identification("Nor Fazlida","fazlida@upm.edu.my",'f');
		
		//print all the data fields. Since those data fields are private, use accessor to get them
		System.out.printf("Name: %1s\nEmail: %1s\nGender: %1c\n", lecturer.getName(),lecturer.getEmail(), lecturer.getGender() );
		//print all data fields in one sentence
		System.out.println(lecturer.to_String());
		
		//altering the email
		lecturer.setEmail("fazlida@gmail.com");
		System.out.println(lecturer.to_String());
	}
}

class Identification{
	
	//private data fields
	private String name, email;
	private char gender;
	
	//class constructor
	Identification(String userName, String userEmail, char userGender){
		name = userName;
		email = userEmail;
		gender = userGender;
	}
	
	//accessor for data fields
	String getName() {
		return name;
	}
	
	String getEmail() {
		return email;
	}
	
	char getGender() {
		return gender;
	}
	
	//mutator for email
	void setEmail (String newEmail) {
		email = newEmail;
	}
	
	//return all data fields in one sentence
	String to_String() {
		return  (getName()+" ("+getGender()+") at "+getEmail());
	}
}