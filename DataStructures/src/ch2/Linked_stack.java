package ch2;


public class Linked_stack {
	
	public static void main(String[] args) throws StackUnderflowException {
		StackInterface<String> linked_stack = new LinkedStack<String>();

		/******************* 1 *******************/
		linked_stack.push("Jack");
		linked_stack.push("Queen");
		linked_stack.push("King");
		linked_stack.push("Ace");

		((LinkedStack<String>) linked_stack).printElements();
		System.out.println(" ");

		/******************* 2 *******************/
		if (((LinkedStack<String>) linked_stack).isEmpty()) {
			System.out.println("Is Stack empty? : true");
		} else {
			System.out.println("Is Stack empty? : false");
		}
		System.out.println(" ");
		
		/******************* 3 *******************/
		System.out.println("Size of Stack: " + ((LinkedStack<String>) linked_stack).printSize());
		System.out.println(" ");
		
		/******************* 4 *******************/
		System.out.println("Found the element 'Queen' at position: " + ((LinkedStack<String>) linked_stack).Search("Queen"));
		System.out.println(" ");
		
		/******************* 4 *******************/
		System.out.println("The top element is: " + ((LinkedStack<String>) linked_stack).top());
		((LinkedStack<String>) linked_stack).pop();
		
		System.out.println("The current stack is: ");
		((LinkedStack<String>) linked_stack).printElements();
		System.out.println(" ");
		
		/******************* 5 *******************/
		System.out.println("The top element is: " + ((LinkedStack<String>) linked_stack).top());
		System.out.println("The current stack is: ");
		((LinkedStack<String>) linked_stack).printElements();
		System.out.println(" ");
	}
}
