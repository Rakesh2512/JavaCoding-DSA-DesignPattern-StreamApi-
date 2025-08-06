import java.util.LinkedHashMap;
import java.util.Map;

public class StringComparision {

	public static void main(String[] args) {
		
		String s = "aaabbccccd";
		
		Map<Character,Integer>mp = new LinkedHashMap<>();
		
		for(int i =0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			mp.put(c, mp.getOrDefault(c,0)+1);
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> it : mp.entrySet()) {
			sb.append(it.getKey()).append(String.valueOf(it.getValue()));
		}
		
		System.out.println(sb.toString());
	}

}
