
public class UpperBound {
	
	public static int Upper_Bound(int a[],int n,int target) {
		
		int l = 0;
		int r = n-1;
		
		int ans = n;
		
		while(l<=r) {
			
			int mid = l + (r-l)/2;
			
			if(a[mid] > target) {
				ans = mid;
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3};
		int n = a.length;
		
		int target = 2;
		
//		for(int i=0;i<n;i++) {
//			if(a[i] > target) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		int index = Upper_Bound(a,n,target);
		
		System.out.println(index);

	}

}
