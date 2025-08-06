
public class LowerBound {

	
	public static int lowerBounde(int a[],int n,int target) {
		int l = 0;
		int r = n-1;
		
		int ans = n;
		while(l<=r) {
			int mid = l+(r-l)/2;
			
			if(a[mid] >= target) {
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
		
		int[] a = {3,5,8,15,19};
		
		int n = a.length;
		
		int target = 9;
		
//		for(int i =0;i<n;i++) {
//			if(a[i] >= target) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		int index= lowerBounde(a,n,target);
		
		System.out.println(index);

	}

}
