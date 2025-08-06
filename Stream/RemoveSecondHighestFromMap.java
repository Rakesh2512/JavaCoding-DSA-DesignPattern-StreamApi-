package Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveSecondHighestFromMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
        map.put("A", 40);
        map.put("B", 10);
        map.put("C", 20);
        map.put("D", 30);
        map.put("E", 30); // duplicate value
        
        List<Integer>l = map.values().stream().distinct().sorted(Comparator.reverseOrder()).toList();
        
        System.out.println(l);
        
        int secondHighest = l.get(1);
        
        map.entrySet().removeIf(e -> e.getValue() == secondHighest);
        
        System.out.println(map);
        
        

	}

}
