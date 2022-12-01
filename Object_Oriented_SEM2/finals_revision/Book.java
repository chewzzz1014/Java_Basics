package finals_revision;

public class Book {
	private String title, author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String toString() {
		return "Title: "+this.getTitle()+"\nAuthor: "+this.getAuthor();
	}
}
