package Practice;

public class FactorialOfNumber {

	
	public static int fact(int n) {
		if(n<=1) {
			return n;
		}
		return fact(n-1) * fact(n-2);
	}
	public static void main(String[] args) {
		
		int n = 5;
		
		int ans = fact(n);
		
		System.out.println(ans);
	}

}
