package ds.graph;

public class BetterGraph {
	
	Vertex[] arrayOfLists;
	int indexCounter = 0; 
	boolean undirected = true;
	
	class Node{
		public int vertexidx;
		public Node next;
		public Node(int vertexIdx, Node node){
			this.vertexidx = vertexIdx;
			next = node;
		}
	}
	class Vertex {
		String name;
		Node adjList;
		Vertex(String name, Node aNode){
			
			this.name = name;
			this.adjList = aNode;
		}
	}
	
	public BetterGraph(int vCount, String graphtype) {
		if(graphtype.equals("directed")) {
			undirected = false;
		}
		arrayOfLists = new Vertex[vCount];
	}
	
	public void addVertex(String vertexName) {
		arrayOfLists[indexCounter] = new Vertex(vertexName, null);
		indexCounter++;
	}
	public void addEdge(String srcVertexName, String destVertexName) {
		int v1Idx = indexForName(srcVertexName);
		int v2Idx = indexForName(srcVertexName);
		
		arrayOfLists[v1Idx].adjList = new Node(v2Idx, arrayOfLists[v1Idx].adjList);
		if(undirected) {
			arrayOfLists[v2Idx].adjList = new Node(v1Idx, arrayOfLists[v2Idx].adjList );
		}
	}
	public int indexForName(String name) {
		for(int v = 0; v<arrayOfLists.length;v++) {
			if(arrayOfLists[v].name.equals(name)) {
				return v;
			}
		}
		return -1;
	}
	
	public void print() {
		System.out.println();
		for(int v =0 ; v<arrayOfLists.length;v++) {
			System.out.println(arrayOfLists[v].name);
			for(Node aNode = arrayOfLists[v].adjList;aNode!=null;aNode = aNode.next) {
				System.out.println("-->"+arrayOfLists[aNode.vertexidx].name);
			}
			System.out.println("\n");
		}
	}

}
