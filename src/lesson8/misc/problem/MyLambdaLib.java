package lesson8.misc.problem;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class MyLambdaLib {
	public static BiFunction<List<Employee>,String,List<String> > EmployeeFilterWithLastName = 
			(list, str ) -> list.stream()
	   			.filter((x) -> x.getLastName().startsWith(str))
	   			.peek(System.out::println)
	   			.map(Employee::getLastName)
	   			.sorted()
	   			.collect(Collectors.toList());
			
}
