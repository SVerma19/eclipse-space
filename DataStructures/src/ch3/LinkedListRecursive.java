package ch3;

import support.LLNode;

public class LinkedListRecursive<T> {
	
	protected LLNode<T> top;
	
	static void recPrintList(LLNode<String> listRef) {
		// Using recursive solution to print node info
		if (listRef != null) {
			System.out.println(listRef.getInfo());
			recPrintList(listRef.getLink());
		}
	}
	
	static void itePrintList(LLNode<String> listRef) {
		// Using iterative solution to print node info
		while (listRef != null) {
			System.out.println(listRef.getInfo());
			listRef = listRef.getLink();
		}
	}
	
	static int recListSize(LLNode<String> listRef) {
		// Returns the size of listRef linked list using recursive
		if (listRef == null) {
			return 0; 
		} else {
			return (1 + recListSize(listRef.getLink())); 
		}
	}
	
	static int iteListSize(LLNode<String> listRef) {
		// Returns the size of listRef linked list using iterative
		int size = 0;
		
		while (listRef != null) {
			size = size + 1;
			listRef = listRef.getLink(); 
		}
		return size; 
	}

	
	static void recRevPrintList(LLNode<String> listRef) {
		// Prints the reversed info of the linked list using recursive
		if (listRef != null) {
			recRevPrintList(listRef.getLink());
			System.out.println(listRef.getInfo()); 
		}
	}
	
	/*
	static void iteRevPrintList(LLNode<String> listRef) {
		// Prints the reversed info of the linked list using iterative
		
	}
	*/
	
	public static void main(String[] args) {
		LLNode<String> temp1, temp2, temp3, temp4, temp5;
		temp1 = new LLNode<String>("alpha");
		temp2 = new LLNode<String>("beta");
		temp3 = new LLNode<String>("comma");
		temp4 = new LLNode<String>("delta");
		temp5 = new LLNode<String>("emma");
		
		LLNode<String> multilist = temp1;
		temp1.setLink(temp2);
		temp2.setLink(temp3);
		temp3.setLink(temp4);
		temp4.setLink(temp5);
		
		System.out.println("recursive print: "); 
		recPrintList(multilist);
		System.out.println(" "); 
		System.out.println("iterative print: "); 
		itePrintList(multilist);
		System.out.println(" "); 
		System.out.println("recursive print size: "); 
		recListSize(multilist);
		System.out.println(" "); 
		System.out.println("iterative print size: "); 
		iteListSize(multilist);
		System.out.println(" "); 
		System.out.println("recursive print revsered order: "); 
		recRevPrintList(multilist);
		// System.out.println(" "); 
		// System.out.println("iterative print revsered order: "); 
		// iteRevPrintList(multilist);
	}

}