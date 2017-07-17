package lesson9.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Good {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Good m = new Good();
		List<String> words = new ArrayList<>(Arrays.asList("Abe","Kebe","Nate","Ete"));
		int count = m.countWords(words, 'e', 'd', 3);
		System.out.println("Words: "+ words + "\nCount: "+count);
	}
	
	public Stream<String> listFilter(List<String> list, char c, char d, int len) {
		return 
			 list.stream()   
		     .filter(a -> a.length() == len)
		     .filter(a -> a.indexOf(c) >= 0) // contain c
		     .filter(a -> a.indexOf(d) < 0 );  // doesnt contain d
	}
	
	 public int countWords(List<String> words, char c, char d, int len) {
		 int count = (int) listFilter(words,c,d,len).count();
		 return count;
		 }
}
