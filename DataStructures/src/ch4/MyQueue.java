package ch4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> s1 = new Stack<Integer>();  
    Stack<Integer> s2 = new Stack<Integer>(); 
    
    private int first;

	public void push(int x) {  
		s1.push(x);
	}
	
	
	public int pop() {
		if (s2.isEmpty()) {
			while(!s1.isEmpty()) {
				int popped = s1.pop(); 
				s2.push(popped);
			}
		}
		return s1.pop();
	}
	
	
	public int peek() {
		if (!s2.isEmpty()) {
			s2.peek();
		}
		return s2.peek();
	}
	

	public boolean empty() {
		 return s1.isEmpty() && s2.isEmpty();
	}
	
	
	public static void main(String[] args ) {
		MyQueue obj = new MyQueue();
		
		obj.push(20);
		System.out.println(obj);
		
		int param_1 = obj.pop();
		int param_2 = obj.peek();
		
		boolean param_4 = obj.empty();
		 
	}
}



