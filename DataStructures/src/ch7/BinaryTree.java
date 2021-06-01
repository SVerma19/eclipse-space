package ch7;

import java.util.LinkedList;
import java.util.Queue;

import support.Node;

public class BinaryTree {
	Node root; // starting node of the tree
	
	// inserting element:
	// first, we have to find the place where we want to add a new node in order to keep the tree sorted.
	// we follow the rules starting from the root node:
		// if the new node's value is lower than the current node's, we go to the left child
		// if the new node's value is greater than the current node's, we go to the right child
		// when the current node is null, we've reached a leaf node and we can insert the new node in that position
	
	private Node add(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		
		if (value < current.value) {
			current.left = add(current.left, value);
		} else if (value > current.value) {
			current.right = add(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}
	
	
	public void addNode(int value) {
		root = add(root, value);
	}
	
	// finding an element: check if the tree contains a specific value
	// create a recursive method that traverses the tree
	
	// we're searching for the value by comparing it to the value in the current node
	// then continue in the left or right child depending on that.
	
	private boolean contains(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		if (value < current.value) {
			return contains(current.left, value);
		} else {
			return contains(current.right, value);
		}
	}
	
	public boolean containsNode(int value) {
		return contains(root, value); // search from root node.
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	private int findSmallestValue(Node root) {
		if (root == null) {
			throw new ItemNotFoundException();
		}
		if (root.left == null) {
			return root.value;
		} else {
			return findSmallestValue(root.left);
		}
	}
	
	static int maxValue(Node node) {  
	    Node current = node; 
	    
	    while (current.right != null) { 
	        current = current.right; 
	    }
	    return (current.value); 
	} 
	
	int findSize(Node node) { 
		if (node == null) {
			return 0; 
		} else {
			return(findSize(node.left) + 1 + findSize(node.right)); 
	    } 
	}
	
	public int min() {
		return findSmallestValue(root);
	}
	
	public int max() {
		return maxValue(root);
	}
	
	public int size() {
		return findSize(root);
	}
	

	
	// pre-oder traversal visits first the root node, then the left subtree, and finally the right subtree
	public void traversalPreOrder(Node node) {
		if (node != null) {
			System.out.println(" " + node.value);
			traversalPreOrder(node.left);
			traversalPreOrder(node.right);
		}
	}
	
	// in-order traversal: left subtree —> root —> right subtree
	public void traverseInOrder(Node node) {
		if (node != null) {
			traversalPreOrder(node.left);
			System.out.println(" " + node.value);
			traversalPreOrder(node.right);
		}
	}
	
	
	// post-order traversal: left subtree —> right subtree —> root
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversalPreOrder(node.left);
			traversalPreOrder(node.right);
			System.out.println(" " + node.value);
		}
	}
	
	public void DFS() {
		System.out.println("InOrder traversal:");
		traverseInOrder(root);	
		System.out.println("\nPreOrder traversal:");
		traversalPreOrder(root);	
		System.out.println("\nPostOrder traversal:");
		traversePostOrder(root);	
	}
	
	// breadth-first search: visit all the nodes of a level before going to the next level.
	// for the implementation, we use a Queue to hold the nodes from each level in order.
	// we'll extract each node from the list, print its values, then add its children to the queue.
	
	public void BFS() {
		if (root == null) {
			return;
		}
		
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		
		while (!nodes.isEmpty()) {
			Node node = nodes.remove();
			System.out.println(" " + node.value);
			if (node.left != null) {
				nodes.add(node.left);
			}
			if (node.right != null) {
				nodes.add(node.right);
			}
		}
		
	}

}
