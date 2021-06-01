package ch5;

import java.util.*;

public class LLTestDriver {
	
	public static void main(String[] args) {
		CollectionInterface<String> LLSet = new LLSet<String>();
		
		LLSet.add("A");
		LLSet.add("B");
		LLSet.add("C");
		LLSet.add("A");
		LLSet.add("B");
		LLSet.add("D");
		LLSet.add("E");
		LLSet.add("A");
		
		System.out.println(LLSet);
		
		LLSet.remove("A");
		
		System.out.println(LLSet);

	}
}
