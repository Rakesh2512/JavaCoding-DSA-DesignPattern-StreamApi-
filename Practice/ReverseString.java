package Practice;

public class ReverseString {

	
	public static void reverse(char[] c) {
		int l = 0;
		int r = c.length-1;
		
		while(l<=r) {
			char ch = c[l];
			c[l] = c[r];
			c[r] = ch;
			l++;
			r--;
		}
	}
	public static void main(String[] args) {
		
		String s = "rakesh";
		
		String ans = "";
		
		char[] c = s.toCharArray();
		
		reverse(c);
		
		ans = new String(c);
		System.out.println(ans);

	}

}
