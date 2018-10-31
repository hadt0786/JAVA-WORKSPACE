package ds.graph;

public class App {

	public static void main(String[] args) {

		BetterGraph myGraph = new Betterraph(5,"directed");
		myGraph.addvertex("State");
		myGraph.addvertex("Avenel");
		myGraph.addvertex("Elm");
		myGraph.addvertex("Pocono");
		myGraph.addvertex("William");
		
		myGraph.addEdge("Avenel","Pocono");
		myGraph.addEdge("State","Elm");
		myGraph.addEdge("Elm","Avenel");
		myGraph.addEdge("Elm","William");
		myGraph.addEdge("William","State");
		myGraph.addEdge("William","Pocono");
		myGraph.addEdge("Pocono","Elm");
		myGraph.addEdge("State","Avenel");
		
		myGraph.print();
		
		//graph with 5 vertices
		//it is a DIRECTED GRAPH
//		
//		Graph myGraph = new Graph(5);
//		myGraph.addEdge(0,1);//0 vertice is connected to vertice 1 
//		myGraph.addEdge(0,2);//0 vertice is connected to vertice 2
//		myGraph.addEdge(0,3);//0 vertice is connected to vertice 3
//		myGraph.addEdge(1,2);//1 vertice is connected to vertice 2
//		myGraph.addEdge(1,4);//1 vertice is connected to vertice 4
//		myGraph.addEdge(2,3);//2 vertice is connected to vertice 3
//		myGraph.addEdge(3,1);//3 vertice is connected to vertice 1
//		myGraph.addEdge(4,0);//4 vertice is connected to vertice 0
//		myGraph.addEdge(4,3);//4 vertice is connected to vertice 3
//		
//		Object[]values = myGraph.adj(4);
//		for(Object val : values) {
//			System.out.println(val);
//		}
	}

}
