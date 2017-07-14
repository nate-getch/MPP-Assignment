package lesson9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MainProgram {
	
	public static void main(String[] args) {	
		IntStream numbers =IntStream.of(1, 2, 4, 8);
		IntSummaryStatistics summary = numbers.summaryStatistics();
		System.out.println("Max: " +summary.getMax());
		System.out.println("Min: "+summary.getMin());	
	}
}