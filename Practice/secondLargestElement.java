package Practice;

public class secondLargestElement {

	public static void main(String[] args) {
		int[] a = {2,6,4,9,1};
		
		int firstLargest = -1;
		int secondLargest = -1;
		
		for(int i =0;i<a.length;i++) {
			if(a[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = a[i];
			}
			else if(a[i] < firstLargest && a[i] > secondLargest) {
				secondLargest = a[i];
				
			}
		}
		System.out.println(secondLargest);

	}

}
