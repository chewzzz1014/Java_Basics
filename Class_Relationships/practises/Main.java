package practises;

public class Main {
	
	public static void main (String[] args) {
		
		Publisher pelangi = new Publisher("Pelangi", "Jalan DK, Selangor", "Country", "pelangiberhad@outlook.com", "031234567", true );
		
		// publication : Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher   
		// publication : title
		
		// author: String name, String address, String organization, String email, String country, char gender, String contactNum
		// author : name , organization
		Book b1 = new Book( new Author("QK", "Dewan Bahasa & Pustaka"), "Wild", 234, 2022, false, pelangi, 1);
		
		Article a1 = new Article( new Author("Abdul", "Jalan 123 51222", "MoHE", "abdul@mohe.my", "Malaysia", 'm', "012345677"), "The Impacts of Covid-19", 12, 2019, true, pelangi, 1);
		
		TechReport t1 = new TechReport( new Author("Abdul", "Jalan 123 51222", "MoHE", "abdul@mohe.my", "Malaysia", 'm', "012345677"), "Technology of Mobility Learning", 50, 2021, true, pelangi, 123456789101L);
		
		
		System.out.printf("Publisher\n\nName: %1s\nLocation: %1s\nCountry: %1s\nEmail: %1s\nContact Number: %1s\nHas digital store: %1b\nPublication: %1d\n", pelangi.getName(), pelangi.getAddress(), pelangi.getCountry(),  pelangi.getEmail(), pelangi.getContactNum(), pelangi.getHasDigital(), pelangi.getNumPublication());
		
		System.out.printf("Book\n\nTitle: %1s\nAuthor: %1s\nNumber of pages: %1d\nYear of Publication: %1d\nHas digital version: %1b\nPublisher: %1s\nEdition: %1d\n", b1.getTitle(), b1.getAuthor().getName(), b1.getPgNum(), b1.getYear(), b1.getHasDigital(), b1.getPublisher().getName(), b1.getEdition() );
		
		
	}
}
