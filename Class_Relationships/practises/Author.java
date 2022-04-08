package practises;


public class Author extends BasicsInfo {
	// name and organization are compulsory fields
	String organization;
	char gender;
	
	//////////////////////////////////////////////
	Author(String name, String address, String organization, String email, String country, char gender, String contactNum){
		super(name, address, email, country, contactNum);
		this.organization = organization;
		this.gender = gender;
	}
	
	Author(String name, String organization){
		super(name, "NaN", "NaN", "NaN", "NaN");
		this.organization = organization;
		this.gender = '-';
	}
	
	//////////////////////////////////////////////
	public Author getAuthor() {
		return this;
	}

	
	public String getOrganzation() {
		return this.organization;
	}
	
	
	public char getGender() {
		return this.gender;
	}
	
	////////////////////////////////////////////////
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
