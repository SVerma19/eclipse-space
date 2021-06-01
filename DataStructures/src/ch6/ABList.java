package ch6;

public class ABList<T> implements ListInterface<T> {
	protected T[] elements; // array that holds queue elements
	protected int numElements = 0; // number of elements in the list
	protected final int DEFCAP = 100; // fault capacity
	protected int origiCap; // original cap
	protected boolean found = false; // true if found, otherwise false
	protected int location; // indicated location of target if found

	
	public ABList() {
		elements = (T[]) new Object[DEFCAP];
		origiCap = DEFCAP;
	}
	
	public ABList(int origiCap) {
		elements = (T[]) new Object[origiCap];
		this.origiCap = origiCap;
	}
	
	
	protected void enlarge() {
	// Increments the capacity of the list by an amount equal to the original capacity
		
		// Creates a larger array
		T[] larger = (T[]) new Object[elements.length + origiCap];
		
		// Copy the contents from the smaller array into the larger array
		for (int i = 0; i < numElements; i++) {
			larger[i] = elements[i];
		}
		
		// Reassign elements reference
		elements = larger;
	}

	
	public T set(int index, T newElement) {
	// Throws IndexOutOfBoundsException if passed an index argument
	// such that index < 0 or index >= size().
	// Otherwise, replaces element on this list at position index with
	// newElement and returns the replaced element.

		if ((index < 0) || (index >= size())) {
			throw new IndexOutOfBoundsException("Illegal index of " + index + " passed to ABList set method.\n");
		} 
		
		T hold = elements[index];
		elements[index] = newElement;
		return hold;
	}
	
		
	
	// IN PROGRESS
	public void add(int index, T element) {
	// Throws IndexOutOfBoundsException if passed an index argument
	// such that index < 0 or index > size().
	// Otherwise, adds element to this list at position index; all current
	// elements at that position or higher have 1 added to their index.
	// Optional. Throws UnsupportedOperationException if not supported.
	
		if ((index < 0) || (index > size())) {
			throw new IndexOutOfBoundsException("Illegal index of " + index + " passed to ABList add method.\n");
		}
		
		if (numElements == elements.length ) {
			enlarge();
		}
		
		for (int i = numElements; i > index; i--) {
			elements[i] = elements[i-1];
			numElements++;
		}
		
		elements[index] = element;
		numElements++;
	}
	
	
	public boolean remove(T target) {
		find(target);
		
		if (found == true) {
			for (int i = location; i <= numElements - 2; i++) {
				elements[i] = elements[i+1];
			}
			
			elements[numElements - 1] = null;
			numElements--;
		}
		return found;
	}
	

	public int indexOf(T target) {
		find(target);
		
		if (found) {
			return location;
		} else {
			return -1;
		}
	}
	
	
	public T remove(int index) {
		if ((index < 0) || (index >= size())) {
			throw new IndexOutOfBoundsException("Illegal index of " + index + " passed to ABList remove method.\n");
		} 
		
		T hold = elements[index];
		
		for (int i = index; i < numElements -1; i++) {
			elements[i] = elements[i+1];
		}
		
		elements[numElements - 1] = null;
		numElements--;
		return hold;
	}
	
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
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
	
	

	
	/********************* From CollectionInterface *********************/
	public boolean add(T element) {
		if (numElements == elements.length) {
			enlarge();
		}
			
		elements[numElements] = element;
		numElements++;
		return true;
	}
	
	
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
	

	public T get(T target) {
		find(target);
		
		if (found == true) {
			return elements[location];
		} else {
			return null;
		}
	}
	

	public boolean contains(T target) {
		find(target);
		
		return found;
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
