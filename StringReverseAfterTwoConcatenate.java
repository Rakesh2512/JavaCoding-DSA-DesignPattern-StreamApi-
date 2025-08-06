
public class StringReverseAfterTwoConcatenate {

	public static void reverse(String ans) {
		
		char[] c = ans.toCharArray();
		
		int l  =0;
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
		
		String s1 = "rakesh";
		String s2 = "forGeeks";
		
		String ans ="";
		for(int i =0;i<s1.length();i++) {
			ans+=s1.charAt(i);
		}
		
		for(int i =0;i<s2.length();i++) {
			ans+=s2.charAt(i);
		}
		
		reverse(ans);
		System.out.println(ans);

	}

}
