// week 4 question 3
//CHEW ZI QING 212360
package week4;

public class TestPerson {
	public static void main (String[]args) {
		// object of class Manager
		Manager m = new Manager();
		m.setName("Ahmad Abu");
		m.setEmployeeNum("A11981");
		m.setBasicSalary(6300);
		m.setAllowance(1300);
		System.out.println(m.toString());
		
		//object of class SalesPerson
		SalesPerson s = new SalesPerson();
		s.setName("Nur Fatimah Ishak");
		s.setEmployeeNum("S02063");
		s.setBasicSalary(2500);
		s.setCommision(1200);
		System.out.println(s.toString());
	}
}
