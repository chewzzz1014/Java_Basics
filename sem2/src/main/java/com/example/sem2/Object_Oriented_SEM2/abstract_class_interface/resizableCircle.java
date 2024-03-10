package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

//weak inherited from resizble and strong inheritance with Circle
public class resizableCircle extends Circle implements resizble {
	
	resizableCircle(String color, double radius){
		super(color, radius);
	}
	
	// override abstract method in interface resizble
	public void resize(int percent) {
		// resize the radius
		
		// percent may be +ve value (growth in radius) or -ve value (shrink in radius)
		// eg: +25% (growth) == radius*(1+0.25)
		// -25% (shrink) == radius*(1-0.25)
		this.setRadius( this.getRadius() * (percent/100+1) );
	}

	
}
