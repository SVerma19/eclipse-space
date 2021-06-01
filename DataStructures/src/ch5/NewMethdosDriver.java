package ch5;

import java.util.*;

public class NewMethdosDriver {
	
	public static void main(String[] args) {
		CollectionInterface<String> LLCollection = new LLCollection<String>();
		
		LLCollection.add("A");
		LLCollection.add("B");
		LLCollection.add("C");
		LLCollection.add("A");
		LLCollection.add("B");
		LLCollection.add("D");
		LLCollection.add("E");
		LLCollection.add("A");
		
		System.out.println("Count of A: " + LLCollection.count("A"));
		System.out.println("Count of B: " + LLCollection.count("B"));
		
		LLCollection.removeAll("A");
		
		System.out.println("Count of A after remove: " + LLCollection.count("A"));
	}
}
