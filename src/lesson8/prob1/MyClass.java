package lesson8.prob1;

import java.util.function.Predicate;
public class MyClass {
	int x;
	public MyClass(int id, int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
	public boolean myMethod(MyClass obj){
		Predicate<MyClass> predicate = this::equals;
		//Predicate<MyClass> predicate = (a) -> this.equals(a);
		
		return predicate.test(obj);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		MyClass obj2 = (MyClass) obj;
		return this.x != obj2.x;
	}
	
	public static void main(String[] args) {
		MyClass o1 = new MyClass(2, 14);
		MyClass o2 = new MyClass(3, 21);
		
		MyClass o3 = new MyClass(2, 14);
		
		System.out.println(o1.myMethod(o2));
		System.out.println(o1.myMethod(o3)); 
				
	}
}
