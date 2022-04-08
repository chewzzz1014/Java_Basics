package practises;

public class TechReport extends Publication {
	private long reportNum;
	
	// title is compulsory field
	TechReport(String title){
		super(title);
		this.reportNum = 000000000000L;
	}
	
	TechReport(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, long reportNum){
		super(author, title, pgNum, year, hasDigital, publisher);
		this.reportNum = reportNum;
	}
	
	public long getEdition() {
		return this.reportNum;
	}
	
	public void setEdition(long reportNum) {
		this.reportNum = reportNum;
	}
}
