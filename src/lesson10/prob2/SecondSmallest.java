package lesson10.prob2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2,1,3,3,4,5,6,2);
		System.out.println("Numbers Second Smallest : "+getSecondSmallest(numbers));
		
		List<String> strs = Arrays.asList("a","b","c","d");
		System.out.println("String Second Smallest : "+getSecondSmallest(strs));
		
        List<Double> doubs = Arrays.asList(4.0,6.0,7.0,10.0,15.0,41.0);
        Double dobsecondmax = getSecondSmallest(doubs);
        System.out.println("Double Second Smallest : "+dobsecondmax);
       
        List<LocalDate> dates = Arrays.asList(LocalDate.of(2016, 2, 4),LocalDate.of(2016, 5, 17),LocalDate.of(2017, 2, 5),LocalDate.of(2016, 2, 6));
        LocalDate datesecodmin =  getSecondSmallest(dates);
        System.out.println(datesecodmin);
	}
	
	public static <T extends Comparable> T getSecondSmallest(List<T> items) {
		Collections.sort((List<T>) items);
		return items.get(1);		
	}

}
