import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CounteIntegerOccurence {

	
	public static void main(String[] args) {
		
		
		Map<Integer,Integer>mp = new LinkedHashMap<>();
		
		int[] a = {12,3,3,4,1,4,5,12};
		
		for(int i =0;i<a.length;i++) {
			
			mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
			
			System.out.println(it.getKey()+"  occurs "+it.getValue()+" times");
		}
		
		//how to sort he map by value
		
		List<Map.Entry<Integer, Integer>>l = new ArrayList<>(mp.entrySet());
		
		Collections.sort(l,new Comparator<Map.Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		
		LinkedHashMap<Integer,Integer>lmp = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
			
			lmp.put(it.getKey(), it.getValue());
		}
		
		System.out.println(lmp);
		
		
		
		//sort my stram api
		
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		
		
		
		
		
		
	}

}
