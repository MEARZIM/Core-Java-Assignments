/**
 * 
 */
package Org.Shapes;

/**
 * 
 */
public class Circle {
	
	private double radius;

	public Circle(double radius) {
	    this.radius = radius;
	}

	public double getArea() {
	    return Math.PI * radius * radius;
	}

	public double getPerimeter() {
	    return 2 * Math.PI * radius;
	}
}
