//CHEW ZI QING 212360
public class TestFan {
	public static void main (String []args) {
		
		//creating object of class Fan. fan1 will get default-valued data fields
		Fan fan1 = new Fan ();
		//set speed of object
		fan1.setSpeed(Fan.FAST);
		//set radius of object
		fan1.setRadius(10);
		//set color of object
		fan1.setColor("yellow");
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		//print all data fields of object in one line
		System.out.println(fan1.to_String());
		//"on" the fan
		fan1.setState(true);
		//print all data fields of object in one line. Note the differences between previous line in output
		System.out.println(fan1.to_String()+"\n");
		
		
		System.out.println(fan2.to_String());
		fan2.setState(true);
		
		System.out.println(fan2.to_String());
	}
}

class Fan{
	//static constant of class Fan. access them through className.staticDataFields
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;

	//private data fields that given default values
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//constructor
	Fan(){
		
	}
	
	//accessor of private data fields
	int getSpeed() {
		return speed;
	}
	
	boolean getState() {
		return on;
	}
	
	double getRadius() {
		return radius;
	}
	
	String getColor() {
		return color;
	}
	
	//mutator of all data fields
	void setSpeed(int nSpeed) {
		speed = nSpeed;
	}
	
	void setState(boolean nState) {
		on = nState;
	}
	
	void setRadius(double nRadius) {
		radius = nRadius;
	}
	
	void setColor(String nColor) {
		color = nColor;
	}
	
	//return the data fields in one line
	String to_String() {
		if (on)
			return "Fan speed is "+speed+", color is "+color+" and radius is "+radius+".";
		else
			return "Fan is off. Fan color is "+color+" and radius of fan is "+radius+ ".";
	}
}
