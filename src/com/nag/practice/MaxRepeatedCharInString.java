package interview.ques;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedCharInString {

	public static void main(String[] args) {
		String str = "nagarjuna";
		
		Map<Character, Long> charMap = str.chars()
				                       .mapToObj(c -> (char)c)
		                               .collect(Collectors.groupingBy(Function.identity(), 
		                            		                         Collectors.counting()));
        System.out.println("charMap: "+charMap);
        
        Entry<Character, Long> res = charMap.entrySet()
        		.stream().collect(Collectors.maxBy(Map.Entry.comparingByValue())).get();
		System.out.println("res: " +res);
		
		Entry<Character, Long> maxRepeatedChar = str.chars()
        .mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().collect(Collectors.maxBy(Map.Entry.comparingByValue())).get();
		System.out.println("maxRepeatedChar: " +maxRepeatedChar);
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] chars = str.toCharArray();
		for(char c:chars) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		int max=0;
		char maxChar='x';
		for(Entry<Character, Integer> entry: map.entrySet() ) {
			//System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
			if(max<entry.getValue()) {
				//System.out.println("max: "+max+", maxChar: "+maxChar);
				max = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		
		System.out.println("char: "+ maxChar + ", max repeats: "+ max);	
		
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println("s1: "+System.identityHashCode(s1));
		System.out.println("s2: "+System.identityHashCode(s2));
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		
		String str1 = "java";
		String str2 =  new String("java");
		str1.concat("hello");
		
		System.out.println("str1: "+str1+", identityHashCode: "+str1.hashCode());
		System.out.println("str2: "+str2+", identityHashCode: "+str2.hashCode());
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	}

}
