package interview.ques;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "3", "7", "11", "9", "12", "6");
		
        Collections.sort(list, (s1, s2) -> {
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                return Integer.compare(i1, i2);
        });
        
        System.out.println(list);
        
        List<String> strings = Arrays.asList("room1.2", "foo1.1", "foo", "room2.3", "room100.999", "room10", "room.3");

        strings = strings.stream()
        		.map(s -> s.replaceAll("[^\\d.]", ""))
        		.map(s -> {
        			if(s.startsWith(".")) {
        				return s.replace(".", "");
        			}
					return s;
        		}).collect(Collectors.toList());
        System.out.println(strings);
	}

}
