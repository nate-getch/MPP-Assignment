package lesson7.prob3;

public class RedheadDuck extends Duck implements Quack, FlyWithWings {

	@Override
	public void display() {
		System.out.println("  displaying");
	}

	@Override
	public void fly() {
		FlyWithWings.super.fly();

	}

	@Override
	public void quack() {
		Quack.super.quack();
	}
}
