package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		
		//Longest String of list
		
		List<String>l = Arrays.asList("Applie","Banana","Mangoe","Guava","Pineapple");
		
		Optional<String>longest = l.stream().max(Comparator.comparing(String::length));
		
		System.out.println(longest.get());
		
		//Merge Two list
		
		List<Integer>l1 = Arrays.asList(1,3,4,8);
		List<Integer>l2 = Arrays.asList(4,6,2,9);
		
		List<Integer>merge = Stream.concat(l1.stream(), l2.stream()).sorted().collect(Collectors.toList());
		
		System.out.println(merge);
		
		//Intersection of Two list
		
		List<Integer>intersection = l1.stream().filter(l2::contains).collect(Collectors.toList());
		
		System.out.println(intersection);
		
		//remove duplicate
		
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		
		List<Integer>removeDuplicate = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
		
		System.out.println(removeDuplicate);
		
		//Find the kth smallest element in an array using Java streams:
		
		int[] array = {4, 2, 7, 1, 5, 3, 6};
		int smallest = Arrays.stream(array).sorted().skip(3-1).findFirst().orElse(-1);
		System.out.println(smallest);
		
		List<Integer>arra = Arrays.asList(4,2,7,1,5,3,6);
		
		int sm = arra.stream().sorted().skip(3-1).findFirst().orElse(-1);
		System.out.println(sm);
		
		//Given a list of strings, find the frequency of each word using Java streams:
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
                "banana", "apple");
		
		Map<String,Long>fr = words.stream().collect(Collectors.groupingBy(f->f,Collectors.counting()));
		
		System.out.println(fr);
	}

}
