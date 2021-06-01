package ch4;

public class ArrayBoundedQueue<T> implements QueueInterface<T> {
	protected final int DEFCAP = 100; // default capacity
	protected T[] elements; // array that holds queue elements
	protected int numElements = 0; // number of elements in the queue
	protected int front = 0; // index of front of queue
	protected int rear; // index of rear of queue
	
	
	public ArrayBoundedQueue() {
		elements = (T[]) new Object[DEFCAP];
		rear = DEFCAP - 1;
	}
 
	
	public ArrayBoundedQueue(int maxSize) {
		elements = (T[]) new Object[maxSize];
		rear = maxSize - 1;
	}


	public void enqueue(T element) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException("Enqueue attempted on a full queue.");
		} else {
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
		return (numElements == elements.length);
	}
	
	
	public boolean isEmpty() {
		return (numElements == 0);
	}
	
	
	public int size() {
		return numElements;
	}
	
	
    public void display() { 
    	int i; 

        for (i = front; i <= rear; i++) { 
            System.out.println(elements[i]); 
        } 
    } 
    
} 

