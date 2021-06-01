package ch4;

public class ArrayUnboundedQueue<T> implements QueueInterface<T> {
	protected final int DEFCAP = 100; // default capacity
	protected T[] elements; // array that holds queue elements
	protected int origCap; // original capacity
	protected int numElements = 0; // number of elements in the queue
	protected int front = 0; // index of front of queue
	protected int rear; // index of rear of queue
	
	
	public ArrayUnboundedQueue() {
		elements = (T[]) new Object[DEFCAP];
		rear = DEFCAP - 1;
		origCap = DEFCAP;
	}
	
	
	public ArrayUnboundedQueue(int origCap) {
		elements = (T[]) new Object[origCap];
		rear = origCap - 1;
		this.origCap = origCap;
	}
	
	
	private void enlarge() {
		T[] larger = (T[]) new Object[elements.length + origCap];

		int currSmaller = front;
		
		for (int currLarger = 0; currLarger < numElements; currLarger++) {
			larger[currLarger] = elements[currSmaller];
			currSmaller = (currSmaller + 1) % elements.length;
		}

		elements = larger;
		front = 0;
		rear = numElements - 1;
	}

	
	public void enqueue(T element) throws QueueOverflowException {
		if (numElements == elements.length) {
			enlarge();
			
			rear = (rear + 1) % elements.length;
			elements[rear] = element;
			numElements = numElements + 1;
		}
	} 

	
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		} else {
			T toReturn = elements[front];
			elements[front] = null;
			front = (front + 1) % elements.length;
			numElements = numElements - 1;
			return toReturn;
		}
	}
	
	
	public boolean isFull() {
		return false;
	}
	
	
	public boolean isEmpty() {
		return (numElements == 0);
	}
	
	
	public int size() {
		return numElements;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub	
	} 
    
}