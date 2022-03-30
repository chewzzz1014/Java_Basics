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


