package lesson8.prob5.two;

import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		//Arrays.sort(names, (a,b) -> a.compareToIgnoreCase(b) );
		Arrays.sort(names,String::compareToIgnoreCase );
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}

}
