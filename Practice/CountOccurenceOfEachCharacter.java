package Practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachCharacter {

	public static void main(String[] args) {
		
		String s = "rakesh";
		
		Map<Character,Integer>mp = new HashMap<>();
		
		
		for(int i =0;i<s.length();i++) {
			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> it : mp.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

}
