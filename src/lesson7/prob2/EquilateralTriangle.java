package lesson7.prob2;

/**
 * @author Natnael Demisse
 *
 */

public class EquilateralTriangle implements Polygon {
	private double base;
	private double height;

	public EquilateralTriangle(double base, double height) {
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
	public double computeArea() {
		return 1 / 2 * base * height;
	}

	@Override
	public double[] getSides() {
		double[] t = { base, base, base };
		return t;
	}

}
