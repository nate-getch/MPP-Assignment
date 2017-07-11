package lesson7.prob3;

public interface Squeak  {
	default public void quack() {
		System.out.println("  squeaking");
	}
}
