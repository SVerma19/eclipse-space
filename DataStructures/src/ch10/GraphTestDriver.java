package ch10;

public class GraphTestDriver {

	public static void main(String[] args) {
		
		Graphs graph = new Graphs();
		
		graph.addVertex("Bob");
		graph.addVertex("Alice");
		graph.addVertex("Mark");
		graph.addVertex("Rob");
		graph.addVertex("Maria");
		
		graph.addEdge("Bob", "Alice");
		graph.addEdge("Bob", "Rob");
		graph.addEdge("Alice", "Mark");
		graph.addEdge("Alice", "Maria");
		graph.addEdge("Maria", "Rob");
		graph.addEdge("Rob", "Maria");
		
		graph.printGraph();	
		
	}
}
