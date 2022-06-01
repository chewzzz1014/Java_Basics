package abstract_class_interface;

public class resizableCircle extends Circle implements resizble {
	
	resizableCircle(String color, double radius){
		super(color, radius);
	}
	
	// override
	public void resize(int percent) {
		// percent may be +ve value (growth in radius) or -ve value (shrink in radius)
		// eg: +25% (growth) == radius*(1+0.25)
		// -25% (shrink) == radius*(1-0.25)
		this.setRadius( this.getRadius() * (percent/100+1) );
	}

	
}
