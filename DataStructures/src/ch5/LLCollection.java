package ch5;

import support.LLNode;

public class LLCollection<T> implements CollectionInterface<T>{
	protected T[] elements; 
	protected int numElements = 0; 
	protected LLNode<T> location;
	protected LLNode<T> head;
	protected LLNode<T> previous;
	protected boolean found = false;

	
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
		LLNode<T> newNode = new LLNode<T>(element);
		
		newNode.setLink(head);
		head = newNode;
		
		numElements++;
		return true;
	}
	
	
	public T get(T target) {
		if (found) {
			return target;
		} else {
			return null;
		}
	}
	
	
	public int count(T target){
		LLNode<T> temp = head;
		
		int count = 0;

		while (temp != null) {
			if (temp.getInfo().equals(target)) {
				count++;
			}
		}	
		return count;
	}
	
	
	public void removeAll(T target){
		LLNode<T> temp = head;

		while (temp != null) {
			if (temp.getInfo().equals(target)) {
				temp.setLink(temp.getLink());
			} else {
				temp = temp.getLink();
	        }
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


}
