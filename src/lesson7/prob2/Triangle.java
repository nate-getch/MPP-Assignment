package lesson7.prob2;

/**
 * @author Natnael Demisse
 *
 */

public final class Triangle implements ClosedCurve, Polygon {
	private double base;
	private double height;
	private double side1;
	private double side2;

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = 1 / 2 * base * height;
		return area;
	}

	public Triangle(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	@Override
	public double[] getSides() {
		double[] t = {side1,side2,base};
		return t;
	}

}
