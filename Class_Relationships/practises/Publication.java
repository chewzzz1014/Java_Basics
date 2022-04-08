package practises;

public class Publication {
	// title is compulsory field and its value can't be changed
	private Author author;
	private Publisher publisher;
	private String title;
	private int pgNum, year;
	private boolean hasDigital;
	
	Publication(String title){
		this(null, title, 0, 0000, false, null);
	}
	
	Publication(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher){
		this.author = author;
		this.title = title;
		this.pgNum = pgNum;
		this.year = year;
		this.hasDigital = hasDigital;
		this.publisher = publisher;
		publisher.incrementNumPublication();
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getPgNum() {
		return this.pgNum;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean getHasDigital() {
		return this.hasDigital;
	}
	
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setPgNum(int pgNum) {
		this.pgNum = pgNum;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void setHasDigital() {
		this.hasDigital = true ;
	}
	
	
	
}
