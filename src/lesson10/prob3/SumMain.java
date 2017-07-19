package lesson10.prob3;

import java.util.Arrays;
import java.util.List;

public class SumMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = Arrays.asList(4, 2, 3);
		System.out.println("Sum : "+sum(ints));
		List<Double> doubles = Arrays.asList(4.2, 2.5, 3.7);
		System.out.println("Sum : "+sum(doubles));
	}
	
	static double sum(List<? extends Number> items) {
		/*double sum = 0.0;
		for(Number t : items)
			sum += t.doubleValue();
		
		return sum;	*/
		
		return items.stream()
				.map(t->t.doubleValue())
				.reduce(0.0, (a,b) -> a+b );
	}
	
}
