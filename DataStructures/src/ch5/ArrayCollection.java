package ch5;

import support.LLNode;

public class ArrayCollection<T> implements CollectionInterface<T>{
	protected T[] elements; // array that holds queue elements
	protected int numElements = 0; // number of elements in the queue
	protected int location = 0; // index of front of queue (starting location)
	protected boolean found = false;
	
	
	public boolean find(T target) {
		while (location < numElements) {
			if (elements[location].equals(target)) {
				found = true;
				return found;
			} else {
				location++;
			}
		}
		return found;
	}
	
	
	public boolean remove(T target) {
		find(target);
		
		if (found == true) {
			elements[location] = elements[numElements - 1];
			elements[numElements - 1] = null;
			numElements--;
		}
		return found;
	}
	
	
	public boolean contains(T target) {
		find(target);
		
		return found;
	}
	
	
	public T get(T target) {
		find(target);
		
		if (found == true) {
			return elements[location];
		} else {
			return null;
		}
	}
	

	public boolean add(T element) {
		if (isFull()) {
			return false;
		} else {
			elements[numElements] = element;
			numElements++;
			return true;
		}
 	}

	
	public boolean isFull() {
		return numElements == elements.length;
	}
	
	
	public boolean isEmpty() {
		return numElements == 0;
	}
	
	
	public int size() {
		return numElements;
	}


	@Override
	public int count(T target) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void removeAll(T target) {
		// TODO Auto-generated method stub
		
	}
	
}
