package ch9;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQExample {

	public static void main(String args) {
		// Creating an empty priority queue
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		// Adding items to the pq using add()
		pq.add("C++");
		pq.add("C");
		pq.add("Java");
		pq.add("Python");
		
		// Printing the most priority element
		System.out.println("The most priority element is: " + pq.peek());
		
		// Printing all elements using iterator
		System.out.println("the queue elements: ");
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Removing top priority element (or head) and printing the modified pq
		pq.poll();
		System.out.println("After removing an element with poll function: ");
		Iterator<String> itr2 = pq.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Removing Java using remove()
		pq.remove("Java");
		System.out.println("After removing Java: ");
		Iterator<String> itr3 = pq.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		// Check if an element is present using contains()
		boolean b = pq.contains("C");
		System.out.println("Priority queue contains C or not?: " + b);
		
		// Getting objects from the queue using toArray()
		Object[] arr = pq.toArray();
		System.out.println("Value in array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value: " + arr[i].toString());
		}
	}
}
