package ch4;

import java.util.LinkedList;
import java.util.Queue;

public class RepeatStringsJAVA {

	public static void main(String[] args ) {
		Queue<String> javaQueue = new LinkedList<String>();
		
		javaQueue.add("Hello");
		javaQueue.add("World");
		
		System.out.println(javaQueue);
		System.out.println(" ");
		
		for (String s : javaQueue) {
			System.out.println(s.toString());
		}
	
	}
}

