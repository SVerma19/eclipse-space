package homework;

public class DrawTree {
	
	private Node root;
	
	private static class Node {
		Node left;
		Node right;
		int data;
		Node (int newData) {
			right = null;
			left = null;
			data = newData;
		}
	}
	
	public void BinaryTree() {
		root = null;
	}
	
	public boolean lookup(int data) {
		return(lookup(root, data));
	}
	
	private boolean lookup(Node node, int data) {
		if (node == null) {
			return(false);
		}
		if (data == node.data) {
			return(true);
		} else if (data<node.data) {  
			return(lookup(node.left, data));
		} else {
			return(lookup(node.right, data));
		}
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			node.right = insert(node.right, data);
		}
		return(node);
	}
	
	

}
