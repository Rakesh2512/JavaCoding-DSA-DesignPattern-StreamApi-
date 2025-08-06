import java.util.Arrays;

public class similarStringCheck {

	
	public static String solve(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(n);
		
		int num = n;
		
		while(num > 0) {
			int rem = num%2;
			sb.append((char)('0'+rem));
			num/=2;
		}
		
		sb.reverse();
		return sb.toString();
		
		
	}
	public static boolean similar(String s, String t) {
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return new String(c1).equals(new String(c2));
		
	}
	public static void main(String[] args) {
		
		String s ="abcd";
		String t = "dcab";
		
		
		if(similar(s,t)) {
			String binary = solve(s.length());
			
			System.out.println(binary);
		}
		else {
			System.out.println(0);
		}

	}

}
