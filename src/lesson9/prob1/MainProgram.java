package lesson9.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("Bill","Thomas","Marry");
		String output = stream.map(Object::toString).collect(Collectors.joining(", "));
		System.out.println(output);
		
	}

}
