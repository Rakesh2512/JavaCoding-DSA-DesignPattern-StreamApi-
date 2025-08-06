package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice2 {

	public static void main(String[] args) {
		
		
		String s = "abcdab";
		
		//Count of occurence of string
		
//		Map<Character,Long> co = s.chars().mapToObj(c -> (char)c)
//		.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
//		
//		System.out.println(co);
		
		
		//Find all duplicate element from given string
		
		List<Character>duplicate = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(v -> v.getValue()>1)
				.map(k -> k.getKey())
				.collect(Collectors.toList());
		
		
		System.out.println(duplicate);
		
		int[] a = {1,2,7,5,3};
		
		// find the second highest number from an array
		
		int secondHighest = Arrays.stream(a).boxed().sorted((aa,bb) -> bb - aa).skip(1).findFirst().orElse(-1);
		
		
		System.out.println(secondHighest);
		
		List<Integer>l = Arrays.asList(1,2,7,5,3);
		
		int second = l.stream().sorted((aa,bb) -> bb - aa).skip(1).findFirst().orElse(-1);
		System.out.println(second);
		
		
		//find the longest string from given array
		
		String[] st = {"Rakesh","Paswan","apple","GeeksForGeeks"};
		
		String ans = Arrays.stream(st).sorted((aa,bb) -> bb.length() - aa.length()).findFirst().orElse(null);
		System.out.println(ans);
		
		
		//find the even number from an array
		
		
		
		
//		List<Integer>ans = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		int rs = ans.stream()
//				.reduce(0,Integer::sum);
//		
//		System.out.println(rs);
//		
//		List<String>word = Arrays.asList("a","bbb","ccc","ddd");
//		Map<Integer,List<String>> leng = word.stream().collect(Collectors.groupingBy(String::length));
//		
//		System.out.println(leng);
//		
//		Map<String,Integer>countOfEachString = word.stream().collect(Collectors.toMap(Function.identity(), String::length));
//		System.out.println(countOfEachString);

	}

}
