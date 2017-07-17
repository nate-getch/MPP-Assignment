package lesson10.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("Java","MPP","SE");
		reverse(l1); 
	}
	
	public static void reverse(List<?> list) {
		revrseHelper(list);
	}
	
	public static <T> void revrseHelper(List<T> list) {
		List<T> rev = new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			rev.add(list.get(i));
		}
		System.out.println(rev);
	}

}
