package lesson8.prob5.one;

import java.util.Arrays;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		fruits.forEach( (o) -> System.out.println(o));
		System.out.println("==============");
		fruits.forEach(System.out::println);
	}

}
