package lesson8.prob2;

import java.util.function.Supplier;

public class RandByMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> sup = Math::random;
		System.out.println(sup.get());
	}

}
