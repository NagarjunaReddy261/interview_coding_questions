package interview.ques;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleEx {

	public static void main(String[] args) {
		//Input String: "abcdABCDabcd"
		//Output: {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
		
		String input= "abcdABCDabcd";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] chars = input.toCharArray();
		String duplicateChars ="";
		
		for(char c:chars) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				duplicateChars = duplicateChars+c;
			} else {
				hm.put(c, 1);
			}
		}
		
		System.out.println("hm: "+hm);
		System.out.println("duplicateChars: "+duplicateChars);
		
		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map: "+map);
		
		String duplicates = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(c -> c.getValue()>1).map(e -> e.getKey().toString())
				.collect(Collectors.joining());
		System.out.println("duplicates: "+duplicates);
	}

}
