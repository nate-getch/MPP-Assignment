package lesson7.prob3;

public interface Quack  {
	default public void quack() {
		System.out.println("  quacking");
	}
}
