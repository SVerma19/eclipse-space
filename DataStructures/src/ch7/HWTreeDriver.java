package ch7;

public class HWTreeDriver {
	
	public static void main (String args[]) {
		BinaryTree bt = new BinaryTree();
		
		bt.addNode(70);
		bt.addNode(43);
		bt.addNode(79);
		bt.addNode(30);
		bt.addNode(44);
		bt.addNode(76);
		bt.addNode(16);
		bt.addNode(35);
		bt.addNode(77);
		
		System.out.println("BreadthFirst travsersal: ");
		bt.BFS();
		
		System.out.println(" ");

		bt.DFS();
		
		System.out.println(" ");
		
		System.out.println("Size of the BST: " + bt.size() + "\n");
		System.out.println("The smallest element in the BST: " + bt.min() + "\n");
		System.out.println("The largest elements in BST: " + bt.max());

	}
	
}

