import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class longestSubstringWithoutRepeating {

	public static void main(String[] args) {
		
		String s = "geeksforgeeks";
		
		Set<Character>st = new HashSet<>();
		int left = 0;
		int start = 0;
		int maxLen = Integer.MIN_VALUE;
		
		for(int right =0;right<s.length();right++) {
			
			while(st.contains(s.charAt(right))) {
				st.remove(s.charAt(left));
				left++;
			}
			st.add(s.charAt(right));
			if(right -left +1 > maxLen) {
				maxLen = right-left+1;
				start = left;
			}
		}
		System.out.println(maxLen);
		System.out.println(s.substring(start,start+maxLen));
	}

}
