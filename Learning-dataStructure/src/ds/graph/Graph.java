package ds.graph;

import java.util.ArrayList;

public class Graph {
	
	private int vCount; // number of vertices 
	private int eCount; //number of edges
	
	private ArrayList[] adjacents;//array of Integer list

	public Graph(int vCount, int eCount, ArrayList[] adjacent) {
		
		this.vCount = vCount;
		this.eCount = eCount;
		adjacents = new ArrayList[vCount];
		
		for(int i =0; i<vCount;i++) {
			adjacents[i] = new ArrayList<Integer>();
		}
	}
	public int getVertexCount(){
		return vCount;
	}
	public int getEdgeCount() {
		return eCount;
	}
	public void addEdge(int src , int dest) {
		adjacents[src].add[dest];
		eCount++;
	}
	public Object[] adj(int src) {
		return adjacents[src].toArray();
	}
}
