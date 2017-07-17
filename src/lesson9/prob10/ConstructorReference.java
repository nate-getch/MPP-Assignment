package lesson9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { 
			new Human("Joe",35,"Male"), 
			new Human("Jane",45,"Female"), 
			new Human("John",30,"Male")};
	
    // Query 1  : Print only male canditates
	Stream.of(list).filter(t->t.getGender().equals("Male")).forEach(System.out::println);
	
	System.out.println("======");
    // Query 2  : add some more objects to the list, and print the count of female candidates whose age is greater than 30 
	List<Human> l = arrayToCollection(list);
	 l = Arrays.asList( new Human("Nati", 26, "Male"), new Human("Rahel", 27, "Female"), new Human("Sosi", 32, "Female") );
	double c = l.stream()
			 .filter(t-> t.getGender().equals("Female") && t.getAge() >= 30)
			 .count();
	System.out.println("# of Female candidates whose age is greater than 30 "+c);
	
	System.out.println("======");
    // Query 3 : Practice for method reference Classname::new - Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors) and print the object status
	Function<String,Human> h1 = Human::new;
	System.out.println(h1.apply("Natnael"));
	
	BiFunction<String,Integer,Human> h2 = Human::new;
	System.out.println(h2.apply("Natnael",26));
	
	TriFunction<String,Integer,String,Human> h3 = Human::new;
	System.out.println(h3.apply("Natnael",26, "Male"));
	
	System.out.println("======");
	// Query 4 : convert your Human array into ArrayList of Human by creating a static method, decide your arguments and return type   
    List<Human> col1 = arrayToCollection(list);
    System.out.println(col1);
   }

	// Implement the body for Query 4

  public static List<Human> arrayToCollection(Human[] humanArr){
	  List<Human> Humanlist = Arrays.asList(humanArr);
	  return Humanlist;
  }

}