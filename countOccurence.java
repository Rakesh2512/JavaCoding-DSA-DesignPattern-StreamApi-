
public class countOccurence {

	
	public static int searchFirst(int a[], int n , int target) {
		
		int l = 0;
		int r = n-1;
		
		int index = -1;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == target) {
				index = mid;
				r = mid-1;
			}
			else if(a[mid] < target) {
				l = mid+1;
			}
			else {
				r = mid -1;
			}
		}
		
		return index;
				
	}
public static int searchSecond(int a[], int n , int target) {
		
		int l = 0;
		int r = n-1;
		
		int index = -1;
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == target) {
				index = mid;
				l = mid+1;
			}
			else if(a[mid] > target) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		
		return index;
				
	}
	public static void main(String[] args) {
		
		
		int[] a = {2, 2 , 3 , 3 , 3 , 3 , 4};
		
		int target = 3;
		
		int findFirst = searchFirst(a,a.length,target);
		int Last = searchSecond(a,a.length,target);
		
		System.out.println(findFirst+" "+Last+" and total occurence is : "+(Last - findFirst+1));

	}

}
