package ch6;

import support.LLNode;

public class LBList<T> implements ListInterface<T> {
	protected LLNode<T> front; // reference to the front of the list
	protected LLNode<T> rear; // reference to the rear of the list
	protected int numElements = 0; // number of elements in the list
	
	/****** set by find method ******/
	protected boolean found = false; // true if found, otherwise false
	protected LLNode<T> location; // node containing target, if found
	protected LLNode<T> previous; // node for previous location
	protected int targetIndex; // node for previous location
	
	public LBList() {
		numElements = 0;
		front = null;
		rear = null;
	}
	
	public boolean find(T target) {
		location = front;
		targetIndex = -1;
		
		while (location != null) {
			targetIndex++;
			
			if (location.getInfo().equals(target)) {
				found = true;
				return found;
			} else  {
				previous = location;
				location = location.getLink();
			}
		}
		return found;
	}

	public boolean remove(T target) {
		find(target);
		
		if (found) {
			if (front == location) {
				front = front.getLink(); // remove first node
			} else {
				previous.setLink(location.getLink());
			}
		
			if (front == null) {
				rear = null;
			}
			/*
			if (rear == location) {
				rear = previous;
			}
			rear.getLink() = null;
			*/
			numElements++;
		}
		return found;
	}

	public boolean contains(T target) {
		find(target);
		return found;
	}

	public boolean add(T element) {
		LLNode<T> newNode = new LLNode<T>(element);
		
		if (rear == null) {
			front = newNode;
		} else {
			rear.setLink(newNode);
		}
		rear = newNode;
		numElements++;
		return true;
	}
	
	public T get(T target) {
		find(target);
		
		if (found) {
			return location.getInfo();
		} else {
			return null;
		}
	}

	@Override
	public int count(T target) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		return (numElements == 0);
	}

	public int size() {
		return numElements;
	}

	public void add(int index, T element) {
		if ((index < 0) || index > size()) {
			throw new IndexOutOfBoundsException("Index of " + index + " passed to LBList add method. \n");
		}
		
		LLNode<T> newNode = new LLNode<T>(element);
		
		// add to front
		if (index == 0) {
			if (front == null) {
				front = newNode;
				rear = newNode;
			} else {
				newNode.setLink(front);
				front = newNode;
			}
		} 
		else if (index == size()) { // add to rear
			rear.setLink(newNode);
			rear = newNode;
		} else { // add in interior of list
			LLNode<T> node = front;
			for (int i = 0; i < index - 1; i++) {
				node = node.getLink();
			}
			newNode.setLink(node.getLink());
			node.setLink(newNode);
		}
		numElements++;
	}
		
	public T remove(int index) {
		if ((index < 0) || index > size()) {
			throw new IndexOutOfBoundsException("Index of " + index + " passed to LBList add method. \n");
		}
		
		T hold; // holds the information to return 
		
		if (index == 0) { // remove the front node
			hold = front.getInfo();
			front = front.getLink();
			if (numElements == 1) { // removing only node
				rear = null;
			}
		} else {
			LLNode<T> node = front;
			
			for (int i = 0; i < index - 1; i++) {
				node = node.getLink();
			}
			hold = node.getLink().getInfo();
			
			if (node.getLink() == rear) {
				rear = node;
			}
			node.setLink(node.getLink().getLink());
		}
		numElements--;
		return null;
	}
	
	/*********************************  H O M E W O R K   M E T H O D S  *********************************/
	public T set(int index, T newElement) {
		if ((index < 0) || (index >= size())) {
			throw new IndexOutOfBoundsException("Illegal index of " + index + " passed to LBList set method.\n");
		}
			
		LLNode<T> node = front;
			
		for (int i = 0; i < index; i++) {
			node = node.getLink();
		}
		T hold = node.getInfo(); 
		node.setInfo(newElement); 
		return hold;
	}

	public T get(int index) {
		if ((index < 0) || (index >= size())) {
			throw new IndexOutOfBoundsException("Illegal index of " + index + " passed to LBList set method.\n");
		}
		
		if (index < size() - 1) {
			LLNode<T> current = front;
			for (int i = 0; i < index; i++) {
				current = current.getLink();
			}
			return current.getInfo();
		}
		return rear.getInfo();
	}

	public int indexOf(T target) {	
		find(target);
		
		if (found) {
			return targetIndex;
		} else {
			return -1;
		}
	}
	/*
	    int index = 0;
	   
		LLNode<T> current = front;

	    while (current != null) {
	        if (current.equals(target)) {
	            return index;
	        }
	        index++;
	        current.setLink(current.getLink());
	    }
		return -1;
	}
	*/
	
	public void removeAll(T target) {
		front = null; 
	}
	/**********************************************************************************************/

	
}
