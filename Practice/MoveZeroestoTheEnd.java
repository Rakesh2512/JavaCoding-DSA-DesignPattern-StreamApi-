package Practice;

public class MoveZeroestoTheEnd {

	public static void main(String[] args) {
		
		int[] a = {1,0,5,0,3,7};
		
		int index = 0;
		int n = a.length;
		
		for(int i =0;i<n;i++) {
			if(a[i] != 0) {
				a[index] = a[i];
				index++;
			}
		}
		
		while(index < n) {
			a[index] = 0;
			index++;
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
