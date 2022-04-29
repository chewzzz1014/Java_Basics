package polymorphism;

public class Square extends TwoDimensional {
		private double length;
		
		Square(){
			
		}
		
		Square(double length){
			this.length = length;
		}
		
		public double getLength() {
			return this.length;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		public void calcArea() {
			this.setArea(Math.pow(this.getLength(), 2));
		}
		
}
