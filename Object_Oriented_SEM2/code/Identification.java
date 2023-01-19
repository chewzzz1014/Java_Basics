package code;
// Week 1
public class Identification {
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
