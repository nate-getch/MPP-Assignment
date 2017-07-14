package lesson9.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		List<String> words = new ArrayList<>(Arrays.asList("Abe","Kebe","Nate","Ete"));
		int count = m.countWords(words, 'e', 'd', 3);
		System.out.println("Words: "+ words + "\nCount: "+count);
	}
	
	 public int countWords(List<String> words, char c, char d, int len) {
		 int count = (int) words.stream()
				 .filter(a -> a.length() == len)
			     .filter(a -> a.indexOf(c) >= 0) // contain c
			     .filter(a -> a.indexOf(d) < 0 )  // doesnt contain d
			     .count();
		 return count;
		 }
}
