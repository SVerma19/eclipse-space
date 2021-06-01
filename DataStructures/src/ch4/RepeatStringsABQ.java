package ch4;

public class RepeatStringsABQ {
	
	public static void main(String[] args ) throws QueueOverflowException {
		QueueInterface<String> abQueue = new ArrayBoundedQueue<String>();
		
		abQueue.enqueue("Hello");
		abQueue.enqueue("World");
		
		abQueue.display();	
		// Can also just use dequeue method
	}
}

