package polymorphism;

public class ThreeDimensional  extends Shape{
		private static int numDimension = 3;
		private double volume;
		
		ThreeDimensional(){
			//no-args constructor
		}
		
		public static int getNumDimension() {
			return numDimension;
		}
		
		public double getVolume() {
			return this.volume;
		}
		
		public void setVolume(double volume) {
			this.volume = volume;
		}
		
		public String toString() {
			return "\nNumber of Dimension: "+getNumDimension()+"\nArea:"+this.getArea()+" m^2\nVolume: "+this.getVolume()+" m^3";
		}
}
