package Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SorthashMapByValue {

	public static Map<String,Integer>solve(Map<String,Integer> mp){
		
		List<Map.Entry<String,Integer>> l = new LinkedList<Map.Entry<String,Integer>>(mp.entrySet());
		
		Collections.sort(l,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		
		Map<String,Integer> ans = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> it : l) {
			ans.put(it.getKey(), it.getValue());
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		Map<String,Integer>hm = new HashMap<>();
		
		hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        
        
        Map<String,Integer> ans = solve(hm);
        
        
        for(Map.Entry<String,Integer> it : ans.entrySet()) {
        	System.out.println(it.getKey()+" "+it.getValue());
        }
	}

}
