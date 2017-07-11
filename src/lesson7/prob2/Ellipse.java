package lesson7.prob2;

public class Ellipse implements ClosedCurve {
	private double axisLength;
	private double ellipticIntegral;
	
	public Ellipse(double axisLength, double ellipticIntegral){
		this.axisLength = axisLength;
		this.ellipticIntegral = ellipticIntegral;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * axisLength * ellipticIntegral;
	}
	
	
	public double computePerimeter() {
		return  4*axisLength*ellipticIntegral;
	}

}
