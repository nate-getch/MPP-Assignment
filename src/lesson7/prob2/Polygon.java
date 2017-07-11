package lesson7.prob2;

public interface Polygon extends ClosedCurve{
	default double computePerimeter() {
		double p = 0.0;
		double[] t = getSides();
		for (int i = 0; i < t.length; i++) {
			p += t[i];
		}
		return p;
	}

	double[] getSides();
}
