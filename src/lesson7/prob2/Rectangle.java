package lesson7.prob2;

/**
 * @author Natnael Demisse
 *
 */

public final class Rectangle implements Polygon {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	@Override
	public double computeArea() {
		return width * length;
	}

	@Override
	public double[] getSides() {
		double[] t = {width,width,length,length};
		return t;
	}
}
