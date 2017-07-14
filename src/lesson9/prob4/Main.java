package lesson9.prob4;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream numbers = IntStream.iterate(1, (n) -> n+1)
				.limit(num)
				.map(n -> n*n);
		numbers.forEach(System.out::println);
	}

}
