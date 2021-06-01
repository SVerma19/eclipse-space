package ch2;

import support.LLNode;

public class ArrayBoundedStack<T> implements StackInterface<T> {

	// default capacity
	protected final int DEFCAP = 100;
	// holds stack elements
	protected T[] elements;
	// index of top element in stack
	protected int topIndex = -1;

	public ArrayBoundedStack() {
		elements = (T[]) new Object[DEFCAP];
	}

	public ArrayBoundedStack(int maxSize) {
		elements = (T[]) new Object[maxSize];

	}

	
	public boolean isEmpty() {
		return (topIndex == -1);
	}

	
	public boolean isFull() {
		return (topIndex == (elements.length - 1));
	}

	
	public void push(T element) {
		if (isFull())
			throw new StackOverflowException("Push attempted on a full stack.");
		else {
			topIndex++;
			elements[topIndex] = element;
		}
	}

	
	public void pop() throws StackUnderflowException {
		if (isEmpty())
			throw new StackUnderflowException("Pop attempted on empty stack.");
		else {
			elements[topIndex] = null;
			topIndex--;
		}
	}

	
	public T top() throws StackUnderflowException {
		T topOfStack = null;
		
		if (isEmpty())
			throw new StackUnderflowException("Top attempted on empty stack.");
		else {
			topOfStack = elements[topIndex];
			return topOfStack;
		}
	}
	
	
	public int Search(String element) {
		int position = 0;
		int myPosition = 0;
		
		if (!isEmpty()) {
			for (int i = topIndex; i >= 0; i--) {
				position++;
				if (elements[i] == element) {
					myPosition = position;
				}

			}
	
		}
		return myPosition;
	}


	public void printElements() {
		for (int i = 0; i <= topIndex; i++) {
				System.out.println(elements[i]);
			}
	}
	

	public int printSize() throws StackUnderflowException {
		int count = 0;
		
		if (isEmpty())
			throw new StackUnderflowException("Top attempted on an empty stack.");
		else {
			for (int i = 0; i <= topIndex; i++) {
				count++;
			}
			return count;
		}
	}

}

