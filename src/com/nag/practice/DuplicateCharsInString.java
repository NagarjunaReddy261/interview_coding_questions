package interview.ques;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String str = "nagarjuna";
		
		List<Character> duplicates = str.chars().mapToObj(i -> (char) i)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("duplicates: "+ duplicates);
		
		List<Character> distincts = str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(c -> c.getValue() < 2).map(Map.Entry::getKey).collect(Collectors.toList());

	   System.out.println("distincts: "+ distincts);
	}

}
