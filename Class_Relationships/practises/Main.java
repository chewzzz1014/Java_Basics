package practises;

public class Main {
	
	public static void main (String[] args) {
		
		Publisher pelangi = new Publisher("Pelangi", "Jalan DK, Selangor", "pelangiberhad@outlook.com", "Malaysia", "031234567", true );
		
		// publication : Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher   
		// publication : title
		
		// author: String name, String address, String organization, String email, String country, char gender, String contactNum
		// author : name , organization
		Book b1 = new Book( new Author("QK", "Dewan Bahasa & Pustaka"), "Wild", 234, 2022, false, pelangi, 1);
		
		Article a1 = new Article( new Author("Abdul", "Jalan 123 51222", "MoHE", "abdul@mohe.my", "Malaysia", 'm', "012345677"), "The Impacts of Covid-19", 12, 2019, true, pelangi, 1);
		
		TechReport t1 = new TechReport( new Author("Abdul", "Jalan 123 51222", "MoHE", "abdul@mohe.my", "Malaysia", 'm', "012345677"), "Technology of Mobility Learning", 50, 2021, true, pelangi, 123456789101L);
		
		System.out.println("*****************************************");
		pelangi.printDetails();
		
		System.out.print("\n*****************************************");
		b1.printDetail();
		b1.getAuthor().printDetails();
				
		System.out.print("\n*****************************************");
		a1.printDetail();
		a1.getAuthor().printDetails();
		
		System.out.print("\n*****************************************");
		t1.printDetail();
		t1.getAuthor().printDetails();
		
		System.out.print("\n*****************************************");
	}
}
