package Practice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a  = {1,2,3,4,5};
		
		int n = a.length-1;
		
		for(int i = n;i>=0;i--) {
			System.out.print(a[i] +" ");
		}

	}

}
