package lesson7.prob3;

public class RubberDuck extends Duck implements Squeak, CannotFly {
	
	@Override
	public void display() {
		System.out.println("  displaying");	
	}
	
	@Override
	public void fly() {
		CannotFly.super.fly();	
	}
	
	@Override
	public void quack() {
		Squeak.super.quack();		
	}
}
