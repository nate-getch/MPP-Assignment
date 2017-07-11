package lesson7.prob3;

public interface MuteQuack {
	default public void quack() {
		System.out.println("  cannot quack");
	}
}
