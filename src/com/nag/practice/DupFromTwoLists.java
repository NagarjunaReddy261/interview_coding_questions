package interview.ques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupFromTwoLists {

	public static void main(String[] args) {
		List<String>  list1 = Arrays.asList("A", "B", "C", "D");
		List<String>  list2 = Arrays.asList("1", "2", "3", "4", "A", "B", "C");
		
		List<String> result = Stream.of(list1, list2)
				              .flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println("result: "+result);
        
        List<String>  list3 = Arrays.asList("ABCD");
      	List<String>  list4 = Arrays.asList("1234ABC");

      	//StringBuffer res = new StringBuffer();
      	String str = Stream.of(list3, list4).flatMap(List::stream).collect(Collectors.joining());
      	System.out.println("str: "+str);
      	String res = str.chars().distinct().mapToObj(i -> (char) i).map(c -> c.toString()).collect(Collectors.joining());
      	System.out.println("res: "+res);
	}

}
