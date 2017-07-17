package lesson10.prob4;

public class MyStackArray <T> {
	
	T[] stack;
	int ctr;
	
	public MyStackArray(){
		ctr = 0;
		stack = (T[]) new Object[5];
	}
	
	 void push(T e) {
		if(ctr == stack.length) {
			resize();
		}
		System.out.println("Pushing "+ e);
		stack[ctr] = e;
		ctr++;
	}
	 
	T pop() {
		T temp = stack[ctr-1];
		stack[ctr-1] = null;
		ctr--;
		return temp;
	}
	 
	 T peek() {
		return stack[ctr-1];
	}
	 
	 int getSize() {
		 return ctr;
	 }
	 
	 boolean isEmpty() {
		 if(ctr <= 0) {
			 return true;
		 }
		 return false;
	 }
	 
	 void resize() {
		T[] temp = (T[]) new Object[2*stack.length];
		System.arraycopy(stack, 0, temp, 0, stack.length);
		stack = null;
		stack = temp;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackArray<String> obj = new MyStackArray<>();
		obj.push("Renuka");
		obj.push("Promila");
		obj.push("Abush");
		System.out.println("Stack Elements: " +obj);
		System.out.println("Size: "+ obj.getSize());
		System.out.println("Peek: " +obj.peek());
		System.out.println("Pop: " + obj.pop());
		obj.push("Nati");
		obj.push("Beti");
		System.out.println("Stack Elements: " +obj);
		System.out.println("Peek: "+obj.peek());
		System.out.println("Size: "+ obj.getSize());
		System.out.println("Is the Stack Empty? "+ obj.isEmpty());
		
		System.out.println("====");
		MyStackArray<Double> obj2 = new MyStackArray<>();
		obj2.push(2.0);
		obj2.push(10.0);
		obj2.push(7.2);
		obj2.push(32.1);
		
		System.out.println("Double Stack Top Element : "+obj2.peek());
		
	}
	
	public String toString() {
		String t = "";
		for(int i=0; i<stack.length; i++) {
			t+= (stack[i] != null) ? stack[i]+" ":"";
		}
		return t;
	}

}
