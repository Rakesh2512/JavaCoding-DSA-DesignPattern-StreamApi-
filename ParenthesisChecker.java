import java.util.Stack;

public class ParenthesisChecker {

	public static boolean isBalanced(String s) {
		
		if(s.length() == 0) {
			return true;
		}
		
		Stack<Character>st = new Stack<>();
		
		for(int i =0;i<s.length();i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				else {
					char c = st.pop();
					if(c == '{' && s.charAt(i) == '}') {
						continue;
					}
					else if(c == '(' && s.charAt(i) == ')') {
						continue;
					}
					else if(c == '[' && s.charAt(i) == ']') {
						continue;
					}
					else {
						return false;
					}
				}
			}
		}
		
		if(st.isEmpty()){
            return true;
        }
        return false;
	}
	public static void main(String[] args) {
		String s1 = "{[()]}";
		
		String s2 = "{[(]}}";
		
		String s3 = "((a+b)*c)";
		
		System.out.println(isBalanced(s1));
		System.out.println(isBalanced(s2));
		System.out.println(isBalanced(s3));

	}

}
