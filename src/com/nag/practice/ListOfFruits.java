package interview.ques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfFruits {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Apple", "Banana");
		
		Map<String, Long> map = fruits.stream()
				                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map: "+ map);
		
		Map<String, Long> hm = map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("hm-> "+hm);
		
		Map<String, Long> result2 = new LinkedHashMap<>();
		map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(x -> result2.put(x.getKey(), x.getValue()));
		System.out.println(result2);
	}

}
