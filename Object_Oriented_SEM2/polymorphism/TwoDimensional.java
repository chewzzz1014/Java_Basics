package polymorphism;

public class TwoDimensional extends Shape {
		private static int numDimension = 2;
		
		TwoDimensional(){
			
		}
		
		public static int getNumDimension() {
			return numDimension;
		}
		
		public String toString() {
			return "\nNumber of Dimensions: "+getNumDimension();
		}
}
