import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] a = {3,2,1,5,6,4};
		
		int n = a.length;
		
		PriorityQueue<Integer>pq = new PriorityQueue<>((aa,bb) -> bb-aa);
		
		for(int i =0;i<n;i++) {
			pq.offer(a[i]);
		}
		
		
		while(!pq.isEmpty()) {
			int x = pq.poll();
			System.out.println(x);
		}

	}

}
