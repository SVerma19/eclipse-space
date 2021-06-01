package ch6;

import java.util.*;
import ch5.CollectionInterface;

public interface ListInterface<T> extends CollectionInterface<T> {

		void add(int index, T element);
		
		T set(int index, T newElement);
		
		T get(int index);
		
		int indexOf(T target);
		
		T remove(int index);
		
} 