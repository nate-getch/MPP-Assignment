package lesson10.prob4;

import java.util.ArrayList;
import java.util.List;

public class MyStackArrayList <T> {
	
	List<T> stack;
	int size;
	
	//push(), pop(), size(), peek(), isEmpty()
	public MyStackArrayList(){
		stack = new ArrayList<>();
		size = 0;
	}
	
	 void push(T e) {
		stack.add(e);
		size++;
	}
	 
	 void pop() {
		stack.remove(size-1);
		size--;
	}
	 
	 T peek() {
		return stack.get(size-1);
	}
	 
	 int getSize() {
		 return size;
	 }
	 
	 boolean isEmpty() {
		 if(size <= 0) {
			 return true;
		 }
		 return false;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackArrayList<Object> obj = new MyStackArrayList<>();
		obj.push("10");
		obj.push(20);
		obj.push("Abush");
		System.out.println(obj.peek());
		obj.pop();
		System.out.println(obj.peek());
		System.out.println(obj.getSize());
	}

}
