package support;

// a node includes value, its left node and right node

public class Node {
	public int value; // value of the node
	public Node left; // left node
	public Node right; // right node
	
	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}

}
