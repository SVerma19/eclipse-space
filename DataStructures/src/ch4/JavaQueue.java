package ch4;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args ) {
		// Create and initialize a Queue using a LinkedList
		Queue<String> waitingQueue = new LinkedList();
		
		waitingQueue.add("Hello");
		waitingQueue.add("World");
		
		System.out.println("waitingQueue elements are: " + waitingQueue);
		
		// Throws NoSuchElementException is the queue is empty
		// String name = waitingQueue.remove();
		// System.out.println(name);
		
		// Returns null if the queue is empty
		// String name = waitingQueue.poll();
		// System.out.println(name);
		
		if (waitingQueue.contains("Hello")) {
			System.out.println("Yes");
		}
		
	}
}
