package ch7;

public class TreeDriver {

	public static void main (String args[]) {
		BinaryTree bt = new BinaryTree();
		
		bt.addNode(6);
		bt.addNode(4);
		bt.addNode(8);
		bt.addNode(3);
		bt.addNode(5);
		bt.addNode(7);
		bt.addNode(9);
		
		System.out.println(bt.containsNode(6));
		System.out.println(bt.containsNode(16));
		
		System.out.println(bt.min());
		
		bt.DFS();
		
		bt.BFS();
	}
	
}
