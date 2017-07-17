package lesson9.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Better {
	public static final BiFunction<String, Integer, Boolean> leng = (word,len)->word.length()==len;
	public static final BiFunction<String, Character, Boolean> contain = (word,letter)->word.contains(""+letter+"");
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("Abe","Kebe","Nate","Ete"));
		long count = countWords(words, 'e', 'd', 3);
		
		System.out.println(count);
	}

	public static long countWords(List<String> words, char c, char d, int len) {
		return words.stream()
				.filter(w->leng.apply(w, len))
				.filter(w->contain.apply(w, c))
				.filter(w->!contain.apply(w, d))
				.count();
	}
}