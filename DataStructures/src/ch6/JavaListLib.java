package ch6;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaListLib {
	
	public static void main(String[] args) {
		// Create a list instance from Java API
		List listA = new ArrayList(); // List is the interface and ArrayList is the implementation class
		List listB = new LinkedList();
		
		// Insert elements in a Java list
		listA.add("One");
		listA.add("Two");
		listA.add("Three");
		
		// Insert element at specific index
		listA.add(3, "Four"); // Adding element "Four" to index 3
		
		// Print list
		System.out.println(listA);
		
		// Print list with iteration
		for (int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i));
		}
		
		// Find elements in a list
		int index2 = listA.indexOf("Two");
		System.out.println(index2);
		
		// Checking if list contains element - T or F
		System.out.println(listA.contains("element 1"));
		
		// Updating elements in a list
		listA.set(3, "Hi");
		System.out.println(listA);
		
		// Remove element from list
		listA.remove("Two");
		System.out.println(listA);
		
		// Remove all elements
		listA.clear();
		System.out.println(listA);
	}

}
