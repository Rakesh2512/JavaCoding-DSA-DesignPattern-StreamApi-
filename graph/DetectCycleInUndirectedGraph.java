package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
	int source;
	int parent;
	
	Pair(int source,int parent){
		this.source = source;
		this.parent = parent;
	}
}
public class DetectCycleInUndirectedGraph {
	
	public static boolean bfs(int srcNode,ArrayList<ArrayList<Integer>>edge,boolean[] visit,int par) {
		
		visit[srcNode] = true;
		
		Queue<Pair>q = new LinkedList<>();
		
		q.add(new Pair(srcNode,par));
		
		
		while(!q.isEmpty()) {
			
			Pair curr = q.poll();
			int src = curr.source;
			int pr = curr.parent;
			
			for(int it: edge.get(src)) {
				if(visit[it] == false) {
					visit[it] = true;
					q.add(new Pair(it,src));
				}
				else if(it != pr) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean Detect(int V,ArrayList<ArrayList<Integer>>edge) {
		
		boolean[] visit = new boolean[V];
		Arrays.fill(visit, false);
		
		for(int i =0;i<V;i++) {
			if(visit[i] == false) {
				if(bfs(i,edge,visit,-1)== true) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>>edge = new ArrayList<>();
		int V = 6;
		
		for(int i =0;i<V;i++) {
			edge.add(new ArrayList<>());
		}
		
		edge.get(1).add(2);
		edge.get(2).add(1);
		edge.get(2).add(3);
		edge.get(3).add(2);
		edge.get(3).add(4);
		edge.get(4).add(3);
		edge.get(4).add(2);
		edge.get(2).add(4);
		
		DetectCycleInUndirectedGraph sol = new DetectCycleInUndirectedGraph();
		
		
		boolean ans = sol.Detect(V,edge);
		
		if(ans == true) {
			System.out.println("Graph is Cyclic");
		}
		else {
			System.out.println("Graph is not Cyclic");
		}
	}

}
