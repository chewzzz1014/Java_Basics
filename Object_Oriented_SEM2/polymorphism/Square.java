package polymorphism;

public class Square extends TwoDimensional {
		private double length;
		
		Square(){
			
		}
		
		public double getLength() {
			return this.length;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		public double calcArea() {
			return Math.pow(this.getLength(), 2);
		}
		
		public String toString() {
			return "";
		}
}
