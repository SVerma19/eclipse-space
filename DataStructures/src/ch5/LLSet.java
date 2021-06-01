package ch5;

import support.LLNode;

public class LLSet<T> implements CollectionInterface<T>{
	protected T[] elements; 
	protected int numElements = 0; 
	protected LLNode<T> location;
	protected LLNode<T> head;
	protected LLNode<T> previous;
	protected boolean found = false;
	
	public LLSet() {
		super(); 
	}
	
	public boolean find(T target) {
		LLNode<T> location = head;
		
		while (location != null) {
			if (location.getInfo() == target) {
				found = true;
				return found;
			} else {
				previous = location;
				location.getLink();
			}
		}
		return found;
	}
	
	
	public boolean remove(T target) {
		find(target);
		
		if (found) {
			if (head == location) {
				head = head.getLink();
			} else {
				previous.setLink(location.getLink());
			}
		}
		numElements--;
		return found;
	}


	public boolean contains(T target) {
		find(target);
		
		return found;
	}

	public boolean add(T element) {
		if (!this.contains(element)) {
			// super.add(element);
			return true; 
		} else {
			return false;
		}
	} 
	
	public T get(T target) {
		if (found) {
			return target;
		} else {
			return null;
		}
	}
	
	
	public boolean isFull() {
		return false;
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

