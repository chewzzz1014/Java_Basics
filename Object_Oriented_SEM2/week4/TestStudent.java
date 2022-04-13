// Week 4 Question 1
// CHEW ZI QING 212360
package week4;

public class TestStudent {
	public static void main (String[]args) {
		
		// object of class Student
		Student s1 = new Student(123444, "Ali Ahmad");
		s1.setEmail("ali@gmail");
		s1.setGpa(3.75);
		System.out.println(s1.toString());
		
		System.out.println();
		
		// object of class Undergraduate
		Undergraduate u1 = new Undergraduate();
		u1.setMatric(123446);
		u1.setName("Syahida Said");
		u1.setGpa(3);
		u1.setClassification("Junior");
		System.out.println(u1.toString());
		
		System.out.println();
		
		//object of class Postgraduate
		Postgraduate p1 = new Postgraduate("Cancar Prognosis");
		p1.setMatric(123555);
		p1.setName("Muhammad Aiman Basir");
		p1.setGpa(3.57);
		System.out.println(p1.toString());
		
		System.out.println();
		
	}
	
}
