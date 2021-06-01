package ch4;

public class RepeatStringUNBQ {
	
	public static void main(String[] args ) throws QueueOverflowException, QueueUnderflowException {
		QueueInterface<String> unbQueue = new ArrayUnboundedQueue<String>();
		
		unbQueue.enqueue("Hello");
		unbQueue.enqueue("World");
		
		String e1 = unbQueue.dequeue();
		System.out.println(e1);

	
	}
	
}
