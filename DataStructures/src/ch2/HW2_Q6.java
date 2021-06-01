package ch2;

import java.util.Stack;
import support.LLNode;

/****************** LOOK AT AGAIN ******************/

public class HW2_Q6 {
	
	public static void main(String[] args) {
		StackInterface<Integer> numbers = new LinkedStack<Integer>();
			
		numbers.push(5);
		numbers.push(7);
		numbers.push(-9);
		
		LLNode<Integer> temp = ((LLNode<Integer>) numbers);
		
		/****************** A ******************/
		int sum = 0;

		while (temp !=null ){
			sum += temp.getInfo();
			temp = temp.getLink();
		}
		System.out.println(sum);	
		
		
		/****************** B ******************/
		int count = 0;

		while (temp != null){
			count++;
			temp = temp.getLink();
		}
		System.out.println(count);
		
		
		/****************** C ******************/
		int count21 = 0;

		while(temp != null){
			if (temp.getInfo() >= 0){
				count21++;
				temp = temp.getLink();
		    }          
		}
		System.out.println(count21);
		
		
		/****************** D ******************/
		int index = 0;
		
		while (temp != null) {
			index++;
			System.out.println(index + ".\t" + temp.getInfo());
			temp = temp.getLink();
		}
		

		/****************** E ******************/
		Stack<Integer> stack = new Stack<Integer>();

		while (temp != null) {
			stack.push(temp.getInfo());
		    temp = temp.getLink();
		}
		
		int index21 = 0;

		while (stack.isEmpty() != true) {
			index++;
			int number = stack.pop();
			System.out.println(index + number);

		}
	}
}