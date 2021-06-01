package ch5;

import java.util.*;

public class ArrayTestDriver {
	
	public static void main(String[] args) {
		CollectionInterface<String> arraySet = new ArraySet<String>();
		
		arraySet.add("A");
		arraySet.add("B");
		arraySet.add("C");
		arraySet.add("A");
		arraySet.add("B");
		arraySet.add("D");
		arraySet.add("E");
		arraySet.add("A");
		
		System.out.println(arraySet);
		
		arraySet.remove("A");
		
		System.out.println(arraySet);

	}
}