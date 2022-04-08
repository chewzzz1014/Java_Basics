package practises;

public class Publisher extends BasicsInfo{
	
	// name is compulsory data field
	private boolean hasDigital;		//false by default
	private int numPublication = 0;
	
	///////////////////////////////////////////////////
	
	Publisher(String name, String address, String email, String country, String contactNum, boolean hasDigital){
		super(name, address, email, country, contactNum);
		this.hasDigital = hasDigital;
	}
	
	Publisher(String name){
		super(name, "NaN", "NaN", "NaN", "NaN");
	}
	
	//////////////////////////////////////////////
	
	public Publisher getPublisher() {
		return this;
	}
	
	public boolean getHasDigital() {
		return this.hasDigital;
	}
	
	public int getNumPublication() {
		return numPublication;
	}
	
	//////////////////////////////////////////////
	
	public void setHasDigital() {
		this.hasDigital = true;
	}
	
	public void incrementNumPublication() {
		numPublication++;
	}
	
}
