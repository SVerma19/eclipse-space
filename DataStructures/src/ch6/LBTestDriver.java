package ch6;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LBTestDriver {
	
	public static void main(String[] args) {
		LBList<String> list = new LBList<String>();
	
		/*
		list.add("A");
		list.add(”B”);
		list.add(“C”);
		list.add(“D”);
		list.add(“E”);
		*/
		
		System.out.print("Element at index 2: " + list.get(2));
		
		System.out.print(list.indexOf("D"));
		
		list.set(3, "F");

		System.out.println(list);

		list.removeAll(null);
		
		System.out.println(list);
	}
}