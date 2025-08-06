package Stream;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice1 {

	public static void main(String[] args) {
		
		String s = "swiss";
		
		Optional<Character> o = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(v -> v.getValue() == 1)
		.map(k->k.getKey())
		.findFirst();
		
		
		System.out.println(o.get());
		

	}

}
