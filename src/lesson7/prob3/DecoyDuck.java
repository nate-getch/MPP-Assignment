package lesson7.prob3;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {
	
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
		// TODO Auto-generated method stub
		MuteQuack.super.quack();
	}
}
