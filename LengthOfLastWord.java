
public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "Hello World";
		s.trim();
		
		System.out.println(s);
		int count = 0;
		
		int n = s.length();
		
		for(int i = n-1;i>=0;i--) {
			
			if(s.charAt(i) != ' ') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
