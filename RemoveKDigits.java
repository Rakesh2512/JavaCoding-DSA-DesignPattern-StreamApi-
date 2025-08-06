import java.util.Stack;

public class RemoveKDigits {

	
	public static String Remove(String s,int k) {
		
		Stack<Character>st = new Stack<>();
		
		for(int i = 0;i<s.length();i++) {
			
			while(!st.isEmpty() && s.charAt(i) < st.peek() && k > 0){
				st.pop();
				k--;
			}
			st.add(s.charAt(i));
		}
		
		
		// if k is still left
		
		while(!st.isEmpty() && k > 0) {
			st.pop();
			k--;
		}
	
		l
		StringBuilder sb = new StringBuilder();
		
		while(!st.isEmpty()) {
			char c = st.peek();
			st.pop();
			sb.append(c);
		}
		
		sb.reverse();
		while(sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		
		return sb.toString();
		
		
	}
	public static void main(String[] args) {
		
		String s = "1432219";
		int k = 3;
		
		String ans = Remove(s,k);
		System.out.print(ans);

	}

}
