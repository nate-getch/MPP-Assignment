package lesson7.prob3;

public interface CannotFly {
	default public void fly() {
		System.out.println("  cannot fly");
	}
}
