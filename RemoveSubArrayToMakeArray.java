import org.hibernate.internal.build.AllowSysOut;

public class RemoveSubArrayToMakeArray {
	
	public static int solve(int[] a, int n) {
		
		int minLen = Integer.MAX_VALUE;
		
		int left = 0;
		int right = n-1;
		
		// first will check from left side
		
		while(left < right && a[left] <= a[left+1]) {
			left++;
		}
		
		if(left == n-1) {
			return 0;
		}
		
		
		// second will check from right side
		
		while(left < right && a[right] >= a[right-1]) {
			right--;
			
		}
		
		minLen = Math.min(minLen,n-left-1);
		// now will check from middle
		
		int j = right;
		
		for(int i = 0;i<left+1;i++) {
			
			if(a[i] <= a[j]) {
				minLen = Math.min(minLen,j-i-1);
			}
			else if(j < n - 1) {
				j++;
			}
			else {
				break;
			}
		}
		
		
		return minLen;
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {5, 4, 3, 2, 1};
		
		int n = a.length;
		
		int ans = solve(a,n);
		
		System.out.println(ans);

	}

}
