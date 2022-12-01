package Lab5;
//declare our own Exception
public class MoreThanTwoException extends Exception {
	 private double division;
	 
	public MoreThanTwoException(double division) {
		super("Result of division should not greater than 2.\n"+"Division Result: "+division);	
		// error message to be displayed
		this.division = division;
	}
	
	public double getDivision() {
		return this.division;
	}
}

