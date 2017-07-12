package lesson8.prob2;

import java.util.function.Function;
import java.util.function.Supplier;

public class RandByInnerClass {
	public static void main() {
		sup sobj = new sup();
		System.out.println(sobj.get());
	}
	
	static class sup implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}
	
	static class supp implements Function<Double, Double> {
		@Override
		public Double apply(Double x) {
			return Math.random();
		}
	}
	
}
