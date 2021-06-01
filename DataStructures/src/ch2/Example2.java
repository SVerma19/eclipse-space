package ch2;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		StackInterface<String> stack = new ArrayBoundedStack<String>();
		
		stack.push("Hello World!");
		stack.push("How are you?");
		
		((ArrayBoundedStack<String>) stack).printElements();
	}
	
}
