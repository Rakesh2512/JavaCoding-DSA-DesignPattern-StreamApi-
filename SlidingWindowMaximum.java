import java.util.ArrayList;
import java.util.PriorityQueue;

class pair{
	int first;
	int second;
	
	pair(int first,int second){
		
		this.first = first;
		this.second = second;
	}
}
public class SlidingWindowMaximum {

	public static ArrayList<Integer>solve_Optimize(int[] arr,int k){
		
		ArrayList<Integer>ans = new ArrayList<>();
		
		int n = arr.length;
		
		PriorityQueue<pair>pq = new PriorityQueue<>((a,b) -> b.first - a.first);
		
		for(int i =0;i<k;i++) {
			pq.add(new pair(arr[i],i));
		}
		
		ans.add(pq.peek().first);
		
		for(int i =k;i<n;i++) {
			pq.add(new pair(arr[i],i));
			
			while(pq.peek().second <= i-k) {
				pq.poll();
			}
			
			ans.add(pq.peek().first);
		}
		
		
		return ans;
		
	}
	public static ArrayList<Integer>solve_Naive(int[] arr,int k){
		ArrayList<Integer>ans = new ArrayList<>();
		
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		for(int i =0;i<=n-k;i++) {
			max = arr[i];
			
			for(int j=1;j<k;j++) {
				max = Math.max(max, arr[i+j]);
			}
			
			ans.add(max);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, k = 3;
		
		ArrayList<Integer>ans = solve_Optimize(arr,k);
		
		for(int it: ans) {
			System.out.print(it+" ");
		}

	}

}
