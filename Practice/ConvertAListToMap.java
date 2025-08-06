package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertAListToMap {

	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("Rakesh","paswan","Vikash","Raj","paswan");
		
//		Map<String,Integer> mp = l.stream().collect(Collectors.toMap(Function.identity(), String::length));
//		
//		
//		mp.forEach((key,value) -> {System.out.println(key+" "+value);});
		
		//Remove Duplicate from list
		
		
		List<String>duplicate = l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(duplicate);
	}

}
