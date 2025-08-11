package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
	
	public static void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>>adj,Stack<Integer>st) {
		
		visited[node] = true;
		for(int it : adj.get(node)) {
			if(!visited[it]) {
				dfs(it,visited,adj,st);
			}
		}
		
		st.add(node);
	}
	
	public static List<Integer>topoSort(int V,ArrayList<ArrayList<Integer>>adj){
		
		List<Integer>ans = new ArrayList<>();
		
		boolean[] visited = new boolean[V];
		Stack<Integer>st = new Stack<>();
		
		for(int i =0;i<V;i++) {
			if(!visited[i]) {
				dfs(i,visited,adj,st);
			}
		}
		
		while(!st.isEmpty()) {
			int value = st.pop();
			ans.add(value);
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int V = 6;
		
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		
		for(int i =0;i<V;i++) {
			adj.add(new ArrayList<>());
		}
		
		// Example Graph
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        List<Integer> topoOrder = topoSort(V, adj);
        System.out.println("Topological Order: " + topoOrder);

	}

}
