
public class primeNumber {

	
	public static boolean prime(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n = 13;
		
		// 2,3,5,7,11,13
		
		
		
		for(int i =2;i<=n;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
