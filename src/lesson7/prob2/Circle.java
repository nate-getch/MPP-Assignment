package lesson7.prob2;

/**
 * @author Natnael Demisse
 *
 */

public final class Circle implements ClosedCurve {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getradius() {
		return radius;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double computePerimeter() {
		return 2*Math.PI*radius;
	}

}