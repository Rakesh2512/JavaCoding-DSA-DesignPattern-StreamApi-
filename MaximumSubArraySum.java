
public class MaximumSubArraySum {

	public static int max_sub_array(int [] a,int n) {
		int curr_sum = a[0];
		int maxSum = a[0];
		
		for(int i =1;i<n;i++) {
			
			curr_sum = Math.max(a[i], curr_sum+a[i]);
			maxSum = Math.max(maxSum, curr_sum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		
		int[] a = {2, 3, -8, 7, -1, 2, 3};
		
		
		int n = a.length;
		
		int ans = max_sub_array(a,n);
		System.out.println(ans);
	}

}
