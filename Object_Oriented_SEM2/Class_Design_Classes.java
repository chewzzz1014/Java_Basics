
//https://stackoverflow.com/questions/222214/managing-constructors-with-many-parameters-in-java/222295#222295

//https://cdn.jsdelivr.net/gh/chewzzz1014/file@b1ab3b5ff3755b0fca0fbee3ad20ee0cf73bf09a/UML.drawio.png
	
class Class_Design_Classes {
	
	// set all classes as private to prevent redundant class name with classes of lab assignment in the coming weeks

		
private class Publisher
		{
	
		public class PublisherBuilder{
		
		// using Builder Design Pattern to define default arguments since Java syntax doesn't allow us to provide default arguments' values 

		private String name="NaN";
		private String address = "NaN";
		private String email = "NaN";
		private String contactNum = "NaN";
		private String country = "NaN";
		private boolean hasDigital;	// by default is false, no need to assgin the default value manually
		
		public PublisherBuilder() { }
		
		public Publisher buildPublisher() {
			return new Publisher(name, address, email, contactNum, country, hasDigital);
		}
		
		public Publisher name(String name) {
			this.name = name;
			return this;
		}
		
		public Publisher address(String address) {
			this.address = address;
			return this;
		}
		
		public Publisher email(String email) {
			this.email = email;
			return this;
		}
		
		public Publisher contactNum(String contactNum) {
			this.contactNum = contactNum;
			return this;
		}
		
		public Publisher country(String country) {
			this.name = name;
			return this;
		}
		
		public Publisher hasDigital(boolean hasDigital) {
			this.hasDigital = hasDigital;
			return this;
		}
	}		

		public String getName() {
			return this.name;
		}
		
		public String getAddress() {
			return this.address;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public String getContactNum() {
			return this.contactNum;
		}
		
		public String getCountry() {
			return this.country;
		}
		
		public boolean getHasDigital() {
			return this.hasDigital;
		}
	}
	
	void createPublisher() {
		Publisher publisher = new Publisher();
	}
}	
	
	
	
}
