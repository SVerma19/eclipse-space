package ch6;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaTestDriver {
	
	public static void main(String[] args) {
		List list = new LinkedList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		int indexD = list.indexOf("D");
		System.out.println("Index of D: " + indexD);
		
		System.out.println("Element at index 2: " + list.get(3));
		
		list.set(3, "F");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		System.out.println(list);
		
	}
}
