package ch2;

import java.util.Stack;

public class HW2_Q3 {
	
	public static void main(String[] args) {
		Stack<String> pez = new Stack<String>();
		Stack<String> newPez = new Stack<String>();

		pez.push("blue");
		pez.push("yellow");
		pez.push("green");
		pez.push("yellow");
		pez.push("yellow");
		pez.push("red");
		System.out.println(pez);
		
		while (pez.isEmpty() != true) {
			String candy = pez.peek();
			
			if (candy == "yellow") {
				pez.pop();
			} else {
				newPez.push(candy);
				pez.pop();
			}	
		}
		System.out.println(newPez); // Reverse order of stack
	} 
}
