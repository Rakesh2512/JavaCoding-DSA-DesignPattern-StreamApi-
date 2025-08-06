package Practice;

public class Palindrome {
	
	public static String Palindrome(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		
		String s = "rar";
		
		String p = Palindrome(s);
		
		if(s.equals(p)) {
			System.out.println("This is Plaindrome");
		}
		else {
			System.out.println("This is not Plaindrome");
		}

	}

}
