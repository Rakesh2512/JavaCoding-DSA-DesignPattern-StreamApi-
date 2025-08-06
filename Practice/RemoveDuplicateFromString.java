package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		List<String>fruit = Arrays.asList("apple","mangoe","grapes","pineapple","apple","grapes");
		
		Set<String>st = new HashSet<>();
		
		for(String w : fruit) {
			if(!st.contains(w)) {
				st.add(w);
			}
		}
		
		System.out.println(st);
	}

}
