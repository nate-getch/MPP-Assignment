package lesson9.prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    public static void main(String[] args) {
    	boolean anyVegie = menu.stream()
    						.anyMatch(t -> t.isVegetarian() == true);
    	System.out.println("Any Vegei? "+ anyVegie);
    	
    	boolean anyHealthyCal = menu.stream()
    						.anyMatch(t-> t.getCalories() < 1000);
    	System.out.println("Is there any healthy menu have calories less than 1000? "+ anyHealthyCal );
    	
    	boolean anyUnhealthyCal = menu.stream()
				.anyMatch(t-> t.getCalories() > 1000);
    	System.out.println("Is there any unhealthy menu have calories greater than 1000? "+ anyUnhealthyCal );
    	
    	Optional<Dish> firstDishItem = menu.stream()
    									.filter( t-> t.getType() == Type.MEAT)
    									.findFirst();
    	firstDishItem.ifPresent(t -> System.out.println("First Dish Item for Type MEAT: "+firstDishItem.get().getName()));
    	
    	int totalCal = menu.stream()
    					.map(t->t.calories)
    					.reduce(0, (a,b) -> a+b);
    	System.out.println("Total Calories: "+totalCal);
    	
    	int totalCalMeth = menu.stream()
				.map(t->t.calories)
				.reduce(0, Integer::sum);
    	System.out.println("Total Calories: "+totalCalMeth);
    	
    	
    }
    
}