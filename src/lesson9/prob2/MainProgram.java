package lesson9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainProgram {
	
	public static void main(String[] args) {	
		
		IntStream numbers =IntStream.of(1, 2, 4, 8);
		IntSummaryStatistics summary = numbers.summaryStatistics();
		System.out.println("Max: " +summary.getMax());
		System.out.println("Min: "+summary.getMin());	
		
		/* alternative way with reduce */
		int min = Stream.of(1, 2, 4, 8)
						.reduce((a,b) -> a < b ? a:b)
						.get();
		System.out.println("Min using Reduce : " + min);
	}
}