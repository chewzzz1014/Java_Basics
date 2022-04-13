package week4;

public class Employee extends Person {
	
	private String employeeNum;
	private double basicSalary;
	
	Employee(){
		System.out.println("In Employee constructor.");
	}
	
	public String getEmployeeNum() {
		return this.employeeNum;
	}
	
	public double getBasicSalary() {
		return this.basicSalary;
	}
	
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public String toString() {
		return this.getName()+"(employee number "+this.getEmployeeNum()+") has a salary of "+this.getBasicSalary();
	}

}
