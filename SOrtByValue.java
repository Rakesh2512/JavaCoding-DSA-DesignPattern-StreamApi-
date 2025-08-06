import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SOrtByValue {

	public static void main(String[] args) {
		
		int[] a = {1,1,2,3,3,3,3,4,4,4};
		
		HashMap<Integer,Integer>mp = new HashMap<>();
		
		for(int i =0;i<a.length;i++) {
			mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
		}
		
		List<Map.Entry<Integer,Integer>> l = new ArrayList<Map.Entry<Integer,Integer>>(mp.entrySet());
		
		
//		Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
//
//			@Override
//			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//				
//				return o2.getValue().compareTo(o1.getValue());
//			}
//		});
		
		
		Collections.sort(l, (l1,l2) -> l1.getValue().compareTo(l2.getValue()));
		
		Map<Integer,Integer>ans = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, Integer> it: l) {
			ans.put(it.getKey(),it.getValue());
		}
		
		System.out.println(ans);
		

	}

}
