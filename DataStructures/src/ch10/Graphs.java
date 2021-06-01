package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graphs {
	
	private int numVertices;
	private Map<String, List<String>> adjVertices;
	
	public Graphs() {
		this.adjVertices = new HashMap<String, List<String>>();
	}
	
	public void addVertex(String label) {
		adjVertices.put(label, new ArrayList<String>());
	}
	
	public void addEdge(String v1, String v2) {
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}
	
	public void removeVertex(String vertex) {
		adjVertices.get(vertex).clear();
		adjVertices.remove(vertex);
		for (String v : adjVertices.keySet()) {
			adjVertices.get(v).remove(vertex);
		}
	}
	
	public void removeEdge(String v1, String v2) {
		List<String> v1_neighbors = adjVertices.get(v1);
		List<String> v2_neighbors = adjVertices.get(v2);
		if (v1_neighbors != null) {
			v1_neighbors.remove(v2);
		}
		if (v2_neighbors != null) {
			v2_neighbors.remove(v1);
		}
	}
	
	public List<String> getAdjList(String vertex) {
		return adjVertices.get(vertex); 
	}
	
	public void printGraph() {
		System.out.println("*** Adjacencey list of the graph ***");
		for (String v : adjVertices.keySet()) {
			System.out.println(v + "=>");
			System.out.println(adjVertices.get(v));
		}
		System.out.println("**************** END ****************");
	}

	public static Set<String> BFT(Graphs graph, String root) {
	    Set<String> visited = new LinkedHashSet<String>();
	    Queue<String> queue = new LinkedList<String>();
	    queue.add(root);
	    visited.add(root);
	    while (!queue.isEmpty()) {
	        String vertex = queue.poll();
	        for (String v : graph.getAdjList(vertex)) {
	            if (!visited.contains(v)) {
	                visited.add(v);
	                queue.add(v);
	            }
	        }
	    }
	    return visited;
	}
	
	public static Set<String> DFT(Graphs graph, String root) {
	    Set<String> visited = new LinkedHashSet<String>();
	    Stack<String> stack = new Stack<String>();
	    stack.push(root);
	    while (!stack.isEmpty()) {
	        String vertex = stack.pop();
	        if (!visited.contains(vertex)) {
	            visited.add(vertex);
	            for (String v : graph.getAdjList(vertex)) {              
	                stack.push(v);
	            }
	        }
	    }
	    return visited;
	}
	
}

