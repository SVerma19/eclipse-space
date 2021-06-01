package ch2;

import support.*;

public class LinkedStack<T> implements StackInterface<T> {

	protected LLNode<T> top;

	public LinkedStack() {
		top = null;
	}

	
	public void push(T element) {
		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(top);
		top = newNode;
	}

	
	public void pop() throws StackUnderflowException {
		if (isEmpty())
			throw new StackUnderflowException("Pop attempted on an empty stack.");
		else
			top = top.getLink();
	}

	
	public T top() throws StackUnderflowException {
		if (isEmpty())
			throw new StackUnderflowException("Top attempted on an empty stack");
		else
			return top.getInfo();
	}

	
	public boolean isEmpty() {
		return (top == null);
	}

	
	public boolean isFull() {
		return false;
	}
	
	
	public int Search(String element) {
		int count = 1;
		LLNode<T> currNode = top;
		while (currNode != null) {
			if (currNode.getInfo() == element) {
				break;
			} else {
				count++;
				currNode = currNode.getLink();

			}

		}
		return count;

	}

	public void printElements() {
		LLNode<T> currNode = top;
		while(currNode!=null) {
			System.out.println(currNode.getInfo());
			currNode = currNode.getLink();
		}
	}

	
	public int printSize() {
		int count = 0;
		LLNode<T> currNode = top;
		while (currNode != null) {
			currNode = currNode.getLink();
			count++;
		}
		return count;
	}



}
