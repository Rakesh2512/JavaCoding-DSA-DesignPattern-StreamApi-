import java.util.HashMap;
import java.util.Map;

public class appearingMoreThanNKTimes {

	
	public static void BruteForceApproach(int[] arr,int n,int k) {
		
		int count = 0;
		for(int i=0;i<n;i++) {
			
			count = 1;
			while((i+1)<n && arr[i] == arr[i+1]) {
				count++;
				i++;
			}
			
			if(count >  (n/k)) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static int secondApproach(int[] arr,int n,int k) {
		
		Map<Integer,Integer>mp = new HashMap<>();
		
		for(int it: arr) {
			if(mp.containsKey(it)) {
				mp.put(it, mp.get(it)+1);
			}
			else {
				mp.put(it,1);
			}
		}
		
		for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
			if(it.getValue() > n/k) {
				return it.getKey();
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
	    int N = arr.length;
	    int K = 4;
	    
	    
	    //BruteForceApproach(arr,N,K);
	    
	    System.out.println(secondApproach(arr,N,K));

	}

}
