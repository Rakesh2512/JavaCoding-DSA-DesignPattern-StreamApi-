import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		
		String s = "rakresha";
	//rakesh
		
		Set<Character>st = new HashSet<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<s.length();i++) {
			if(!st.contains(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
			st.add(s.charAt(i));
		}
		
		System.out.println(sb.toString());

	}

}
