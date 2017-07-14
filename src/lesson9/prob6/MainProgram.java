package lesson9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.jmx.mbeanserver.GetPropertyAction;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> sets = new ArrayList<Set<String>>();
		sets.add(new HashSet<String>((Arrays.asList("A","B"))));
		sets.add(new HashSet<String>((Arrays.asList("D"))));
		sets.add( new HashSet<String>((Arrays.asList("1", "3", "5"))));
		union(sets).forEach(System.out::print);

	}
	public static Set<String> union(List<Set<String>> sets){
		Set<String> myHashSet = sets.stream()
				.reduce((a,b) -> Stream.concat(a.stream(),b.stream()).collect(Collectors.toCollection(LinkedHashSet::new)) )
				.get();
		
		return myHashSet;
	}

}
