package ch4;

import support.LLNode;

public class LinkedQueue<T> implements QueueInterface<T> {

	protected LLNode<T> front;
	protected LLNode<T> rear;
	protected int numElements = 0;
	
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}

	
	public void enqueue(T element) throws QueueOverflowException {
		// Set new node for the new element
		LLNode<T> newNode = new LLNode<T>(element);

		if (rear == null) {
			front = newNode;
		} else {
			rear.setLink(newNode); // Add the new node to the rear of the linked list
		}
		rear = newNode; // Update the rear pointer
		numElements++; // Update the number of elements plus one
	}

	
	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		} else {
			T element = front.getInfo();
			front = front.getLink(); 
	
			if (front == null) { rear = null; }
			
			numElements++;		
			return element;
		}
	}

	
	public boolean isFull() {
		return false;
	}


	public boolean isEmpty() {
		return (front == null);
	}


	public int size() {
		return numElements;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub	
	}

}
