package ch2;

import java.util.Stack;

public class Ab_stack {
	
	public static void main(String[] args) throws StackUnderflowException {
		StackInterface<String> ab_stack = new ArrayBoundedStack<String>();

		/******************* 1 *******************/
		ab_stack.push("Jack");
		ab_stack.push("Queen");
		ab_stack.push("King");
		ab_stack.push("Ace");
		
		System.out.println("The Stack is: ");
		((ArrayBoundedStack<String>) ab_stack).printElements();
		System.out.println(" ");
		
		/******************* 2 *******************/
		if (ab_stack.isEmpty()) {
			System.out.println("Is Stack empty? : true");
		} else {
			System.out.println("Is Stack empty? : false");
		}
		System.out.println(" ");
		
		/******************* 3 *******************/
		System.out.println("Size of Stack: " + ((ArrayBoundedStack<String>) ab_stack).printSize());
		System.out.println(" ");
		
		/******************* 4 *******************/
		System.out.println("Found the element 'Queen' at position " + ((ArrayBoundedStack<String>) ab_stack).Search("Queen"));
		System.out.println(" ");
		
		/******************* 5 *******************/
		System.out.println("The top element is: " + ((ArrayBoundedStack<String>) ab_stack).top());
		((ArrayBoundedStack<String>) ab_stack).pop();
		
		System.out.println("The current Stack is: ");
		((ArrayBoundedStack<String>) ab_stack).printElements();
		System.out.println(" ");
		
		/******************* 6 *******************/
		System.out.println("The top element is: " + ((ArrayBoundedStack<String>) ab_stack).top());
		System.out.println("The current Stack is: ");
		((ArrayBoundedStack<String>) ab_stack).printElements();
		System.out.println(" ");
	}
}
	
