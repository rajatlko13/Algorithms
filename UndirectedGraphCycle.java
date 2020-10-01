import java.io.*; 
import java.util.*; 

class UndirectedGraphCycle 
{ 
	private int V; 
	private LinkedList<Integer> adj[]; 

	UndirectedGraphCycle(int v) { 
		V = v; 
		adj = new LinkedList[v]; 
		for(int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	void addEdge(int v,int w) { 
		adj[v].add(w); 
		adj[w].add(v); 
	} 

	Boolean isCyclicUtil(int v, Boolean visited[], int parent) 
	{  
		visited[v] = true; 
		Integer i; 
 
		Iterator<Integer> it = adj[v].iterator(); 
		while (it.hasNext()) 
		{ 
			i = it.next(); 

			if (!visited[i]) 
			{ 
				if (isCyclicUtil(i, visited, v)) 
					return true; 
			} 

			else if (i != parent) 
				return true; 
		} 
		return false; 
	} 

	Boolean isCyclic() 
	{ 
		Boolean visited[] = new Boolean[V]; 
		for (int i = 0; i < V; i++) 
			visited[i] = false; 

		for (int u = 0; u < V; u++) 
			if (!visited[u]) 
				if (isCyclicUtil(u, visited, -1)) 
					return true; 

		return false; 
	} 


	public static void main(String args[]) 
	{ 
		UndirectedGraphCycle g = new UndirectedGraphCycle(5); 
		g.addEdge(1, 0); 
		g.addEdge(0, 2); 
		g.addEdge(2, 1); 
		g.addEdge(0, 3); 
		g.addEdge(3, 4); 
		if(g.isCyclic()) 
			System.out.println("Graph has cycle"); 
		else
			System.out.println("Graph doesn't have any cycle"); 
	} 
} 
