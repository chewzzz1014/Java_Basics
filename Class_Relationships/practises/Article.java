package practises;

public class Article extends Publication{
		private int volume = 1;
		
		Article(String name){
			super(name);
		}
		
		Article(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, int volume){
			super(author, title, pgNum, year, hasDigital, publisher);
			this.volume = volume;
		}
		
		public int getVolume() {
			return this.volume;
		}
		
		public void setVolume(int volume) {
			this.volume = volume;
		}
}
