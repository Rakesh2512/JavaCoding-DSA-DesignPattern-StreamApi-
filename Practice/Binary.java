package Practice;

public class Binary {

	public static int binarySearchSecond(int[] a ,int target) {
		int l = 0;
		int r = a.length-1;
		int ans = -1;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == target) {
				ans = mid;
				l = mid+1;
			}
			else if(a[mid] > target) {
				r = mid -1;
			}
			else {
				l = mid +1;
			}
		}
		return ans;
	}
	public static int binarySearchFirst(int[] a ,int target) {
		int l = 0;
		int r = a.length-1;
		int ans = -1;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == target) {
				ans = mid;
				r = mid-1;
			}
			else if(a[mid] > target) {
				r = mid -1;
			}
			else {
				l = mid +1;
			}
		}
		return ans;
	}
	public static int binarySearch_(int a[],int target) {
		int f = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i] == target) {
				f = i;
				break;
			}
		}
		int s = 0;
		for(int j = a.length-1;j>=0;j--) {
			if(a[j] == target) {
				s = j;
				break;
			}
		}
		
		return s-f+1;
	}
	public static void main(String[] args) {
		
		int[] a = {2, 2 , 3 , 3 , 3 , 3 , 4};
		
		int n = a.length;
		int target = 3;
		int f = binarySearchFirst(a,target);
		int s = binarySearchSecond(a,target);
		
		System.out.println(s-f+1);

	}

}
