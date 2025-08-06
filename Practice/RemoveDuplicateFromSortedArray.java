package Practice;

public class RemoveDuplicateFromSortedArray {

	public static int solve(int[] a,int n) {
		
		int index = 1;
		
		for(int i =1;i< n;i++) {
			if(a[i] != a[i-1]) {
				a[index] = a[i];
				index++;
			}
		}
		return index;
		
	}
	public static void main(String[] args) {
		
		
		int[] a = {1,2,2,5,7,7};
		
		int n = a.length;
		
		int length = solve(a,n);
		
		
		for(int i =0;i<length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
