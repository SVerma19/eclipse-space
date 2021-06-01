package ch9;

import java.util.Collections;
import java.util.PriorityQueue;

// Java program to demonstrate working of Priority Queue as a Max Heap

public class HeapExample {

	public static void main(String args[]) {
		// Create a MaxHeap
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		// Adding items to the MaxHeap
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(400);
		maxHeap.add(30);
		
		System.out.println("The maximum value in the heap: " + maxHeap.poll());
	}
	
}
