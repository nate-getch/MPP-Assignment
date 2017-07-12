package lesson8.prob2;

import java.util.function.Supplier;

public class RandByLambda {

	public static void main(String[] args) {
		
		Supplier<Double> sup = ()->Math.random();
		System.out.println(sup.get());
	}

}
