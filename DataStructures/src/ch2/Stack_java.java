package ch2;

import java.util.Stack;

public class Stack_java {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		/******************* 1 *******************/
		stack.push("Jack");
		stack.push("Queen");
		stack.push("King");
		stack.push("Ace");
		
		System.out.println("The Stack is: " + stack);
		
		/******************* 2 *******************/
		if (stack.isEmpty()) {
			System.out.println("Is Stack empty? : true");
		} else {
			System.out.println("Is Stack empty? : false");
		}
		
		/******************* 3 *******************/
		System.out.println("Size of Stack: " + stack.size());
		
		/******************* 4 *******************/
		System.out.println("Found the element 'Queen' at position " + stack.search("Queen"));
		
		/******************* 5 *******************/
		String popped = stack.pop();
		System.out.println("The top element is: " + popped);
		System.out.println("The current Stack is: " + stack);
		
		/******************* 6 *******************/
		System.out.println("The top element is: " + stack.peek());

	}
}
