package ch9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class StudentDriver {
	public static void main(String args[]) {	
		// Initializing the pq
		PriorityQueue<Student> pq = new PriorityQueue<>();
		
		// Creating the Student objects and adding them to pq
		pq.add(new Student(100, "Andy", 22, 3.0, "andy@gmail.com"));
		pq.add(new Student(102, "Beth", 20, 2.9, "beth@gmail.com"));
		pq.add(new Student(105, "Bob", 21, 2.5, "bob@gmail.com"));
		pq.add(new Student(99, "De", 28, 3.6, "de@gmail.com"));
		pq.add(new Student(202, "Cindy", 25, 3.5, "cindy@gmail.com"));
		
		// Printing all elements in the queue
		System.out.println("the queue elements: ");
		Iterator<Student> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(" ");
		
		// Printing number of elements in pq
		System.out.println("Number of elements in the pq: " + pq.size());
		
		System.out.println(" ");
		
		// Printing the queue in specific order using comparator
		while (!pq.isEmpty()) {
			  Student s = pq.poll();
			  System.out.println(s);
		}

		System.out.println(" ");

		// Removing top priority element (based on GPA, in this case) and printing the modified pq
		pq.poll();
		System.out.println("After removing an element with poll function: ");
		Iterator<Student> itr2 = pq.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Printing top priority element (based on GPA, in this case)
		System.out.println(pq.poll());
		
		// Removing all elements from pq
		pq.removeAll(pq);
		System.out.println(pq);
		System.out.println("Number of elements in the pq: " + pq.size());
	}
}
