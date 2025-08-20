
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
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
	    int N = arr.length;
	    int K = 4;
	    
	    
	    BruteForceApproach(arr,N,K);

	}

}
