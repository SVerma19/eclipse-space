package ch3;

import support.LLNode;

public class Task4 {
	// Recursive method to remove all occurrences of target from list, if exists
	
	public static <T> LLNode<T> remove(T target, LLNode<T> list) {
		// Base condition — if list is empty/null, return null
		if (list == null) {
			return null;
		}

		// If current node has target value call the recursive method and pass it, then return result
		// The remove method takes the target element and the element's link
		if (list.getInfo().equals(target)) {
			return remove(target, list.getLink());
		}

		// Creating a Node with the "list" nodes value
		LLNode<T> node = new LLNode<T>(list.getInfo());

		// Passing the the result of recursive remove operation to the new node
		node.setLink(remove(target, list.getLink()));

		// Returning the node
		return node;
	}

	// Function to print list
    static <T> void print(LLNode<T> list) {
    	if (list != null) {
    		System.out.print(list.getInfo());
    		
    		if (list.getLink() != null) {
    			System.out.print(", ");
    		} else {
    			System.out.println();
    		}
    		
    		print(list.getLink());
        }
    }
	

	public static void main(String[] args) {
		// Array of numbers
		int numbers[] = {3, 6, 9, 12, 15, 18, 6, 19, 19, 20, 6};
		
		// Adding first number from array as root value
		LLNode<Integer> numbersNode = new LLNode<Integer>(numbers[0]);
		
		// Taking a copy to the first element in the list
		LLNode<Integer> first = numbersNode;
		
		// Adding each number from the array to the end of node chain
		for (int i = 1; i < numbers.length; i++) {
			first.setLink(new LLNode<Integer>(numbers[i]));
			first = first.getLink();
		}
		
		// Displaying node chain
		System.out.println("Original list: ");
		print(numbersNode);
		
		// Removing all occurrences of 2
		System.out.println(" ");
		System.out.println("Removing all occurrences of 6: ");
		numbersNode = remove(6, numbersNode);

		// Printing node chain
		print(numbersNode);
	}

}

