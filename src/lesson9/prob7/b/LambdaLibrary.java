package lesson9.prob7.b;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	 public static final TriFunction<List<Employee>, Integer, Character, String> STAR_EMPLOYEES 
	  		= (list, salary, nameChar) 
	  		     -> list.stream()
					.filter(e -> e.getSalary() > salary)
					.filter(e -> e.getLastName().charAt(0) > nameChar )
					.map(emp -> emp.getFullName())
					.sorted()
					.collect(Collectors.joining(", "));
}
