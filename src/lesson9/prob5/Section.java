package lesson9.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream2 = Stream.of("abe","kebe", "debe","asd","efg","zzz");
		Stream<String> stream3 = Stream.of("gobe","dede", "babi","ttt","yyy","lll");
		streamSection(nextStream(), 3,6).forEach(System.out::println);
		System.out.println("=============");
		streamSection(stream2, 2,2).forEach(System.out::println);
		System.out.println("=============");
		streamSection(stream3, 4,6).forEach(System.out::println);
	}

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		return stream.skip(m).limit(n+1-m);
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

}
