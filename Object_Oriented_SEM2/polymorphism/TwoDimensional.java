package polymorphism;

public class TwoDimensional extends Shape {
		private static int numDimension = 2;
		
		TwoDimensional(){
			
		}
		
		public static int getNumDimension() {
			return numDimension;
		}
		
		public String toString() {
			return super.toString()+"\nNumber of Dimensions: "+getNumDimension()+"\nArea: "+this.getArea()+" m^2";
		}
		
}
