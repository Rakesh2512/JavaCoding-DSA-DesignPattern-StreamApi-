package Practice;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] a = {2,5,7,4,9};
		
		int n = a.length;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		for(int i  =0;i<n;i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		
		System.out.println(min+" "+max);

	}

}
