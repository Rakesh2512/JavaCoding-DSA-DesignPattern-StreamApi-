
public class MissingValueFromSortedArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,9};
		
		int n = a.length;
		
		for(int i = 0;i<n-1;i++) {
			if((a[i]+1) != a[i+1]) {
				System.out.println(a[i]+1);
			}
		}
	}

}
