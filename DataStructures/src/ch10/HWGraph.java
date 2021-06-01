package ch10;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class HWGraph {
	
	public static void main(String[] args) {
			
		Graphs graph = new Graphs();
			
		graph.addVertex("Dallas");
		graph.addVertex("Austin");
		graph.addVertex("Chicago");
		graph.addVertex("Denver");
		graph.addVertex("Houston");
		graph.addVertex("Washington");
		graph.addVertex("Atlanta");	
		
		graph.addEdge("Dallas", "Austin");
		graph.addEdge("Dallas", "Denver");
		graph.addEdge("Austin", "Dallas");
		graph.addEdge("Chicago", "Austin");
		graph.addEdge("Denver", "Chicago");
		graph.addEdge("Houston", "Denver");
		graph.addEdge("Atlanta", "Houston");
		graph.addEdge("Atlanta", "Washington");
		graph.addEdge("Washington", "Atlanta");
		graph.addEdge("Washington", "Dallas");
			
		graph.printGraph();
		
		System.out.println(" ");
		
		System.out.println("Breadth First Traversal starting with Dallas: ");
		// System.out.println(BFT(graph, "Dallas"));
		
		System.out.println(" ");
	
		graph.removeEdge("Dallas", "Austin");
		graph.removeEdge("Dallas", "Denver");
		graph.removeEdge("Austin", "Dallas");
		graph.removeEdge("Washington", "Dallas");
		graph.removeVertex("Dallas");
		graph.printGraph();					
			
	}
}
