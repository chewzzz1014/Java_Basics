package polymorphism;

public class Square extends TwoDimensional {
		private double length;
		
		Square(){
			this.setShapeName("Square");
		}
		
		Square(double length){
			this();
			this.length = length;
		}
		
		public double getLength() {
			return this.length;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		public void calcArea() {
			this.setArea(Math.round(Math.pow(this.getLength(), 2)*100)/100.00);
		}
		
		public String toString() {
			return super.toString()+"\nLength: "+this.getLength()+" m";
		}
		
}
