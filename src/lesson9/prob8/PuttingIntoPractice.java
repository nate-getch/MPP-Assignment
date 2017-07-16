package lesson9.prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		transactions.stream()
					.filter(t -> t.getYear() >= 2011)
					.sorted((a,b) -> a.getValue() - b.getValue() )
					.forEach(System.out::println);
		
		System.out.println("==========");
        // Query 2: What are all the unique cities where the traders work?
		transactions.stream()
	        .map(t -> t.getTrader().getCity())
	        .distinct()
	        .forEach(System.out::println);
        
        System.out.println("==========");
        
        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream()
        	.filter(t -> t.getTrader().getCity().equals("Cambridge"))
        	.map(t->t.getTrader().getName())
        	.distinct()
        	.sorted()
        	.forEach(System.out::println);
        
        System.out.println("==========");
        // Query 4: Return a string of all traders names sorted alphabetically.
        String tradersName = transactions.stream()
        					 .map(t->t.getTrader().getName())
        					 .sorted()
        					 .distinct()
        					 .collect(Collectors.joining(", "));
        System.out.println(tradersName);
        
        System.out.println("==========");
        // Query 5: Are there any trader based in Milan?
        Optional<String> tradersInMilan = transactions.stream()
        					.filter(t -> t.getTrader().getCity().equals("Milan"))
        					.findAny()
        					.map(t->t.getTrader().getName());
        if(tradersInMilan.isPresent())
        	System.out.println("There are Traders in Milan");
        else
        	System.out.println("No Traders in Milan.");
        
        System.out.println("==========");
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
					.filter(t->t.getTrader().getCity().equals("Milan"))
					.forEach(t->t.getTrader().setCity("Cambridge"));
        transactions.stream().forEach(System.out::println);  
        
        System.out.println("==========");
        // Query 7: What's the highest value in all the transactions?
        Optional<Transaction> transMax = transactions.stream()
        			.max((t1,t2) -> t1.getValue() - t2.getValue());
        
        transMax.ifPresent( t -> System.out.println("Max trasaction: "+ transMax.get().getValue()) );
        
    }
}
