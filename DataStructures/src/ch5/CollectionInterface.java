package ch5;

import support.LLNode;

public interface CollectionInterface<T> {
	
	public boolean find(T target);

	public boolean remove(T target);
	
	public boolean contains(T target);
	
	public T get(T target);
	
	public boolean add(T element);
	
	public int count(T target);
	
	public void removeAll(T target);
	
	public boolean isFull();
	
	public boolean isEmpty();
	
	public int size();
}
