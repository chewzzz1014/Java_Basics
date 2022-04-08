package practises;

public class Book extends Publication {
		private int edition;
		
		// title is compulsory field
		Book(String title){
			super(title);
			this.edition = 1;
		}
		
		Book(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, int edition){
			super(author, title, pgNum, year, hasDigital, publisher);
			this.edition = edition;
		}
		
		public int getEdition() {
			return this.edition;
		}
		
		public void setEdition(int edition) {
			this.edition = edition;
		}
}
